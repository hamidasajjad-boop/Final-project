public class vowels
{
public static void main(String[] args)
{
System.out.println(isvowel("Q"));
System.out.println(isvowel("A"));
System.out.println(isvowel("E"));
}

public static boolean isvowel(String s)
{
    String letter=s;
    if(letter.equals("a")||letter.equals("A")|| letter.equals("e")|| letter.equals("i") || letter.equals("o")|| letter.equals("u"))
    {
return true;
    }
else
{
    return false;
}


}




}