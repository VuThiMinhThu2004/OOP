public class File implements BaseComponent{
    public String capacity;
    public String type;

    @Override
    public int getSize() {
        return 1;
    }
}

cau 2: 2020-2021
a
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Một phép chia cho 0 để gây ra ngoại lệ ArithmeticException
            System.out.println("Result: " + result); // Dòng này sẽ không được thực thi
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage()); // In ra thông báo lỗi
        } finally {
            System.out.println("Finally block always executes"); // Mã trong finally luôn được thực thi
        }
    }
}
b. 
// Định nghĩa một giao diện Shape
interface Shape {
    void draw();
}

// Lớp Circle triển khai giao diện Shape
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

// Lớp Rectangle triển khai giao diện Shape
class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Lớp với phương thức sử dụng giao diện làm tham số
class Drawing {
    public void drawShape(Shape shape) {
        shape.draw(); // Gọi phương thức draw của giao diện Shape
    }
}

// Sử dụng phương thức drawShape với các đối tượng Circle và Rectangle
public class InterfaceExample {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        
        drawing.drawShape(circle);     // Output: Drawing Circle
        drawing.drawShape(rectangle);  // Output: Drawing Rectangle
    }
}
