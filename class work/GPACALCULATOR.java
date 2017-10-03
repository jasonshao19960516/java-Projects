import java.util.Scanner;
import java.io.*;

public class GPACALCULATOR
{
  public static void main (String[] args)
  {
    
    Scanner input = new Scanner(System.in);
    double c1;
    double c2;
    double c3;
    double c4;
    double c5;
    double c6;
    double gpa;


      
    System.out.println("How many credits are you taking?");
    double credits =input.nextDouble();
    if(credits>5){
      System.out.println("Ur Grade for class1?");
      c1 =input.nextDouble();
      System.out.println("Ur Grade for class2?");
      c2 =input.nextDouble();
      System.out.println("Ur Grade for class3?");
      c3 =input.nextDouble();
      System.out.println("Ur Grade for class4?");
      c4 =input.nextDouble();
      System.out.println("Ur Grade for class5?");
      c5 =input.nextDouble();
      System.out.println("Ur Grade for class6?");
      c6 =input.nextDouble();
    }
    else if(credits>4){
      System.out.println("Ur Grade for class1?");
      c1 =input.nextDouble();
      System.out.println("Ur Grade for class2?");
      c2 =input.nextDouble();
      System.out.println("Ur Grade for class3?");
      c3 =input.nextDouble();
      System.out.println("Ur Grade for class4?");
      c4 =input.nextDouble();
      System.out.println("Ur Grade for class5?");
      c5 =input.nextDouble();
    }
    else if(credits>3){
      System.out.println("Ur Grade for class1?");
      c1 =input.nextDouble();
      System.out.println("Ur Grade for class2?");
      c2 =input.nextDouble();
      System.out.println("Ur Grade for class3?");
      c3 =input.nextDouble();
      System.out.println("Ur Grade for class4?");
      c4 =input.nextDouble();
    }
    else if(credits>2){
      System.out.println("Ur Grade for class1?");
      c1 =input.nextDouble();
      System.out.println("Ur Grade for class2?");
      c2 =input.nextDouble();
      System.out.println("Ur Grade for class3?");
      c3 =input.nextDouble();
    }
    else if(credits>1){
      System.out.println("Ur Grade for class1?");
      c1 =input.nextDouble();
      System.out.println("Ur Grade for class2?");
      c2 =input.nextDouble();
    }
    else{
      System.out.println("Ur Grade for class1?");
      c1 =input.nextDouble();
    }
     gpa= (c1+c2+c3+c4+c5+c6)/credits;
    
    System.out.format("Your gpa is %.2f .",gpa);
    }
  
}