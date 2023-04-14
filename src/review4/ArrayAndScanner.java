package review4;

import java.util.Scanner;

public class ArrayAndScanner {
    public static void main(String[] args) {
        /* create an array that stores numbers from a user
        and then we want to calculate the average of numbers
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("How many integers you want to store?");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.println("Please Enter " + (i + 1) + " element");
            numbers[i] = scan.nextInt();
        }

        System.out.println();

        int sum = 0;
        for (int a : numbers) {
            sum += a;
            System.out.println("The average is:" + (sum / size)+ " ");
        }
        System.out.println();

    }
        }
