public class PizzaBuilder implements Builder<Pizza> {
    private Pizza pizza;

    public PizzaBuilder(){
        pizza = new Pizza();
    }

    /**
     * Metoda do ustawiania promienia pizzy
     * @param radius promien pizzy
     * @return Wskaznik na aktualny stan obiektu
     */
    public PizzaBuilder setRadius(double radius) {
        if(radius <= 0){
            throw new IllegalArgumentException("Promien pizzy niedozwolony");
        }

        this.pizza.setRadius(radius);

        return this;
    }

    /**
     * Metoda kreujca produkt na podstawie usawianych wartosci
     * @return produkt finalny
     */
    @Override
    public Pizza build(){
        return pizza;
    }

    /**
     * Metoda do ustawiania rozmiaru pizzy
     * @param sizeType Typ rozmiaru dla pizzy
     * @return Wskaznik na aktualny stan obiektu
     */
    public PizzaBuilder setSizeType(SizeType sizeType) {
        if(sizeType == null){
            throw new NullPointerException("Parametr niedozwolony");
        }

        this.pizza.setSize(sizeType);

        return this.setRadius(10);
    }

    /**
     * Metoda sprawdza rodzaj ciasta
     * @param doughType wybiera rodzaj ciasta na pizze
     * @return zwraca rodzaj referencje
     */
    public PizzaBuilder setDough(DoughType doughType) {
        if (doughType==null) {
            throw new NullPointerException();
        }
        return this;
    }
}
