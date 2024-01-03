public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * An especially short bit of Javadoc.
     */
    public Car(String brand, String model,
            String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public String getInfo() {
        String info = "Car:\n";
        info += "\t" + "Brand: " + getBrand() + "\n";
        info += "\t" + "Model: " + getModel() + "\n";
        info += "\t" + "Registration Number: " + getRegistrationNumber() + "\n";
        info += "\t" + "Number of Doors: " + getNumberOfDoors() + "\n";
        info += "\t" + "Belongs to " + owner.getName() + " - " + owner.getAddress();

        return info;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
