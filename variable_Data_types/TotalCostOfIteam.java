package variable_Data_types;
import java.util.*;
public class TotalCostOfIteam {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the cost of the pencil:");
        float pencil= sc.nextFloat();
        System.out.print("Enter the cost of the pen:");
        float pen= sc.nextFloat();
        System.out.print("Enter the cost of the eraser:");
        float eraser= sc.nextFloat();

        float iteamCost= (pencil+pen+eraser);
       float totalGstCost = iteamCost+(iteamCost*18)/100;
      System.out.println(totalGstCost);


    }
}
