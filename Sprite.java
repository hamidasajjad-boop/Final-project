public class Sprite {
    //instance varaibles or attributes
    double center_x;
    double center_y;
    String name;
//methods or behaviours
public void run()
{
    System.out.println();
}
public void jump()
{
    System.out.print("JUMPP");
}

 public Sprite()
 {
    center_x= 0;
    center_y= 0;
    name=null;
 }
 public Sprite(double a, double b)
 {

center_x=a;
center_y=b;
 }
 public Sprite(double a,double b,String c)
 {
    center_x=a;
    center_y=b;
    name=c;

 }




}
