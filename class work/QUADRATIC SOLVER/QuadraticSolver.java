import java.util.Scanner;
import java.io.*;

public class QuadraticSolver
{
  public static void main (String[] args)
  {
    
    Scanner input = new Scanner(System.in);
      
    System.out.println("Enter your a");
    double a =input.nextDouble();
    System.out.println("Enter your b");
    double b= input.nextDouble();
    System.out.println("Enter your c");
    double c= input.nextDouble();
    if (a==0)
    { System.out.println("a can not be 0");   //because denominator can not be 0//
    }
    else if((Math.pow(b,2) -4*a*c)>=0)
    {  Double x1;
      Double x2;
     x1=(-b+Math.sqrt(Math.pow(b,2) -4*a*c))/(2*a);
    x2=(-b-Math.sqrt(Math.pow(b,2) -4*a*c))/(2*a);
    if(x1.equals(x2))
    {System.out.format("x is %.2f.",x1);
    }
    else{
    
    System.out.format("x1 is %.2f and x2 is %.2f .",x1,x2);
    }}
    else{
      System.out.format("b^2 < 4ac, the answer is not a real number");  //the content inside a sqrt can not be a negative number//
    }
}
}
