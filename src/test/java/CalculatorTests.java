import Utils.FibonacciSeries;
import Utils.MultiplySeries;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.*;

@RunWith(JUnitParamsRunner.class)
public class CalculatorTests {

    @Test
    public void sum_a13b21_34(){
        //Arrange/Przygotuj
        final int expected = 34;

        //Act/Działaj(uruchom)
        final double actual = Calculator.sum(13,21);

        //Assert/Sprawdź
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void difference_aNegative5b20_Negative25(){
        final double expected = -25;

        final double acutal = Calculator.substraction(-5,20);

        Assert.assertEquals(expected,acutal, 0.001);
    }

    @Test
    public void multiply_a6b0_0(){
        final double expected = 0;

        final double actual = Calculator.multiply(6,0);

        Assert.assertEquals(expected,actual,0.0001);
    }
    @Test
    public void divide_a25_b5_5() {
        final double expected = 5;
        final double actual = Calculator.divide(25,5);
        Assert.assertEquals(expected,actual,0.001);
    }

    @Test
    public void divide_a25_b0_IllegalArgumentExceptionTryCatch()
    {
        try {
            Calculator.divide(25,0);
            Assert.fail("Wyjątek nie został rzucony");
        } catch (IllegalArgumentException e){
            //System.out.println("Sukces");
            return;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void divide_a25_b0_IllegalArgumentExceptionExpected(){
        Calculator.divide(25,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void log__2_1_IllegalArgumentExceptionExpected(){
        Calculator.log(-2,1);
    }

    @Test(expected =  IllegalArgumentException.class)
    public void modulo_1_0_IllealArgumentException(){
        Calculator.modulo(1,0);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void divide_a2b0_IllegalArgumentException(){
        thrown.expect(IllegalArgumentException.class);
        Calculator.divide(2,0);
    }

    @Test
    public void divide_a5b0_IllegalArgumentException(){
        assertThatThrownBy(() -> { Calculator.divide(5,0); })
                .as("Sprawdzam dzielenie przez 0")
                .hasMessage("Ty cholero nie dziel przez 0");
    }

    @Test
    public void sum_a2b5_7(){
        assertThat(Calculator.sum(2,5))
                .isBetween(new Double(0),new Double(10));
    }

    @Test
    @Parameters({"1,2,3","2,3,5"})
    public void sum_parametric(double a, double b, double expected){
        assertThat(Calculator.sum(a,b)).isEqualTo(expected);
    }

    @Test
    @Parameters({"1,1","2,1","3,2","4,3","5,5","6,8", "7,13", "8,21", "9,34","10,55"})
    public void fibonaci_Parametric(int number, int expected){
        assertThat(Calculator.getFibonaciNumber(number)).isEqualTo(expected);
    }

    @Test
    @Parameters(method = "getFibonaciSeries")
    public void fibonaci_parametricByMethod(int number, int expected){
        assertThat(Calculator.getFibonaciNumber(number)).isEqualTo(expected);
    }

    public Object[] getFibonaciSeries(){
        return new Object[]{
                new Object[]{1,1},
                new Object[]{2,1},
                new Object[]{3,2},
                new Object[]{4,3},
                new Object[]{5,5},
                new Object[]{6,8},
                new Object[]{7,13},
                new Object[]{8,21},
                new Object[]{9,34},
                new Object[]{10,55}
        };
    }

    public double sumforTest(double a, double b){
        return a+b;
    }

    public Object[] seriesForSum(){
        Object[] tab = new Object[10];
        for(int i=0;i<10;i++) {
            tab[i] = new Object[]{i, i + 10, sumforTest(i, i + 10)};
        }

        return tab;
    }

    @Test
    @Parameters(method = "seriesForSum")
    public void sum_parametrizedByMethod(double a, double b, double expected){
        assertThat(Calculator.sum(a,b)).isEqualTo(expected);
    }
    @Test
    @Parameters(method = "differenceStuff")
    public void difference_parametrizedByMethod(double a,double b, double expected){
        assertThat(Calculator.substraction(a,b)).isEqualTo(expected);

    }

    public Object[] differenceStuff() {
        return new Object[]{
                new Object[]{
                        3, 2, 1
                },
                new Object[]{
                        4, 2, 2
                }
        };
    }

    @Test
    @Parameters(source = MultiplySeries.class)
    public void multiply_parametrizedByClass(double a, double b, double expected){
        assertThat(Calculator.multiply(a,b)).isEqualTo(expected);
    }
    @Test
    @Parameters(source = FibonacciSeries.class)
    public void fibonacci_parametrizedByClass(int a, int expected) {
        assertThat(Calculator.getFibonaciNumber(a)).isEqualTo(expected);
    }

    @Test
    public void power2AndSum_a5b10_35() {
        final double expected = 35;

        final double actual = Calculator.power2AndSum(5, 10);

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideBySquare_a100b0_ThrowIllegalArgumentException(){
        Calculator.divideBySquare(100.0,0.0);
    }

    @Test
    public void divideBySquare_a100b10_1(){
        final double expected = 1;

        final double actual = Calculator.divideBySquare(100,10);

        Assert.assertEquals(expected,actual,0.001);
    }
}
