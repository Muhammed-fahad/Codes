import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a time (hh:mm): ");
        String time = scanner.nextLine();

        System.out.print("Enter time zone (am/pm): ");
        String timeZone = scanner.nextLine().toLowerCase();

        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        String minute = parts[1];

        if (timeZone.equals("am")) {
            if (hour == 12) {
                hour = 0;
            }
            System.out.printf("%02d:%s\n", hour, minute);
        } else if (timeZone.equals("pm")) {
            if (hour != 12) {
                hour += 12;
            }
            System.out.printf("%02d:%s\n", hour, minute);
        } else {
            System.out.println("Invalid time zone. Please enter 'am' or 'pm'.");
        }

        scanner.close();
    }
}
