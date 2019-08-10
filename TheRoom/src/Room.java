public class Room {
    private Cupboard cupboard;
    private Circuit circuit;
    private Bed bed;
    private Lamp lamp;

    public Room(Bed bed, Lamp lamp, Cupboard cupboard, Circuit circuit) {
        this.bed = bed;
        this.lamp = lamp;
        this.cupboard = cupboard;
        this.circuit = circuit;
    }

    public void switchOn() {
        circuit.switchOnFan();
        circuit.switchOffTubelight();
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom --> Making Bed");
        bed.make();
    }
}
