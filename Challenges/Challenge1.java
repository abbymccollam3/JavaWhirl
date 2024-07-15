import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter a numeric value: "); //takes user input
        String input1 = sc.next();

        int num1 = Integer.parseInt(input1);

        System.out.println("Enter a numeric value: "); //takes user input
        String input2 = sc.next();

        int num2 = Integer.parseInt(input2);

        int sum = num1 + num2;

        System.out.println("The sum is:" + sum);
        



    }
}
