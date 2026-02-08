public class magpie5 {
  
public String getGreeting()
{
return "Hello lets talk";
}

public String getResponse(String statement)
{
    String response= "";
    if(statement.length()==0)
    {
        response = "Please say something";
    }
    else if(statement.length()>=1)
    {
        response= "Thank you we will get back to you";
    }
    return response;



}




}
