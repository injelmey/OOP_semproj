package unit.description;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Display initial units at the start of the program
        List<UnitDescription> units = getInitialUnits();
        System.out.println("Initial units in the system:");
        showAllUnits(units);

        System.out.println("\nWelcome to the Apartment Rentals and Billing System!");

        boolean moreUnits = true;
        while (moreUnits) {
            try {
                // Collect unit details from user input
                int unitID = getIntInput("Enter Unit ID: ");
                int capacity = getIntInput("Enter Capacity: ");
                UnitDescription.UnitType unitType = getUnitTypeInput();
                int floor = getIntInput("Enter Floor: ");
                double rentAmount = getDoubleInput("Enter Rent Amount: ");
                UnitDescription.UnitStatus status = getUnitStatusInput();

                // Create a new unit description
                UnitDescription unit = new UnitDescription(unitID, capacity, unitType, floor, rentAmount, status);
                units.add(unit);
                System.out.println("Unit added successfully!\n");

                // Ask if the user wants to add another unit
                moreUnits = getYesOrNoInput("Would you like to add another unit? (y/n): ");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please try again.");
                scanner.nextLine();  // clear the buffer
            }
        }

        // Ask if the user wants to display all units at the end
        if (getYesOrNoInput("Would you like to view all the units added? (y/n): ")) {
            showAllUnits(units);  // Display all units
        }
    }

    // Method to provide predefined units at the start
    private static List<UnitDescription> getInitialUnits() {
        List<UnitDescription> initialUnits = new ArrayList<>();

        // Add some predefined units
        initialUnits.add(new UnitDescription(101, 2, UnitDescription.UnitType.ONE_BEDROOM, 1, 1500.00, UnitDescription.UnitStatus.AVAILABLE));
        initialUnits.add(new UnitDescription(102, 3, UnitDescription.UnitType.TWO_BEDROOM, 2, 2000.00, UnitDescription.UnitStatus.OCCUPIED));
        initialUnits.add(new UnitDescription(103, 1, UnitDescription.UnitType.STUDIO, 3, 1200.00, UnitDescription.UnitStatus.UNDER_MAINTENANCE));
        initialUnits.add(new UnitDescription(104, 4, UnitDescription.UnitType.PENTHOUSE, 4, 3500.00, UnitDescription.UnitStatus.AVAILABLE));

        return initialUnits;
    }

    // Method to display all units
    private static void showAllUnits(List<UnitDescription> units) {
        System.out.println("\nDisplaying All Units:");
        if (units.isEmpty()) {
            System.out.println("No units available.");
        } else {
            for (UnitDescription unit : units) {
                System.out.println(unit.getDetails());
            }
        }
    }

    // Helper methods for user input and validation
    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. " + prompt);
            scanner.next(); // consume the invalid input
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        return value;
    }

    private static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. " + prompt);
            scanner.next(); // consume the invalid input
        }
        double value = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character
        return value;
    }

    private static UnitDescription.UnitType getUnitTypeInput() {
        System.out.print("Enter Unit Type (STUDIO, ONE BEDROOM, TWO BEDROOM, PENTHOUSE): ");
        while (true) {
            try {
                // Convert input to uppercase and replace spaces with underscores to match enum values
                String input = scanner.nextLine().trim().toUpperCase().replace(" ", "_");
                return UnitDescription.UnitType.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.print("Invalid unit type. Please enter again (STUDIO, ONE BEDROOM, TWO BEDROOM, PENTHOUSE): ");
            }
        }
    }

    private static UnitDescription.UnitStatus getUnitStatusInput() {
        System.out.print("Enter Unit Status (AVAILABLE, OCCUPIED, UNDER MAINTENANCE): ");
        while (true) {
            try {
                // Convert input to uppercase and replace spaces with underscores to match enum values
                String input = scanner.nextLine().trim().toUpperCase().replace(" ", "_");
                return UnitDescription.UnitStatus.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.print("Invalid status. Please enter again (AVAILABLE, OCCUPIED, UNDER MAINTENANCE): ");
            }
        }
    }

    private static boolean getYesOrNoInput(String prompt) {
        System.out.print(prompt);
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("y")) return true;
            if (input.equals("n")) return false;
            System.out.print("Invalid input. " + prompt);
        }
    }
}