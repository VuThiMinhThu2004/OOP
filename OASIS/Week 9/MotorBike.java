public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * An especially short bit of Javadoc.
     */
    public MotorBike(String brand, String model,
            String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getInfo() {
        String info = "Motor Bike:\n";
        info += "\t" + "Brand: " + getBrand() + "\n";
        info += "\t" + "Model: " + getModel() + "\n";
        info += "\t" + "Registration Number: " + getRegistrationNumber() + "\n";
        info += "\t" + "Has Side Car: " + isHasSidecar() + "\n";
        info += "\t" + "Belongs to " + owner.getName() + " - " + owner.getAddress() + "\n";

        return info;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
