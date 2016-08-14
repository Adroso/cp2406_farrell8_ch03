import java.util.Scanner;

/**
 * Created by Adroso360 on 14/08/2016.
 */
public class BookstoreCredit {
    public static void main(String[] args) {

        double gpa = getGPA();
        String name = getName();
        calcCredit(gpa, name);

    }
    private static double getGPA()
    {
        double number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter GPA");
        number = input.nextDouble();
        return number;
    }
    private static String getName()
    {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name");
        name = input.next();
        return name;
    }
    private static void calcCredit(double gpa, String name){
        double credit = gpa * 10;
        System.out.println("Hi " + name + " You have gained " + "$" + credit + " Credit" );

    }
}
