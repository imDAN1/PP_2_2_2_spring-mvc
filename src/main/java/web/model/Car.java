package web.model;

public class Car {
    private String model;
    private int horsePower;
    private int doorCount;

    public Car(String model, int horsePower, int doorCount) {
        this.model = model;
        this.horsePower = horsePower;
        this.doorCount = doorCount;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(byte horsePower) {
        this.horsePower = horsePower;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
