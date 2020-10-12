import java.util.Scanner;
public class Example24 {
    public static void main (String argv[]) {
        int n, fact=1;
        System.out.println("Enter a number: ");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        n = inputValue.nextInt();

        for (int i=1; i<=n;i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
