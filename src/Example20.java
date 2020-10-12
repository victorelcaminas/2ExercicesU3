import java.util.Scanner;
public class Example20 {
    public static void main(String argv[]) {
        int year;
        System.out.println("Enter year: ");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        year = inputValue.nextInt();

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Leap year " + year);
        } else {
             System.out.println("Is not a leap year " + year);
         }
        }


    }