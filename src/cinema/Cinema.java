package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter the number of seats in each row: ");
        int seats = sc.nextInt();
        System.out.println("Total income: ");
        System.out.println("$" + (calculateTotalIncome(rows, seats)));
    }

    private static int calculateTotalIncome(int rows, int seats) {
        int totalIncome;
        if(rows * seats <= 60) {
            totalIncome = rows * seats * 10;
        } else {
            if(rows % 2 == 0) {
                totalIncome = (10 * seats * rows / 2) + (8 * seats * rows / 2);
            } else {
                totalIncome = ((10 * seats) * ((rows - 1) / 2)) + ((8 * seats) * ((rows + 1) / 2));
            }
        }
        return totalIncome;
    }
}