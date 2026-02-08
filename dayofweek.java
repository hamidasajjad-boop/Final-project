import java.util.Scanner;

public class dayofweek
{

public static void main(String[] args)
{ 
Scanner console = new Scanner(System.in);
System.out.println("Enter the month");
int m= console.nextInt();
System.out.println("Enter the date");
int d= console.nextInt();
System.out.println("Enter the year");
int y= console.nextInt();



System.out.println(Dayofweek(m, d, y));

console.close();




}
public static String Dayofweek(int m, int d, int y)
{


int yo = y-(14-m)/12;
int xo= yo+yo/4-yo/100+yo/400;
int mo=m+12*((14-m)/12)-2;
int D= (d+xo+31*mo/12)%7;
String day="";
if(D==0)
{
day = "Sunday";
}
else if(D==1)
{
    day="monday";
}
else if(D==2)
{
    day="Tuesday";
}
else if(D==3)
{
    day="Wednesday";
}
else if(D==4)
{
    day="Thursday";
}
else if(D==5)
{
    day="Friday";
}
else if(D==6)
{
    day="Saturday";
}
else
{
    day="Error";
}
return day;
}
















}