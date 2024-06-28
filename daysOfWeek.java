import java.util.Scanner;
public class daysOfWeek {
    public static void main(String[] args) {
        System.out.println("Enter the day of the week (1-7): ");
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
        String dayName;
        switch(dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("days of the week is: " + dayName);
    }
        }
    