import java.util.Scanner;
import java.io.*;

public class Sep7
{
  public static void main (String[] args)
  {
    
    Scanner input = new Scanner(System.in);
      
    System.out.println("Enter your #");
    
    int num = input.nextInt();
    
    if( num%2==0 )
    {
      System.out.println("even number!");
    }
    else
    {
    System.out.println("odd number!");
    }
  }
}