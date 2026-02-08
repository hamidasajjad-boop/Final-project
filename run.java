import java.util.Scanner;

public class run {
 
public static void main(String[] args)
{
  
  magpie5 maggie = new magpie5();
  System.out.println(maggie.getGreeting());

Scanner console = new Scanner(System.in);
String statement = console.nextLine();


System.out.println(maggie.getResponse(statement));

console.close();

}
}
