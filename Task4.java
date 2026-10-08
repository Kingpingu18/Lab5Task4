import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Age;
        System.out.print("Enter your age: ");
        Age = input.nextInt();
        if (Age >= 21) {
            System.out.print("You get a wristband");
        } else {
            System.out.print("No wristband for you friendo");
        }
    }
}
