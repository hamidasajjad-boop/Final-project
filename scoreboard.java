public class scoreboard { }
    private String team1;
    private String team2;
    private int score1;
    private int score2; 
    private int whosturn;

public scoreboard(String t1, String t2) {
//job of the constructor is to initialise the attributes
//this.varaiblename = pointing at the attribute and not the local variable
//attribute is a instance variable
    team1 = t1;
    team2 = t2;  
    score1 = 0;
    score2 = 0;
    whosturn = 1;

    }

public void recordplay(int point)
{
    if(point == 0)
    {
       if(whosturn == 1)
       {
        whosturn = 2;
       }
       else
       {
        whosturn = 1;
       }
    }
    else{
if(whosturn == 1)
{
    score1 = score1 + point;
}
else
{
    score2 = score2 + point;
}
    }

}
public String getscore()
{
String result =  +   score1 + " - " + score2 + " - ";
if(whosturn == 1)
{
    result = result + team1;;
}
else
{
    result = result + team2;
}
//getter method or accessor method
//accepting no parameters
//return type is data type of the attribute
//   return  attribute never return the local variable ;
//the job for a getter method is to return the value of the attribute.
//never going to change the value of the attribute.
return result;
}
//check message builder
//static var in something class - describe behaviour
//alpha and beta classes - unit 3 mcq
//getdecimal method - describe condtions
//Bead sequence - unit 1 frq
//unit2 mcq
//boolean expressions - result of relational operators 
//countA in str
//condtional statements - value of total.
//deteremine whetehr num is even - write code
//setfinal price
//whileloop overflow 