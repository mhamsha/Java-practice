import java.util.Scanner;

public class T2_UserInputTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.print("Welcome "+ name + " to Coding World! ");

        System.out.print("Want to Add Two Numbers! \nEnter First Number: ");
        int numberOne = input.nextInt();
        System.out.print("Enter Second Number: ");
        int numberTwo = input.nextInt();
        int sum = numberTwo + numberOne;
        System.out.println("The sum of " + "\"" + numberOne + "\"" +   " and " + "\"" +numberTwo + "\""   + " is: " + sum);

    }
}
