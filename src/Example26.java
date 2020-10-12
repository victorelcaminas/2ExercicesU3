import java.util.Scanner;
public class Example26 {
    public static void main(String argv[]) {
        int n;
        System.out.println("Input a number: ");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        n = inputValue.nextInt();

        System.out.println("The divisor of " + n + " are: ");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
