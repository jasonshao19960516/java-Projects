import java.util.Scanner;
import java.io.*;
import javax.swing.*;


public class Sept21
{
  public static void main (String[] args)
  {
    int i=1;
     double M= 5000;
      while(M<=1000000)
    {
      M=(1+0.05)*M+1000;
      System.out.println(i);
     i++;
    }
    
    
   }
 
  
  
  }