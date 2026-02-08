public class gradebooktest {
//driver class - it has main method.
public static void main(String[] args) {
    //syntax :
//Classname objname = new constructor
gradebook grade10 = new gradebook("Web-development");
gradebook grade11 = new gradebook(); //default constrctor 
gradebook grade12 = new gradebook();


grade11.setcoursename("AP CS A");
grade11.displaymessage(); //invoke the displaymessage method.
   

grade12.setcoursename("Computer science principles");
System.out.println("Course " + grade12.getcoursename() + " added");
System.out.println("The average marks are " +grade12.Displayaverage(400, 2));
}

public void cal()
{
int x,y,z;
//x=2, y=3   z=1 //sorting algorithm
if(x>y)
{
 swap(x,y); 
}
 if(y>z)
 {
    swap(y,z) x=2 y=1 z=3
 }   
 if (x>z)
 {
    swap(x,z) x=1 y=2 z=3
 }
}

}
}
