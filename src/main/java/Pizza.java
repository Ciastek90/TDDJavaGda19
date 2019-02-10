import java.util.List;

public class Pizza {
    private double radius;
    private SizeType size;
    private DoughType dough;
    private double price;
    private String name;
    private int spiceLevel;
    private String description;
    private List<IngridientType> ingridients;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public SizeType getSize() {
        return size;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }

    public DoughType getDough() {
        return dough;
    }

    public void setDough(DoughType dough) {
        this.dough = dough;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(int spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<IngridientType> getIngridients() {
        return ingridients;
    }
}