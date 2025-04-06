public abstract class Car_inventory_system {
    protected String vinNumber;
    protected String make;
    protected String model;
    protected int mileage;

    public Car_inventory_system(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public abstract String getInfo();

}
