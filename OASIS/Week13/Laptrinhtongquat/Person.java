import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    public Person() {}

    /**
     * Thu vu comment Javadoc.
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    void setName(String ten) {
        name = ten;
    }

    void setAge(int tuoi) {
        age = tuoi;
    }

    void setAddress(String dd) {
        address = dd;
    }

    /**
     * Thu vu comment Javadoc.
     */
    public int compareTo(Person person) {
        if (this == person) {
            return 0;
        }

        int nameComparison = this.name.compareTo(person.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }

        return Integer.compare(this.age, person.getAge());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age 
                && Objects.equals(name, person.name) 
                && Objects.equals(address, person.address);
    }
}
