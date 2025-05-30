package Tasks;

import java.awt.*;
import java.util.Scanner;

public class Task_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Input year
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        // Input month (name or number)
        System.out.print("Enter month (name or number): ");
        String monthInput = scanner.nextLine().trim().toLowerCase();

        int month = -1;
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Convert month input to number
        switch (monthInput) {
            case "1": case "january": case "jan": month = 1; break;
            case "2": case "february": case "feb": month = 2; break;
            case "3": case "march": case "mar": month = 3; break;
            case "4": case "april": case "apr": month = 4; break;
            case "5": case "may": month = 5; break;
            case "6": case "june": case "jun": month = 6; break;
            case "7": case "july": case "jul": month = 7; break;
            case "8": case "august": case "aug": month = 8; break;
            case "9": case "september": case "sep": month = 9; break;
            case "10": case "october": case "oct": month = 10; break;
            case "11": case "november": case "nov": month = 11; break;
            case "12": case "december": case "dec": month = 12; break;
            default:
                System.out.println("Invalid month input.");
                return;
        }

        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = isLeap ? 29 : 28;
                break;
            default:
                days = 0; // should never reach here
        }

        System.out.println("Leap Year: " + isLeap);
        System.out.println("Number of days: " + days);
        }
    }