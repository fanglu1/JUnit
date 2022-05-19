import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

    }
    public static String getInput(){
        Scanner input = new Scanner(System.in);

        System.out.println("What's your name?");

        String text = input.nextLine();

        return "Hi " + text;
    }
}