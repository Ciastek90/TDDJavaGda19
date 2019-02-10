import org.junit.*;

public class PetTests {
    private Pet pet;

    @BeforeClass
    public static void GlobalSetup(){
        System.out.println("GlobalSetup");
    }

    @AfterClass
    public static void GlobalTearDown(){
        System.out.println("GlobalTearDown");
    }

    @Before
    public void Setup(){
        pet = new Pet();
        //opcjonalna
        pet.setName("Ciastek");
        System.out.println("Setup");
    }

    @After
    public void TearDown(){
        pet = null;
        System.out.println("TearDown");
    }

    @Test
    public void getName_settedNameCiastek_Ciastek(){
        System.out.println("getName_settedNameCiastek_Ciastek");
        final String expected = "Ciastek";

        final String actual = pet.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAge_defaultPet_0(){
        System.out.println("getAge_defaultPet_0");
        final int expected = 10;
        pet.setAge(10);

        final int actual = pet.getAge();

        Assert.assertEquals(expected,actual);
    }
}
