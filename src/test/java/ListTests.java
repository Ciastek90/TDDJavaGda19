import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class ListTests {
    @Test
    public void add_mockedList_VerifyAddCall(){
        List realList = new ArrayList();
        List mockedList = mock(List.class);

        realList.add("one");
        mockedList.add("one");

        verify(mockedList).add("one");
    }

    @Test
    public void getPetNames_mockedPet_VerifyCallGetName(){
        Zoo zoo = new Zoo();
        Pet pet = mock(Pet.class);
        pet.setName("Ciastek");

        //String namePet = pet.getName();

        zoo.giveHomelessPet(pet);
        zoo.getPetNames();

        verify(pet).getName();
    }

    @Test
    public void getPetNames_mockedPetMockZoo_VerifyCallGetName(){
        Zoo zoo = mock(Zoo.class);
        Pet pet = mock(Pet.class);

        zoo.giveHomelessPet(pet);
        zoo.getPetNames();

        verify(pet).getName();
    }

    @Test
    public void get_mockedListReturnFirstIfGet0_first(){
        final String expected = "first";
        final List mockedList = mock(List.class);
        when(mockedList.get(0)).thenReturn("first");

        final String actual = (String)mockedList.get(0);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getPetNames_mockedPetNameZnajda_Znajda(){
        final String expected = "Znajda";
        final Zoo zoo = new Zoo();
        final Pet mockedPet = mock(Pet.class);
        when(mockedPet.getName()).thenReturn("Znajda")
                .thenReturn("Znajda1");

        zoo.giveHomelessPet(mockedPet);

        final String actual = zoo.getPetNames();

        Assert.assertEquals(expected,actual);
        final String name = mockedPet.getName();
        Assert.assertEquals("Znajda1", name);
    }
    @Test
    public void getPetNames_mockedPetpetGivenTwiceToZoo_verifyCallTwice(){
        final Zoo zoo = new Zoo();
        final Pet pet = mock(Pet.class);
        zoo.giveHomelessPet(pet);
        zoo.giveHomelessPet(pet);
        zoo.getPetNames();
        verify(pet,times(2)).getName();
    }


    @Test
    public void getPetNames_mockedPetgetNameMruczekGiveonesToZoo_Mruczek(){
        final Zoo zoo = new Zoo();
        final Pet pet = mock(Pet.class);
        final Pet pet2 = mock(Pet.class);
        when(pet.getName()).thenReturn("Mruczek");
        when(pet2.getName()).thenReturn("Mruczej");

        zoo.giveHomelessPet(pet);
        zoo.giveHomelessPet(pet2);
        String actual = zoo.getPetNames();

        Assert.assertEquals("Mruczek, Mruczej", actual);



    }
}
