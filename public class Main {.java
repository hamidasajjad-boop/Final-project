public class Main {
    
public static void main(String[] args)
{
double weight = 190;
double height = 70;
bmi(height,weight);
String result = weightclass(height,weight);
System.out.println(result);
}

public static double bmi (double height, double weight)
{
return (height / (weight * weight)) * 703;
}

pubic static String weightclass(double height, double weight)
{
double result = bmi(height,weight);

if(result < 18.5)
{
    return "Underweight";
}
else if(result > 18.5 && result <25.0)
{
    return "normal";
}
else if(result > 25.0 && result < 30.0)
{
    return "overwight";
}
else if(result > 30.0)
{
    return "obesse";
}
else
{
    return "invalid input"
}
}
}
