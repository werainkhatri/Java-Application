public class Circuit {
    private Fan fan;
    private int noOfSwitches;
    private Tubelight tubelight;

    public Circuit(Fan fan, int noOfSwitches, Tubelight tubelight) {
        this.fan = fan;
        this.noOfSwitches = noOfSwitches;
        this.tubelight = tubelight;
    }

    public void switchOnFan(){
        fan.state("On");
    }

    public void switchOffTubelight() {
        tubelight.state("Off");
    }
}
