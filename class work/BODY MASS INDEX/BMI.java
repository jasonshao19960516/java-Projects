import java.util.Scanner;
import java.io.*;

public class BMI
{
  public static void main (String[] args)
  {
    
    Scanner input = new Scanner(System.in);
    int ft;
    double inch;
      
    System.out.println("Enter your weight in lbs");
    double weightlb =input.nextDouble();
    System.out.println("Enter your height in ft and inches");
    ft= input.nextInt();
    inch= input.nextDouble();
    System.out.println("inches =" +inch);
    
    double weightKG;
    double meter;
    double bmi;

    weightKG= weightlb/ 2.2;
    meter= (ft+inch/ 12)*0.3048;
    bmi=weightKG/meter;
    
    System.out.format("Your Weight is %.2f KGs and your Height is %.2f Meters \n",weightKG,meter);
    System.out.format(" Your BMI is %.2f KG/M",bmi);
  }
  
}