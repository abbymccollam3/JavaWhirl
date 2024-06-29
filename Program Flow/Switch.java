import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number: ");
        String input = sc.nextLine();
        int monthNum = Integer.parseInt(input);

        switch (monthNum) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("march");
                break;
            default:
                System.out.println("You chose another month.");
        }

    }
    
}
