public class Oct3
{
   public static void main(String[] args)
  { rpsShoot();
     
   }
  public static int randomInt(int a, int b)
  {
    return(int) Math.floor((b+1-a)*Math.random())+a;
  }
  public static String rpsShoot()
  {
    for(int i=1;i<=100;i++)
    {
    int val = randomInt(1,3);
    String s = "";
    String x = "";
    if(val == 1)
    {
      s = "rock";
      x = "rock";
      System.out.println(s);
      
  }
    else if(val == 2)
    { s = "scissors";
      x = "scissors";
      System.out.println(s);
    }
    else
    { s = "paper";
      x = "paper";
      System.out.println(s);
    }
    return s;
    return x;
    if(String s == "paper" && String x == "scissors")
    {System.out.println("Player 1 wins");
    }
    else if(String s == "rock" && String x == "paper")
    {
      System.out.println("Player 2 wins");
    }
      else if(String s == "paper" && String x == "scissors")
    {
      System.out.println("Player 1 wins");
    }
       else
       {System.out.println("TIE");}
    
      
  }
  }
}