
import java.util.Scanner;

public class Giaiptbac1 {

        public static void main(String[] args) {
            System.out.println("Linear Equation Resolver"); //In ra
            System.out.println("Given a equation as 'a * x + b = c', please enter constants:");// In ra
            Scanner scanner = new Scanner(System.in); //Khởi tạo Scanner
            System.out.print("a: "); // In ra
            double a = scanner.nextDouble(); // gán giá trị

            System.out.print("b: ");
            double b = scanner.nextDouble();

            System.out.print("c: ");
            double c = scanner.nextDouble();
        }
    }

