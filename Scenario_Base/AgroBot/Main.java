package AgroBot;
public class Main {
    public static void main(String[] args) {
        IrrigationUnit sprinkler = new Sprinkler("SP001");
        sprinkler.readSensorData();
        sprinkler.startWatering();

        IrrigationUnit drip = new DripSystem("DP001");
        drip.readSensorData();
        drip.startWatering();
    }
}
