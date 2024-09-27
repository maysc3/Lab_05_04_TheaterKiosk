import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;
        final int WRISTBAND_AGE = 21;
        System.out.print("Enter your age: ");
        if (in.hasNextInt())
        {
            age = in.nextInt();
            if (age >= WRISTBAND_AGE)
            {
                System.out.println("You're " + age + " you get a wristband.");
            }
        }
    }
}