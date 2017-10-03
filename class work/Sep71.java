import java.util.Scanner;
import java.io.*;
import javax.swing.*;


public class Sep71
{
  public static void main (String[] args)
  {
    double a;    
   
    JOptionPane.showMessageDialog(null,"Grade calculator!",":-))!",JOptionPane.ERROR_MESSAGE);
    
    String name = JOptionPane.showInputDialog(" enter your name ");
    String inputString = JOptionPane.showInputDialog(" enter your FIRST EXAM GRADE ");
    double E1 = Double.parseDouble(inputString);
    String inputString2 = JOptionPane.showInputDialog(" enter your SECOND EXAM GRADE ");
    double E2 = Double.parseDouble(inputString2);
    String inputString3 = JOptionPane.showInputDialog(" enter your THIRD EXAM GRADE ");
    double E3 = Double.parseDouble(inputString3);
    String inputString4 = JOptionPane.showInputDialog(" enter your HONEWORK GRADE ");
    double H = Double.parseDouble(inputString4);
    String inputString5 = JOptionPane.showInputDialog(" enter your FINAL EXAM GRADE ");
    double FE = Double.parseDouble(inputString5);
    a=(E1+E2+E3)*0.2 + H*0.15+FE*0.25;
   
    String outputString = name+"'s FINALE GRADE is "+ a;
    
    JOptionPane.showMessageDialog(null,outputString,"wow",JOptionPane.ERROR_MESSAGE);
    
    
  }
}