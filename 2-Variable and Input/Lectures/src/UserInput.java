
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Good Name: ");
        String name = input.nextLine();
        System.out.println("Good Morning: " + name);
        System.out.print(name + ", also tell me your Age, Sir! : ");
        int age = input.nextInt();
        System.out.println("Your Age is : " + age);


    }

}
