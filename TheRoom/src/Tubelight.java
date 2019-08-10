public class Tubelight {
    private int length;
    private String color;
    private int radius;
    private String manufacturer;

    public Tubelight(int length, String color, int radius, String manufacturer) {
        this.length = length;
        this.color = color;
        this.radius = radius;
        this.manufacturer = manufacturer;
    }

    public void state(String power) {
        System.out.println("The Tubelight is switched " + power);
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
