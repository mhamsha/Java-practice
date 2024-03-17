import java.util.Scanner;
public class T8_Arithmetic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int firstNum = input.nextInt();
        System.out.println("Enter Second Number: ");
        int secNum = input.nextInt();
        int add = firstNum + secNum;
        int sub = firstNum - secNum;
        int mul = firstNum * secNum;
        int div = firstNum / secNum;
        int mod = firstNum % secNum;
        System.out.println("Addition: " +add + "\nSubtraction: " + sub + "\nMultiplication: " + mul +"\nDivision: " + div + "\nmodulus: " +mod);

    }
}
