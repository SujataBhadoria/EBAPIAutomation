package com.edubrite.qa.intializeconnection;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class InitializeConnection 
{
	Logger log=Logger.getLogger(InitializeConnection.class);
	
	@Test
	public void fetchSessionInfo()
	{
		RestAssured.baseURI = "http://sujatabhadoria.edubrite.com/oltpublish/site/connect.do";
		String sessionid = RestAssured.given().get().getSessionId();
		log.info("Session ID is =>  " + sessionid);
		
		String sessioninfo = RestAssured.given().header("sessionid", sessionid, "null").params("username", "api_d39b201f-cd90-11ea-9f48-0cc47adeb5f8", "password", 
				"cHWXbqIFxvu97WRd5vAwa8hLDqpHiy0XE2rpI9IDWC36DMvVB-BO9p6fmtkQY9kLqfqIAh2mJPfTNHs1fbqLtNpkXZOCAl79AjbSXRgA5gc*|649646183587")
				.get().asString();
		
		
		log.info("Session Info is =>  " + sessioninfo);
		
		RestAssured.baseURI = "https://sujatabhadoria.edubrite.com/oltpublish/site/index.do";
		int responsecode = RestAssured.given().params("sessionId", sessionid, "sInfo", sessioninfo).get().getStatusCode();
		log.info(responsecode);

	}
	
	

}
