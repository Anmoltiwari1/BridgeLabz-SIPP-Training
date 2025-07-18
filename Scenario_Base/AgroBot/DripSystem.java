package AgroBot;
public class DripSystem extends IrrigationUnit {
    public DripSystem(String id) {
        super(id);
    }

    @Override
    public void startWatering() {
        System.out.println(unitId + ": Drip system starting slow irrigation.");
    }

    @Override
    public void readSensorData() {
        System.out.println(unitId + ": Reading soil moisture data...");
    }
}
