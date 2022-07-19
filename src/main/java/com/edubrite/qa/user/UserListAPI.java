package com.edubrite.qa.user;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UserListAPI 
{
	Logger log=Logger.getLogger(UserListAPI.class);
	
	@Test
	public void fetchSessionInfo()
	{
		Map<String, String> parameters = new HashMap<String, String>();
	    parameters.put("dispatch", "list");

	    parameters.put("search", "john doe");
	   
	    //String retStr = connection.invokeApi("userService.do", "SujataBhadoria", parameters);
	    //System.out.println(retStr);
		
	}

}