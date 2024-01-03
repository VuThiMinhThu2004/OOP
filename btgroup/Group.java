public class Group<T extends Comparable<T>> {
    private T d1;
    private T d2;
    private T d3;

    public Group(T d1, T d2, T d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public static <T extends Comparable<T>> T getMax(Group<T> c) {
        T max = c.d1;
        if (c.d2.compareTo(max) > 0) {
            max = c.d2;
        }
        if (c.d3.compareTo(max) > 0) {
            max = c.d3;
        }
        return max;
    }

    public static void main(String[] args) {
        Group<Integer> g = new Group<>(5, 6, 7); // Specify the type for Group object
        Integer max = Group.getMax(g); // Calling getMax() method
        System.out.println("Max value: " + max); // Printing the max value
    }

    public T getd1() {
        return d1;
    }

    public T getd2() {
        return d2;
    }

    public T getd3() {
        return d3;
    }
}
