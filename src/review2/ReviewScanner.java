package review2;

import java.util.Scanner;

public class ReviewScanner {
    public static void main(String[] args) {
        // we need to create Scanner
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter 1 word");
        // use command to grab value
        String word=scan.next();

        System.out.println("Word that was captured = "+word);

        System.out.println("Please enter integer value");
        int value=scan.nextInt();
        System.out.println("Entered number is = "+value);

        System.out.println("Please enter decimal value");
        double decimal=scan.nextDouble();
        System.out.println("Entered number is = "+decimal);
    }
}
