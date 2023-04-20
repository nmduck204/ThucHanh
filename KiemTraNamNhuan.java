import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Khởi tọa Scanner
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();// NHập giá trị từ bàn phím và gán giá trị
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("%d is a leap year", year);// thoa man dieu kien tra ve la nam nhuan
        } else {
            System.out.printf("%d is NOT a leap year", year);// in ra la nam ko nhuan
        }
    }
}