import java.util.Scanner;

public class NumberStatsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextInt();

        double sum = num1+num2+num3;
        System.out.println("sum = "+sum);

        double multiplication = num1*num2*num3;
        System.out.println("multiplication = "+multiplication);

        double average = (num1+num2+num3)/3;
        System.out.println("average = "+average);
    }
}
