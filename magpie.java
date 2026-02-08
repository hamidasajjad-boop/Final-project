
public class magpie
{
    public String getGreeting()
    {
return "Hello, lets talk";
    }

public String getResponse(String statement)
{
    String response= "";
    if(statement.length()==0)
    {
        response= "Please say something";
    }
    else if(statement.length()>=1)
    {
response= "Thank you for that! How are you doing";
    }

   
 return response;
}












}