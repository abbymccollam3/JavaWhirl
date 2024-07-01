import java.util.Scanner;

public class Challenge2 {

    //String[] months = {"+", "-", "*", "/"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter a numeric value: "); //takes user input
        String input1 = sc.next();

        int num1 = Integer.parseInt(input1);

        System.out.print("Enter a numeric value: "); //takes user input
        String input2 = sc.next();

        int num2 = Integer.parseInt(input2);

        System.out.print("Enter the operation (+, -, *, /): ");
        String input3 = sc.next();
        System.out.println("Input 3 is: " + input3);

        if (input3 == "+") {
            int sum = num1 + num2;
            System.out.println("The result is: " + sum);
        }

        else if (input3 == "-") {
            int dif = num1 - num2;
            System.out.println("The result is: " + dif);
        }


        else if (input3 == "*") {
            int mult = num1 * num2;
            System.out.println("The result is: " + mult);
        }


        else if (input3 == "/") {
            int div = num1 / num2;
            System.out.println("The result is: " + div);
        }

        else {
            System.out.println("You did not input one of the operators.");
        }
    
    }
}
