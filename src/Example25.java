import java.util.Scanner;
public class Example25 {
    public static void main (String argv[]) {
        int n;
        System.out.println("Input number: ");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        n = inputValue.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(n + " * " + i + " = " + n * i);
    }
}
