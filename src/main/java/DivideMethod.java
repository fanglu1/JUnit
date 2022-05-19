import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number");
        double num = scanner.nextDouble();
        System.out.println("Type another number");
        double num2 = scanner.nextDouble();
        divide(num, num2);
    }
    public static double divide(double num, double num2) {
        return num / num2;
    }
}
