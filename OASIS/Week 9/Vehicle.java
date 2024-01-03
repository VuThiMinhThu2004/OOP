public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * An especially short bit of Javadoc.
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public abstract String getInfo();

    /**
     * An especially short bit of Javadoc.
     */
    public void transferOwnership(Person newOwer) {
        this.owner = newOwer;
    }

    public String getBrand() {
        return brand;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Person getOwner() {
        return owner;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public static void main(String[] args) {

    }
}