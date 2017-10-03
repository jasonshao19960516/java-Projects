import java.util.Scanner;
import java.io.*;
import javax.swing.*;


public class TemperatureConverter
{
  public static void main (String[] args)
  {
    
    JOptionPane.showMessageDialog(null,"Temperature CONVERTER!",":-))!",JOptionPane.ERROR_MESSAGE);
    
    String temp = JOptionPane.showInputDialog(" The Temperature unit that you are entering(K,F, C)"); //Haha, lol get it?//
    if (temp.equals("F") || temp.equals("f") ) 
    {
      String first = JOptionPane.showInputDialog("enter your Temperatire in Fahrenheit");   
      double FaEnter = Double.parseDouble(first);
      double CResult = (5/9)*FaEnter-32;
      double Kresult = CResult + 273;
      if(Kresult==0 || Kresult<0) //no matter what initial units we enter. we will get K eventually and if k<0 then it gives absolute 0//
      {
        JOptionPane.showMessageDialog(null,"It is Absolute Zero");
      }
      else{
    String outputString = "The temperature you will get in Celsius is" + CResult + "\n" + Kresult +"in Kelvin";
        
      JOptionPane.showMessageDialog(null,outputString);
      }}   //overall logic: test the unit, test if it is abs 0, convert units//
    else if(temp.equals("C")|| temp.equals("c"))
    {
      String Second = JOptionPane.showInputDialog("enter your Temperatire in Celsius");   
      double CelEnter = Double.parseDouble(Second);
      double FResult = (9/5)*CelEnter+32;
      double Kresult = CelEnter + 273;
      if(Kresult==0 || Kresult<0)
      {
        JOptionPane.showMessageDialog(null,"It is Absolute Zero");
      }
       else{
        String outputString =" The temperature you will get in Fahrenheit is" + FResult + "\n" + Kresult + "in Kelvin";
        
 JOptionPane.showMessageDialog(null,outputString);
       }}
else{
  String Third = JOptionPane.showInputDialog("enter your Temperatire in Kelvin");   
  double KelEnter = Double.parseDouble(Third);
  double FResult = (9/5)*(KelEnter-273)+32;
  double CelResult = KelEnter-273;
  if(KelEnter==0 || KelEnter<0)
      {
        JOptionPane.showMessageDialog(null,"It is Absolute Zero");
      }
   else{
  String outputString =" The temperature you will get in Fahrenheit is" + FResult + "\n" + CelResult + "in Celsius";
 JOptionPane.showMessageDialog(null,outputString);
        }
}
}
}