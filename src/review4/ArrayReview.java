package review4;

public class ArrayReview {
    public static void main(String[] args) {
        int i=10;
        int[]arr=new int[3];
        //we store elements based on indexes
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;
        //access also by indexes
        System.out.println(arr[1]);

        String[]planets={"Earth","Mars","Jupiter","Saturn","Neptune"};

        System.out.println("     Enhanced for loop     "); //used ONLY with arrays and collection also called for each loop
        for(String planet:planets){
            System.out.print(planet+" ");
        }
        System.out.println();


        for(int p=0; p< planets.length; p++){ // for loop
            System.out.print(planets[p]+" ");
        }

    }
}
