package com.qa.tests;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.omg.CORBA.PERSIST_STORE;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.util.TestUtil;

public class GetAPITest extends TestBase
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
	
   
  @Test(priority=1)
  public void getAPITestwithoutheader() throws ClientProtocolException, IOException
  {
	    restclient = new RestClient();
	    closablehttpresponse= restclient.get(url);
	     
	   //a status code
			int stauscode = closablehttpresponse.getStatusLine().getStatusCode();
			System.out.println("ststuscode-->" + stauscode);
			
			Assert.assertEquals(stauscode, RESPONSE_STATUS_CODE_200 ,"Status code is not 200");
			
			
			//b json string
			String resonsestring = EntityUtils.toString(closablehttpresponse.getEntity(), "UTF-8");
			
			JSONObject responsejson = new JSONObject(resonsestring);
			System.out.println("response json from api-->" + resonsestring);
			
			
			//for total in get method par page 
			String totalvalue =TestUtil.getValueByJPath(responsejson,"/total");
			System.out.println("value of per page is-->" +totalvalue);
            Assert.assertEquals(Integer.parseInt(totalvalue), 12,"value of per page is not 12");
			
			// for per page method
			String pagevalue =TestUtil.getValueByJPath(responsejson,"/per_page");
			System.out.println("value of per page is-->" +pagevalue);
            Assert.assertEquals(Integer.parseInt(pagevalue), 3,"value of per page is not 3");
			
            
            //get the data from json array
            
            String lastname   = TestUtil.getValueByJPath(responsejson, "/data[0]/last_name");
            String id   = TestUtil.getValueByJPath(responsejson, "/data[0]/first_name");
            String firstname   = TestUtil.getValueByJPath(responsejson, "/data[0]/id");
            String avatar  = TestUtil.getValueByJPath(responsejson, "/data[0]/avatar");
            
            System.out.println(lastname);
            System.out.println(id);
            System.out.println(firstname);
            System.out.println(avatar);
            
            
            
            
            
			// all headers
			Header[] headerarray = closablehttpresponse.getAllHeaders();
			HashMap<String, String> allheaders = new HashMap<String, String>();
			
			for(Header header : headerarray)
			{
				allheaders.put(header.getName(),header.getValue());
			}
				System.out.println("Headers array-->" + allheaders);
//				
//				String header1 =TestUtil.getValueByJPath(responsejson,"/cf-ray ");
//				System.out.println("value of per page is-->" +header1);
//	            Assert.assertEquals(Integer.parseInt(totalvalue), 4197 ,"value of per page is not 12");
//				
	
			
  }

  @Test(priority=2)
  public void getAPITestwithheader() throws ClientProtocolException, IOException
  {
	    restclient = new RestClient();
	    
	    HashMap<String, String> headerhmap = new HashMap<String, String>();
	    headerhmap.put("Content-Type", "application/json");
//	    headerhmap.put("username", "vishal");
//	    headerhmap.put("pasword", "1234");         information
//	    closablehttpresponse= restclient.get(url);
//	     
	    
	   //a status code
			int stauscode = closablehttpresponse.getStatusLine().getStatusCode();
			System.out.println("ststuscode-->" + stauscode);
			
			Assert.assertEquals(stauscode, RESPONSE_STATUS_CODE_200 ,"Status code is not 200");
			
			
			//b json string
			String resonsestring = EntityUtils.toString(closablehttpresponse.getEntity(), "UTF-8");
			
			JSONObject responsejson = new JSONObject(resonsestring);
			System.out.println("response json from api-->" + resonsestring);
			
			
			//for total in get method par page 
			String totalvalue =TestUtil.getValueByJPath(responsejson,"/total");
			System.out.println("value of per page is-->" +totalvalue);
            Assert.assertEquals(Integer.parseInt(totalvalue), 12,"value of per page is not 12");
			
			// for per page method
			String pagevalue =TestUtil.getValueByJPath(responsejson,"/per_page");
			System.out.println("value of per page is-->" +pagevalue);
            Assert.assertEquals(Integer.parseInt(pagevalue), 3,"value of per page is not 3");
			
            
            //get the data from json array
            
            String lastname   = TestUtil.getValueByJPath(responsejson, "/data[0]/last_name");
            String id   = TestUtil.getValueByJPath(responsejson, "/data[0]/first_name");
            String firstname   = TestUtil.getValueByJPath(responsejson, "/data[0]/id");
            String avatar  = TestUtil.getValueByJPath(responsejson, "/data[0]/avatar");
            
            System.out.println(lastname);
            System.out.println(id);
            System.out.println(firstname);
            System.out.println(avatar);
            
            
            
            
            
			// all headers
			Header[] headerarray = closablehttpresponse.getAllHeaders();
			HashMap<String, String> allheaders = new HashMap<String, String>();
			
			for(Header header : headerarray)
			{
				allheaders.put(header.getName(),header.getValue());
			}
				System.out.println("Headers array-->" + allheaders);	

  }
}
  
