public class Main {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(15,20,10);
        Cupboard cupboard = new Cupboard(dimension, "Teak", "Maroon", 3);

        Fan fan = new Fan(4, "Red", "Bajaj");
        Tubelight tubelight = new Tubelight(5, "Yellow", 3, "Syska");
        Circuit circuit = new Circuit(fan, 6, tubelight);

        Bed bed = new Bed(4, 3, 2, 1, "Modern");

        Lamp lamp = new Lamp("Classic", false, 75);

        Room room = new Room(bed, lamp, cupboard, circuit);
        room.makeBed();
        room.switchOn();
        room.getLamp().turnOn();
    }

}
