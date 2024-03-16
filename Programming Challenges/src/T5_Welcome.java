import java.util.Scanner;

class T5_Welcome {
    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to KG Coding");
    }
}
