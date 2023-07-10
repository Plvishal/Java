package variable_Data_types;
import java.util.*;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of  circle");
        float radius=  sc.nextFloat();
        double area= 3.14*(radius*radius);
        System.out.println(area);

    }
    
}
