public class gradebook {
String CourseName;
//purpose of the constructor - to initialize the attributes:
public gradebook()
{
    CourseName = null;
}

public gradebook(String name)
{
    CourseName = name;
}
public void displaymessage()
{
    System.out.println("Welcome to the course " + getcoursename());
}
public String getcoursename()
{
return CourseName;

}
public void setcoursename(String name)
{
    CourseName = name;

}
public double Displayaverage(int totalmarks, int counter)
{
double setavergae = (double) totalmarks/counter;
return setavergae;
}
}