public class Cupboard {
    private Dimension dimension;
    private String type;
    private String color;
    private int noOfDoors;

    public Cupboard(Dimension dimension, String type, String color, int noOfDoors) {
        this.dimension = dimension;
        this.type = type;
        this.color = color;
        this.noOfDoors = noOfDoors;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }
}
