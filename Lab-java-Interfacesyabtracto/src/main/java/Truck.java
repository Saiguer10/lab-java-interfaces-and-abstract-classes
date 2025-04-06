public class Truck extends Car_inventory_system {

    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public String getInfo() {
        return "Truck - VIN: " + vinNumber + ", Make: " + make + ", Model: " + model + ", Mileage: " + mileage +
              ", Towing Capacity: " + towingCapacity + " tons";
    }
}
