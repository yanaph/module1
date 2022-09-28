package ua.fan;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current coordinates: ");
        String current = scanner.nextLine();
        System.out.print("Enter destination coordinates: ");
        String destination = scanner.nextLine();
        System.out.println("Possibility of this movement: " + isPossibleMovement(current, destination));
        scanner.close();
    }

    private static boolean isPossibleMovement(String current, String destination) {
        boolean isPossible = false;
        char[] currentPosition = current.toUpperCase().toCharArray();
        char[] destinationPosition = destination.toUpperCase().toCharArray();
        int letter = Math.abs(currentPosition[0] - destinationPosition[0]);
        int digit = Math.abs(currentPosition[1] - destinationPosition[1]);

        if ((letter == 2 && digit == 1) || (letter == 1 && digit == 2)) {
            isPossible = true;
        }
        return isPossible;
    }
}