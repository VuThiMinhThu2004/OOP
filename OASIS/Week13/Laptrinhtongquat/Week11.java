import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Week11 {
    /**
     * Thu vu comment Javadoc.
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> a) {
        List<T> arr = new ArrayList<>();
        while (!a.isEmpty()) {
            T itemMin = a.get(0);
            for (T item : a) {
                if (itemMin.compareTo(item) > 0) {
                    itemMin = item;
                }
            }
            Iterator<T> iterator = a.iterator();
            while (iterator.hasNext()) {
                T item = iterator.next();
                if (itemMin.compareTo(item) == 0) {
                    iterator.remove();
                    arr.add(itemMin);
                }
            }
        }
        return arr;
    }

    /**
     * Thu vu comment Javadoc.
     */
    public static void main(String[] args) {
        // Tạo danh sách các đối tượng Person
        List<Person> people = new ArrayList<>();
        people.add(new Person("Thu", 20, "Lao Cai"));
        people.add(new Person("Chi", 19, "Bac Kan"));
        people.add(new Person("Thao", 20, "Bac Giang"));

        // Hiển thị danh sách trước khi sắp xếp
        System.out.println("Danh sách trước khi sắp xếp:");
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge() 
                                + " - " + person.getAddress());
        }

        // Sắp xếp danh sách sử dụng phương thức sortGeneric
        List<Person> sortedPeople = Week11.sortGeneric(people);

        // Hiển thị danh sách sau khi sắp xếp
        System.out.println("\nDanh sách sau khi sắp xếp:");
        for (Person person : sortedPeople) {
            System.out.println(person.getName() + " - " + person.getAge() 
                                + " - " + person.getAddress());
        }
    }
}
