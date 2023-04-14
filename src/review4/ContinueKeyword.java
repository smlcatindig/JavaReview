package review4;

public class ContinueKeyword {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            if(i==3){
                continue; // move to the next iteration and skips the if condition
            }

            System.out.println(i);
        }
    }
}
