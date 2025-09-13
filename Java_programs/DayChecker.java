import java.util.*;

public class DayChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day (e.g : Monday): ");
        String day = scanner.nextLine().trim();

        // lowercase me convert kar rahe hain taki "Monday" aur "monday" dono chal jaye
        day = day.toLowerCase();

        switch(day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(day + " is a Weekday.");
                break;

            case "saturday":
            case "sunday":
                System.out.println(day + " is a Weekend.");
                break;

            default:
                System.out.println("Invalid day entered!");
        }

        scanner.close();
    }
}