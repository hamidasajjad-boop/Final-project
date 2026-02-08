public class myfirstprogram {
    
    public static void main(String[] args)
    {

int totalcents = 137;
 int quaters = totalcents/25; 
 int quatersbalance= totalcents%25; 
 int dimes = quatersbalance/10; 
 int dimesbalance = quatersbalance%10;
  int nickels= dimesbalance/5; 
  int nickelsbalance = dimesbalance%5; 
  int pennies = nickelsbalance/1; 
 
  

  System.out.println("You have " + quaters + "quaters" + dimes +" dimes" + nickels + "nickels" + pennies + "pennies");








    }

}
