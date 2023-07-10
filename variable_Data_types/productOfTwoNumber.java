package variable_Data_types;
import java.util.*;
public class productOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number:");
        int a= sc.nextInt();
        System.out.print("Enter second number:");
        int b= sc.nextInt();
        int product = a*b;
        System.out.println("Product of a and b is = "+ product);
    }
}
