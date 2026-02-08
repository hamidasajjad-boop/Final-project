public class App {
    public static void main(String[] args) throws Exception {
        
        int pencils = 10 , pens = 18;
 int result= pencils+pens;

        System.out.println("There are " +pens+ " pens");
        System.out.println("There are " +pencils+ " pencils");
        System.out.println("There are " +result+ " pens and pencils");

int math=60, eng=90, apCs= 98;
int sumTotal= math+eng+apCs;
double avg= sumTotal/3;
System.out.println("Your average is"+avg);

int totalCents= 137;
int qauters= totalCents/25; //137/25=5
int qautersbalance = totalCents%25; //137%25= 12
int dimes = qautersbalance/10; //12/10= 1
int dimesbalance= qautersbalance%10; //12%10 = 2
int nickels= dimesbalance/5;//2/5=0
int nickelsbalance= dimesbalance%5; //2%5=2
int pennies = nickelsbalance/1; //2/1=2


System.out.println("Your exact change for " +totalCents+ " cents is: " +qauters+ " quaters " + dimes +" dimes "+nickels+ " nickels "+pennies+ " pennies ");





        
    }
}

