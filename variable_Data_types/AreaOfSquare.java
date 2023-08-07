package variable_Data_types;
import java.util.*;
public class AreaOfSquare {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the side of the Square: ");
        int side= sc.nextInt();

        int sqr=(side*side);
        System.out.print(" Area of the Square: "+sqr);
    }
}
