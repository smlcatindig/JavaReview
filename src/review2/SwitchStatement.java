package review2;

public class SwitchStatement {
    public static void main(String[] args) {
        String color = "GREEN";

        switch (color.toLowerCase()) { // converts the string to lowercase
            case "red":
                System.out.println("Stop");
                break;
            case "orange":
                System.out.println("Yield");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}