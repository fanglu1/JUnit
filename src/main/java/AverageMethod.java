import java.util.Scanner;

public class AverageMethod {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alright Matt, last one.");
        System.out.println("I need a number:");
        double num = scanner.nextDouble();
        System.out.println("Another one(number):");
        double num2 = scanner.nextDouble();
        System.out.println("Alright, last one:");
        double num3 = scanner.nextDouble();
        System.out.println("The average is: " + average(sum(num, num2, num3)));
    }
    public static double sum (double num, double num2, double num3) {
        return (num + num2 + num3);
    }
    public static double average(double sum) {
        return (sum/3);
    }
}
