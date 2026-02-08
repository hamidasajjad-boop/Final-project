import java.util.Scanner;

public class runjava {
    public static void main(String[] args)
    {
        magpie Maggie = new magpie();
      System.out.println(Maggie.getGreeting());  
    Scanner console = new Scanner(System.in);
    String statement = console.nextLine();
    
    System.out.println(Maggie.getResponse(statement));
   statement= console.nextLine();
   
   
   
   
   
   
   
   
   
    console.close();
    }
    
}
