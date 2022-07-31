package Methods;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour;

        System.out.println("what time is it? format: 24H");
        System.out.println("enter the hours: ");
        hour = scan.nextInt();
        System.out.println(response(hour));
    }

    public static String response(int hour) {

        if (hour < 17) {
            return "Good Morning";
        } else
            return "Good Night";
    }
};
