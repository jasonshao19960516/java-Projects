import java.util.Scanner;
import java.io.*;
import javax.swing.*;


public class USDEURO
{
  public static void main (String[] args)
  {
   
    JOptionPane.showMessageDialog(null,"USD & EUROS CONVERTER!",":-))!",JOptionPane.ERROR_MESSAGE);
    
    String currency = JOptionPane.showInputDialog(" The currency that you want to converted to(USD and EUROS) ");
    if (currency.equals("EUROS"))
    {
      String first = JOptionPane.showInputDialog(" enter your USD amount ");   
      double Eu = Double.parseDouble(first);
      String outputString =" The Amount of EUROs you will get is " + Eu*0.84;
      
       JOptionPane.showMessageDialog(null,outputString,"wow",JOptionPane.ERROR_MESSAGE);
    }
    else
    {
      String second = JOptionPane.showInputDialog(" enter your EURO amount ");   
      Double Us = Double.parseDouble(second);
      String outputString =" The Amount of USD you will get is " + Us*1.19;
      
       JOptionPane.showMessageDialog(null,outputString,"wow",JOptionPane.ERROR_MESSAGE);
    }
  }
}