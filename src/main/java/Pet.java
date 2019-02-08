/**
 * Zwierzątko
 */
public class Pet {
    /**
     * Imię
     */
    private String name;

    /**
     * Waga
     */
    private double weight;

    /**
     * Wysokość
     */
    private double height;

    /**
     * Wiek
     */
    private int age;

    /**
     * Minimalna waga
     */
    private static final double MINWEIGHT = 1.0;

    /**
     * @return Wiek zwierzątka
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age Ustawia wiek zwierzątka
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return Wysokość zwierzątka
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height Ustawai wysokość zwierzątka
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return Waga zwierzątka
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight Ustawia wagę zwierzątka
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return Imię zwierzątka
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Ustawia imię zwierzątka
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Bmi zwirzątka
     */
    public double getBmi() {
        if(this.height <= 0){
            throw new IllegalStateException("Height can't be less or equal 0");
        }

        if(this.weight <= 0){
            throw new IllegalStateException("Weight can't be equal 0");
        }

        return this.weight/(this.height*this.height);
    }

    /**
     * @param amountOfFood Waga jedzenia dla zwierzątka podczas karmienia
     */
    public void feed(double amountOfFood) {
        if(amountOfFood <= 0)
        {
            throw new IllegalArgumentException("You can't feed pet with nothing it can be angry");
        }

        this.weight += amountOfFood;
    }

    /**
     * Usypianie zwierzątka
     */
    public void sleep() {
        if (isWeightToLow()) throw new IllegalStateException("Weight to low to sleep");
        this.weight -= MINWEIGHT;
        this.height += 0.1;
    }

    /**
     * @return Czy waga zwierzątka nie jest zbyt mała
     */
    private boolean isWeightToLow(){
        return this.weight <= MINWEIGHT;
    }
}
