package Test;

public class Api_TestCAse 
{

	
	public static void main(String[] args)
	{
		
		JSONobject obj=new JSONObject();
		
		
		when().get("/users/{gravatar_id}").then().Assert().statuscode(200).log().all();
		
	}

}
