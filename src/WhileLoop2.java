import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Please enter integer value");
        while(sc.hasNextInt()){ // when the number of repetition is unknown, use do while or while
            int num=sc.nextInt();
            sum+=num;
        }

        System.out.println("Sum="+sum);
    }
}
