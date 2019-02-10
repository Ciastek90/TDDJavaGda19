import org.junit.Assert;
import org.junit.Test;

public class PizzaBuilderTests {
    @Test(expected = IllegalArgumentException.class)
    public void build_setRadiusNegtitive5_IllegalArgumentException(){
        PizzaBuilder builder = new PizzaBuilder();

        builder.setRadius(-5.0);
    }

    @Test
    public void build_setRadius100_PizzaRadius100(){
        final double expected = 100;

        Pizza pizza = new PizzaBuilder().setRadius(100).build();
        final double actual = pizza.getRadius();

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test(expected = NullPointerException.class)
    public void build_setSizeTypeNull_NullPionterException(){
        new PizzaBuilder().setSizeType(null);
    }

    @Test
    public void build_setSizeLarge_PizzaSizeTypeLarge(){
        final SizeType expected = SizeType.Large;
        final Pizza pizza = new PizzaBuilder()
                .setSizeType(SizeType.Large)
                .build();

        final SizeType actual = pizza.getSize();

        Assert.assertEquals(expected,actual);
    }
    @Test (expected = NullPointerException.class)
    public void build_setDoughTypeNull_NullPointerException() {
        new PizzaBuilder().setDough(null);
    }
}
