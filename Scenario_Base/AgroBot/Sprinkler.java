package AgroBot;
public class Sprinkler extends IrrigationUnit {
    public Sprinkler(String id) {
        super(id);
    }

    @Override
    public void startWatering() {
        System.out.println(unitId + ": Sprinkler starting water spray.");
    }

    @Override
    public void readSensorData() {
        System.out.println(unitId + ": Reading temperature and humidity data...");
    }
}
