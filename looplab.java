   import java.util.Scanner;

   public class looplab
   {

   public static void main(String[] args) {
   
      Scanner console = new Scanner(System.in);
   int number =console.nextInt();
   System.out.println(countPrime(number));
   console.close();
   }


   public static int CountFactors(int num)
   {
      int count =0;
   for(int i=1;i<=num;i++)
   {
   if(num%i==0)
   {
      count++;
   }
   }
      return count;

   }

   public static boolean isprime(int num)
   {
      if(CountFactors(num)==2)
      {
         return true;
      }
      else{
         return false;
      }
   }


   public static int countPrime(int n)
   {
   int count=0;
      for(int i=2; i<=n; i++)
      {
   if(isprime(i)) //true
   {
      count++;
   }
      }
   return count;


      }




   }


















      // int counter = 2;

      // while (counter < num) {
      //    if (num % counter == 0) {
      //       return false;
      //    }

      //    counter++;
         
      //    }
      
   
      // return true;


   // if(num<=1)
   // {
   //    return false;
   // }
   // for(int i=2; i<=Math.sqrt(num);i++)
   // {
   //    if(num%i==0)
   //    {
   //       return false;
   //    }
   // }
   // return true;
   // }


   



   

































