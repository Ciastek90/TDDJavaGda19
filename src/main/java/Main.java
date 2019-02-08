/**
 * Klasa główna
 */
public class Main {
    /**
     * @param args Argumnety które są dostarczane z wywołania konsoli
     */
    public static void main(String[] args) {
        Zoo z = new Zoo();
        Pet p = new Pet();
        p.setName("Dupa");
        z.giveHomelessPet(p);
        z.giveHomelessPet(p);

        System.out.println(z.getPetNames());
    }
}
