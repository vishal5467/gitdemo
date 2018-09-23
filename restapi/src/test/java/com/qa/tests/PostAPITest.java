package com.qa.tests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.data.users;

public class PostAPITest extends TestBase
{
	TestBase testbase;
	String serviceurl;
	String apiurl;
	String url;
	RestClient restclient;
	CloseableHttpResponse closablehttpresponse;
	
	@BeforeMethod
	  public void setup() throws ClientProtocolException, IOException
	  {
		  testbase = new TestBase();
		 serviceurl = pr.getProperty("URL");
		 apiurl = pr.getProperty("serviceURL");
		
		  url =  serviceurl + apiurl;
	    
	  }
	@Test
	public void postAPTTest() throws JsonGenerationException, JsonMappingException, IOException{
		
		restclient = new RestClient();
		HashMap<String, String> headerhmap = new HashMap<String, String>();
	    headerhmap.put("Content-Type", "application/json");
	
	//jackson API:
	ObjectMapper mapper = new ObjectMapper();
	users use = new users("morpheus", "leader"); //expected users obejct
    //object to json file
    
     mapper.writeValue(new File("C:\\Users\\computer\\Desktop\\Hybrid_Training\\restapi\\src\\main\\java\\com\\qa\\data\\users.json"), use);  
	// object tojson in string
     String userjsonString =   mapper.writeValueAsString(use);
     System.out.println(userjsonString);

//      closablehttpresponse=restclient.post(url, userjsonString, headerhmap);
//
//     //1 status code
//      int statuscode =  closablehttpresponse.getStatusLine().getStatusCode();
//      Assert.assertEquals(statuscode,testbase.RESPONSE_STATUS_CODE_201);
//      
//      //2 json string
//   String responseString =  EntityUtils.toString(closablehttpresponse.getEntity(),"UTF-8");
//      JSONObject responsejson = new JSONObject(responseString);
//      System.out.println("response from API is" + responsejson);
//      
      
     closablehttpresponse = restclient.post(url, userjsonString, headerhmap); //call the API
		
		//validate response from API:
		//1. status code:
		int statusCode = closablehttpresponse.getStatusLine().getStatusCode();
		//Assert.assertEquals(statusCode, testbase.RESPONSE_STATUS_CODE_201);
		
		//2. JsonString:
		String responseString = EntityUtils.toString(closablehttpresponse.getEntity(), "UTF-8");
		
		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("The response from API is:"+ responseJson);
		
		//json to java object:
	// json to java object
    users userobj =   mapper.readValue(responseString,users.class);
      System.out.println(userobj);
      
      Assert.assertTrue(use.getName().equals(userobj.getName()));
      Assert.assertTrue(use.getJob().equals(userobj.getJob()));
      System.out.println(userobj.getId());
      System.out.println(userobj.getCreatedaat());
      
      
     
	}
}
