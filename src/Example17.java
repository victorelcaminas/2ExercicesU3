import java.util.Scanner;
public class Example17 {
    public static void main(String argv[]) {
        int hour, minutes, seconds, addingtime;
        System.out.println("Enter hour: ");
        System.out.println("Enter minutes: ");
        System.out.println("Enter seconds: ");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        hour = inputValue.nextInt();
        minutes = inputValue.nextInt();
        seconds = inputValue.nextInt();

        addingtime = seconds + 1;

        if (addingtime >= 60) {
            seconds = 0;
            minutes = minutes + 1;
        } else {
            if (seconds < 60) {
                seconds = seconds + 1;
            }
        }

        if (minutes >= 60) {
            minutes = minutes - 60;
            hour = hour + 1;
        }

        System.out.println("The time is: " + hour + ":" + minutes + ":" + seconds);
    }
}