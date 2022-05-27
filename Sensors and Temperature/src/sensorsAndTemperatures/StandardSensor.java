package sensorsAndTemperatures;

public class StandardSensor implements Sensor {

    private int value;
    private boolean on;

    public StandardSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void setOn() {
        this.on = true;        
    }

    @Override
    public void setOff() {
        this.on = false;
    }

    @Override
    public int read() {
        if (isOn() == false) {
            throw new IllegalStateException("This sensor is currently offline!");
        }
        return this.value;
    }

}