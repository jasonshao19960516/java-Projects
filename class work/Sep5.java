import java.util.Scanner;
import java.io.*;
import javax.swing.*;


public class Sep5
{
  public static void main (String[] args)
  {
    
    JOptionPane.showMessageDialog(null,"let's go!","amazing software!",JOptionPane.ERROR_MESSAGE);
    
    String name = JOptionPane.showInputDialog(" enter your name ");
    
    String inputString = JOptionPane.showInputDialog(" enter your favorite number ");
    double inputNum = Double.parseDouble(inputString);
    
    String outputString = "The square root of "+name+"'s favorite number is "+Math.sqrt(inputNum);
    
    JOptionPane.showMessageDialog(null,outputString,"wow",JOptionPane.ERROR_MESSAGE);
    
  }
}