import java.util.Scanner;
import java.io.*;
import javax.swing.*;


public class No4
{
  public static void main (String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your number");
    double tableSize =input.nextDouble();
    
    for(int i = 1 ;i<=tableSize;i++)
    {System.out.format("|"+i);
      for(int j=1;j<=tableSize;j++) {
        System.out.format("|"+i*j);
      }
         System.out.println();
      }
    }
  }
    
