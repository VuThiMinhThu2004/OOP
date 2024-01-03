import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    /**
     * An especially short bit of Javadoc.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void addVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            return;
        }
        vehicleList.add(vehicle);
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(i);
            }
        }
    }

    /**
     * An especially short bit of Javadoc.
     */
    public String getVehiclesInfo() {
        String info = "";

        if (vehicleList.isEmpty()) {
            info = name + " has no vehicle!";
        } else {
            info = name + " has:\n\n";
            for (Vehicle it : vehicleList) {
                info += it.getInfo() + "\n";
            }
        }
        return info;
    }

    public String getName() {
        return name;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
