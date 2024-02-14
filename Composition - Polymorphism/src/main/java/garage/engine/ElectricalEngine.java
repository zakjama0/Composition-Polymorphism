package garage.engine;

public class ElectricalEngine implements IEngine {

    private int horsePower;
    private int batteryPercentage;

    public ElectricalEngine(int horsePower, int batteryPercentage){
        this.horsePower = horsePower;
        this.batteryPercentage = batteryPercentage;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
}