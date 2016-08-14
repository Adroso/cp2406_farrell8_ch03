import java.util.Scanner;
/**
 * Created by Adroso360 on 14/08/2016.
 */
public class NumbersDemo2 {
    public static void main(String[] args) {
        int variableOne = getNumber();
        int variableTwo = getNumber();
        displayTwiceTheNumber(variableOne, variableTwo);
        displayNumberPlusFive(variableOne, variableTwo);
        displayNumberSquared(variableOne, variableTwo);
    }

    private static void displayTwiceTheNumber(int a, int b)
    {
        System.out.println("Number 1 twice is" + (a*2) + "Number 2 twice is" + (b*2));
    }

    private static void displayNumberPlusFive(int a, int b)
    {
        System.out.println("Number 1 + 5" + (a+5) + "Number 2 + 5" + (b+5));
    }

    private static void displayNumberSquared(int a, int b){
        System.out.println("Number 1 Squared" + (a*a) + "Number 2 Squared" + (b*b));
    }
    private static int getNumber()
    {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number");
        number = input.nextInt();
        return number;
    }
}
