/**
 * Klasa do wykonywania działań matematycznych
 */
public final class Calculator {
    /**
     * @param numberA Pierwsza liczba wchodząca w skład działania
     * @param numberB Druga liczba wchodząca w skład działania
     * @return Suma dwóch liczb
     */
    public static double sum(double numberA, double numberB){
        return numberA + numberB;
    }

    /**
     * @param numberA Pierwsza liczba wchodząca w skład działania
     * @param numberB Druga liczba wchodząca w skład działania
     * @return Różnica dwóch liczb
     */
    public static double substraction(double numberA, double numberB){
        return numberA - numberB;
    }

    /**
     * @param multiplicand Mnożna
     * @param multiplier Mnożnik
     * @return Iloczyn dwóch liczb
     */
    public static double multiply(double multiplicand, double multiplier){
        return multiplicand * multiplier;
    }

    /**
     * @param dividend Dzielna
     * @param divider Dzielnik
     * @return Iloraz dwóch liczb
     */
    public static double divide(double dividend, double divider){
        if(divider == 0.0){
            throw new IllegalArgumentException("Ty cholero nie dziel przez 0");
        }

        return dividend / divider;
    }

    /**
     * @param number Liczba która zostanie podniesiona do potęgi
     * @param exponent Wykładnik potęgi
     * @return Liczba podniesiona do potęgi
     */
    public static double exponentiation(double number, double exponent) {
        if(number < 0.0 && exponent != 0.0 && exponent % 2 == 0){
            throw new IllegalArgumentException("To działanie jest dozwolone przy użyciu liczb urojonych");
        }

        return Math.pow(number, exponent);
    }

    /**
     * @param number Liczba która zostanie spierwiastkowana
     * @param degree Stopień pierwiastka
     * @return Spierwiastkowana liczba
     */
    public static double root(double number, double degree){
        if(degree == 0.0){
            throw new IllegalArgumentException("Ty cholero nie dziel przez 0");
        }

        return Math.pow(number, 1 / degree);
    }

    /**
     * @param number Liczba która zostanie "odwrócona"
     * @return Liczba odwrotna
     */
    public static double inverse(double number){
        if(number == 0.0){
            throw new IllegalArgumentException("Ty cholero nie dziel przez 0");
        }

        return 1 / number;
    }

    /**
     * @param number Liczba na podstawie której zostanie obliczona silnia
     * @return Slilnia z liczby
     */
    public static double factorial(int number){
        if(number < 0){
            throw new IllegalArgumentException("Nie ma silni z liczb ujemnych");
        }

        if(number == 0 || number == 1){
            return 1;
        }

        int aggregator = 1;
        for(int i = 1; i <= number; i++){
            aggregator *= i;
        }

        return aggregator;
    }

    /**
     * @param dividend Dzielna
     * @param divisor Dzielnik
     * @return Reszta z dzielenia
     */
    public static double modulo(double dividend, double divisor){
        if(divisor == 0.0){
            throw new IllegalArgumentException("W działaniu modulo dzielnik nie może być 0");
        }

        return dividend % divisor;
    }

    /**
     * @param number Liczba na podstawie której zostanie obliczony logarytm
     * @return Logarytm dziesiętny z liczby
     */
    public static double log10(double number){
        if(number <= 0.0){
            throw new IllegalArgumentException("Liczba logarytmowana musi być większa od 0");
        }

        return Math.log10(number);
    }

    /**
     * @param number Liczba na podstawie której zostanie obliczony logarytm
     * @param base Podstawa logarytmu
     * @return Wynik logarytmu o dowolnej podstawie
     */
    public static double log(double number, double base){
        if(number <= 0.0){
            throw new IllegalArgumentException("Liczba logarytmowana musi być większa od 0");
        }

        if(base <= 0.0){
            throw new IllegalArgumentException("Podstawa logarytmu musi być większa od 0");
        }

        if(number != 1.0){
            throw new IllegalArgumentException("Liczba logarytmowana musi być różna od 1");
        }

        return Math.log10(number) / Math.log10(base);
    }

    /**
     * @param number Liczba logarytmowana
     * @return Wynik logarytmu z liczby o podstawie e
     */
    public static double ln(double number){
        if(number <= 0.0){
            throw new IllegalArgumentException("Liczba logarytmowana musi być większa od 0");
        }

        return Math.log(number);
    }

    /**
     * @param degrees Stopnie
     * @return Wynik działania gunkcji tangens
     */
    public static double tan(double degrees){
        if((degrees + (Math.PI / 2.0)) % Math.PI == 0.0){
            throw new IllegalArgumentException("Taka liczba nie istnieje");
        }
        return Math.tan(degrees);
    }

    /**
     * @param degrees Stopnie
     * @return Wynik działania funkcji cosinus
     */
    public static double cos(double degrees){
        return Math.cos(degrees);
    }

    /**
     * @param degrees Stopnie
     * @return Wynik działania funkcji sinus
     */
    public static double sin(double degrees){
        return Math.sin(degrees);
    }

    /**
     * @param number Liczba na podstawie której zostanie wyznaczona liczba przeciwna
     * @return Liczba przeciwna
     */
    public static double additiveInverse(double number){
        final double inverseFactor = -1.0;
        return inverseFactor * number;
    }

    /**
     * @param n Identyfikator liczby fibonaciego
     * @return Liczba fibonaciego
     */
    public static int getFibonaciNumber(int n)
    {
        if(n < 0){
            throw new IllegalArgumentException("Liczby fibonaciego mozna obliczyć tylko z liczb dodatnich");
        }

        if(n <= 1)
        {
            return n;
        }

        return getFibonaciNumber(n-1) + getFibonaciNumber(n-2);
    }
}
