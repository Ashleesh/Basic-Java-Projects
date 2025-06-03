import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Calculator\n");
        System.out.println("Enter Two Varibles");
        System.out.print("Enter Varible a : ");
        int a = sc.nextInt();
        System.out.print("Enter Varible b : ");
        int b = sc.nextInt();
       
        System.out.println("Choose operation");
        System.out.println("Press 1 For Addition (+)");
        System.out.println("Press 2 For Substraction (-)");
        System.out.println("Press 3 For Multiplication (*)");
        System.out.println("Press 4 For Division (/)");
        System.out.println("Press 5 For Modulus (%)");

        System.out.print("Enter Choice Between 1 To 5 : ");
        int operator = sc.nextInt();
         switch (operator) {
            case 1 : System.out.println("Sum is : " + (a+b) );
            break;
            case 2 : System.out.println("Sub Is : " + (a-b));
            break;
            case 3 : System.out.println("Mul Is : " + (a*b));
            break;
            case 4 : System.out.println("Div is : " + (a/b));
            break;
            case 5 : System.out.println("Mod Is : " + (a%b));
            break;
            case 6 : System.out.println("Invalid Input");
         }

        }

        }
        



