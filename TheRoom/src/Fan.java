public class Fan {
    private int noOfBlades;
    private String color;
    private String manufacturer;

    public Fan(int noOfBlades, String color, String manufacturer) {
        this.noOfBlades = noOfBlades;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    public void state(String power) {
        System.out.println("The Fan is switched " + power);
    }

    public int getNoOfBlades() {
        return noOfBlades;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
