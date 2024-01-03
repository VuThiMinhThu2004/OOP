import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Week10Test {
    public static void main(String[] args) throws FileNotFoundException {
        Week10 temp = new Week10();
        String test = "E:\\OOP\\OASIS\\PhanTichChuongTrinh\\Huong.txt";
        FileInputStream fileInputStream = new FileInputStream(test);
        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder fileContent = new StringBuilder();
        while (scanner.hasNextLine()) fileContent.append(scanner.nextLine()).append("\n");
       // temp.testcase(test);
        List<String> results = temp.getAllFunctions(fileContent.toString());
        for (String result : results) System.out.println(result);
    }
}
