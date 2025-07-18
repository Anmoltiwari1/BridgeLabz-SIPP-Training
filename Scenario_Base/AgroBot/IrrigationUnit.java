package AgroBot;
public abstract class IrrigationUnit implements SensorReadable {
    protected String unitId;

    public IrrigationUnit() {
        this("DefaultUnit"); // constructor chaining
    }

    public IrrigationUnit(String unitId) {
        this.unitId = unitId;
        calibrate();
    }

    private void calibrate() {
        System.out.println(unitId + ": Calibrating sensors...");
    }

    public abstract void startWatering();
}
