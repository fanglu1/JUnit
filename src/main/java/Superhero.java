import java.util.Scanner;

public class Superhero {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(superheroName());
        System.out.println(superheroPower());
    }

    public static String superheroName() {
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String text = input.nextLine();
        return "Hi, my name is " + text;

}
public static String superheroPower() {
        System.out.println("What is their superpower?");
        String text2 = input.nextLine();
        return "My superpower is " + text2;
}
}