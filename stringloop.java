public class stringloop {
    public static void main(String[] args) {
        
String word = "sunflower";
String sub = "flow";
boolean found= false;

for(int i=0; i<=word.length()-sub.length(); i++)
{
    String portion = word.substring(i, i+sub.length());
if(portion.equals(sub))
{
    found = true;
}
}
if (found)
{
    System.out.print("found");

}
else
{
    System.out.print(" not found");
}

    }
}
