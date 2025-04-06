public class UtilityVehicle extends Car_inventory_system {

    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public String getInfo() {
        return "UtilityVehicle - VIN: " + vinNumber + ", Make: " + make + ", Model: " + model + ", Mileage: "
                + mileage + ", 4WD: " + fourWheelDrive;

    }
}

