package review2;

public class IfElseIf {
    public static void main(String[] args) {

        // create a world cup program
        // if year is 2022 -> host country
        // if year is 2018 ->
        // if year is 2014 ->

        int worldCup = 2014;

        if (worldCup == 2022) { // use == means equivalent to
            System.out.println("Host Country is Qatar");
        } else if (worldCup == 2018) {
            System.out.println("Host Country is Russia");
        } else if (worldCup == 2014) {
            System.out.println("Host Country is Brazil");
        } else {
            System.out.println("Host Country is Unknown");
        }
    }
}