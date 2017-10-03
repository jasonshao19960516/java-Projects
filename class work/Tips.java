/*
 *         /\
 *        /= \
 *       //==\\
 * :3   //-_-\\\
 */
import java.util.Scanner;
import java.io.*;

public class Tips
{
  public static void main (String[] args)
  {
    //create a new scanner to collect input
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter the number of People");
    int numPeople =input.nextInt();
    System.out.println("Enter the Bill Amount");
    double billAmount= input.nextDouble();
    System.out.println("Enter the tip rate");
    double tipRate= input.nextDouble();
    
    double tips;
    double total;
    double totalPerPerson;
    
    tips=billAmount*tipRate;
    total=tips+billAmount;
    totalPerPerson = total/numPeople;
    
    //get input on ppl
    System.out.format("if %d people have a bill of $%.2f and the tip rate is %.2f \n",numPeople,billAmount,tipRate);
    System.out.format("then the total amount of tip is $%.2f and the total bill is $%.2f \n",tips,total);
    System.out.format("each person should pay $ %.2f",totalPerPerson);
  
    
  }
  
}



