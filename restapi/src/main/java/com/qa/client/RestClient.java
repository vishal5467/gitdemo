package com.qa.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient 
{
	//1 Get Method without header
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpclient=HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);   //http get requist
		CloseableHttpResponse closablehttpresponse = httpclient.execute(httpget);  //hit the get url
		
		
		return closablehttpresponse;
		}
	// get method with header
	public CloseableHttpResponse get(String url, HashMap<String, String>headerhmap) throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpclient=HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);   //http get requist
		for(Map.Entry<String, String> entry :headerhmap.entrySet()){
			httpget.addHeader(entry.getKey(),entry.getValue());
	}
		CloseableHttpResponse closablehttpresponse = httpclient.execute(httpget);  //hit the get url
		return closablehttpresponse;
	//3. post method
	
}
    public CloseableHttpResponse post(String url,String entityString, HashMap<String, String>headerhmap) throws ClientProtocolException, IOException{
    	CloseableHttpClient httpclient=HttpClients.createDefault();
    	HttpPost httppost = new HttpPost(url);
    	httppost.setEntity(new StringEntity(entityString)); // for payload
    	
    	//for headers
    	for(Map.Entry<String, String> entry : headerhmap.entrySet()){
			httppost.addHeader(entry.getKey(),entry.getValue());
	}
    	
    	CloseableHttpResponse closablehttpresponse=httpclient.execute(httppost);
    	return closablehttpresponse;
	}

}