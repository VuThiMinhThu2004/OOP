import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Week8Task2 {
    /**
     * javadoc.
     */
    public static void nullPointerEx() {
        String str = "";
        System.out.print(str);
    }

    /**
     * javadoc.
     */
    public static String nullPointerExTest() throws NullPointerException {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }

        return "Lỗi Null Pointer";
    }

    /**
     * javadoc.
     */
    public static void arrayIndexOutofBoundsEx() {
        int[] arr = {0, 1, 2};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * javadoc.
     */
    public static String arrayIndexOutOfBoundsExTest() throws ArrayIndexOutOfBoundsException {
        try {
            arrayIndexOutofBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }

        return "Lỗi Array Index Out of Bounds";
    }

    /**
     * javadoc.
     */
    public static void arithmeticEx() {
        int a = 10;
        int b = 1;
        System.out.println(a / b);
    }

    /**
     * javadoc.
     */
    public static String arithmeticExTest() throws ArithmeticException {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Lỗi Arithmetic";
    }
 
    /**
     * javadoc.
     */
    public static void fileNotFoundEx(String path) throws FileNotFoundException, IOException {
        FileReader file = new FileReader("testcase.txt");
        BufferedReader buffered = new BufferedReader(file);
    }
    
    /**
     * javadoc.
     */
    public static String fileNotFoundExTest() {
        try {
            fileNotFoundEx("testcase.txt");
        } catch (IOException e) {
            return "Lỗi File Not Found";
        }
        return "Lỗi File Not Found";
    }

    /**
     * javadoc.
     */
    public static void ioEx() throws IOException {
        FileWriter file = new FileWriter("fileName");
        file.write("Yes");
        file.close();
    }

    /**
     * javadoc.
     */
    public static String ioExTest() {
        try {
            ioEx();
        } catch (IOException ioException) {
            return "Lỗi IO";
        }
        return "Lỗi IO";
    }

    /**
     * javadoc.
     */
    public static void main(String[] args) {
        System.out.println(nullPointerExTest());
        System.out.println(arrayIndexOutOfBoundsExTest());
        System.out.println(arithmeticExTest());
        System.out.println(fileNotFoundExTest());
        System.out.println(ioExTest());
    }
}