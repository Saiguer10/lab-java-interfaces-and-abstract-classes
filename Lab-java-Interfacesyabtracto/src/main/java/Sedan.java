
public class Sedan extends Car_inventory_system {
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);

    }

    public String getInfo() {
        return "Sedan - VIN: " + vinNumber + ", Make: " + make + ", Model: " + model + ", Mileage: " + mileage;
    }
}

