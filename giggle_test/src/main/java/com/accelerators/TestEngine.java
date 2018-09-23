package com.accelerators;       

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.support.ConfiguratorSupport;
import com.support.HtmlReportSupport;
import com.support.MyListener;
import com.support.ReportStampSupport;
import com.utilities.SendMail;


public class TestEngine extends SendMail {

	public static Logger logger = Logger.getLogger(TestEngine.class.getName());

	public static ConfiguratorSupport configProps = new ConfiguratorSupport("config.properties");

	public static ConfiguratorSupport counterProp = new ConfiguratorSupport(configProps.getProperty("counterPath"));

	public static String ParallelExec;
	public static int iStepNo = 0; 
	public String currentSuite = "";
	public String method = "";
	public boolean flag = false;
	public static WebDriver webDriver = null;
	public static EventFiringWebDriver driver=null;
	public DesiredCapabilities capabilities;
	public  static int stepNum = 0;
	public  static int PassNum =0;
	public static int FailNum =0;
	public static int RowFailNum =0;
	public  String testName = "";
	public String testCaseExecutionTime = "";
	public StringBuffer x=new StringBuffer();
	public String finalTime = "";
	public boolean isSuiteRunning=false;
	public static Map<String, String> testDescription = new LinkedHashMap<String, String>();
	public static Map<String, String> testResults = new LinkedHashMap<String, String>();
	public static String appURL= configProps.getProperty("App_URL");
	public static String e1url= configProps.getProperty("E1_URL");
	public static String cta_url= configProps.getProperty("CTA_URL");
	public static String arrow_url= configProps.getProperty("ARROW_URL");
	public static String FilePath=System.getProperty("user.dir")+File.separator+"TestData\\FileUploads\\R42800_CLS0010_633154_PDF.pdf";
	//public static Xls_Reader xlsrdr = new Xls_Reader(configProps.getProperty("TestData"));
	//static ExcelReader xlsrdr = new ExcelReader(configProps.getProperty("TestData"),configProps.getProperty("sheetName0"));
	/*
	 * public static Screen s; public static String url =
	 * "jdbc:mysql://172.16.6.121/"; public static String dbName = "test";
	 * public static String userName = "root"; public static Connection conn =
	 * null; public static Statement stmt = null; public static
	 * PreparedStatement pstmt = null; public static ResultSet rs = null;
	 */
	public int countcompare = 0;

	public String browsertype = configProps.getProperty("browserType");
//	public String browsertype;
	static int len = 0;
	static int i = 0;
	public  ITestContext itc;
	public String groupNames =null;
	public static int failCount=0;
	public static int passCount=0;
	public static File zip=new File("");
	public String orderNumber;
	public String invoiceNumber;
	public  String orderDate;
	public Map<Integer, Object[]> data = new LinkedHashMap<Integer, Object[]>();
	private static int h=1;
	
	/**
	 * Initializing browser requirements, Test Results file path and Database
	 * requirements from the configuration file
	 * 
	 * @Date 19/02/2013
	 * @Revision History
	 * 
	 */
//	@Parameters({"parallel"})
	@BeforeSuite(alwaysRun=true)
	public void suiteFirst(ITestContext ctx) throws Throwable{
		itc=ctx;
		
//		ParallelExec=parallel;
		
		//TestEngine.cleanUP();
		ReportStampSupport.calculateSuiteStartTime();
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MMM_yyyy hh mm ss SSS");
		String formattedDate = sdf.format(date);
		suiteStartTime = formattedDate.replace(":","_").replace(" ","_");
		
		new File("Results/HTML"+suiteStartTime+"/Screenshots").mkdirs();
		
		HtmlReportSupport.copyLogos();

	}

	@BeforeTest(alwaysRun=true)
	public void first(ITestContext ctx) throws Throwable{

		itc=ctx;
		

	}


	
	@BeforeClass(alwaysRun=true)
	public void firstBeforeClass(ITestContext ctx) throws Throwable{
		itc=ctx;
		
	}


	
	@AfterTest(alwaysRun=true)
	public void first1(ITestContext ctx) throws Throwable{
		itc=ctx;			

		HtmlReportSupport.createHtmlSummaryReport(browsertype, appURL);
		ReportStampSupport.calculateSuiteExecutionTime();
		closeSummaryReport(browsertype);
	}

	
	@AfterSuite(alwaysRun = true)
	public void tearDownFirefox(ITestContext ctx) throws Throwable {

		WriteExcelfile();
	//	File destFile= new File("Results/SummaryFiles");
		File source = new File("Results/HTML"+suiteStartTime+"/SummaryResults_IE.xls");
	    File dest = new File("Results/SummaryFiles/"+suiteStartTime+"-"+orderNumber+"_SummaryResults_IE.xls");
	    /*if (!destFile.exists()) {
	    	destFile.mkdir();
		}*/
	    FileUtils.copyFile(source, dest);
	    
		//SendMail.attachReportsToEmail("Results/HTML"+suiteStartTime+"/SummaryResults_IE.xls");
		//SendMail.attachReportsToEmail("Results/HTML"+suiteStartTime);// if need to send entire folder

	}

	public static void cleanUP() throws IOException {

		FileUtils.deleteDirectory(new File("Results/HTML"));
		new File("Results/HTML/Screenshots").mkdirs();
		HtmlReportSupport.copyLogos();

	}


	//@Parameters({"browser","ip"})
	@BeforeMethod(alwaysRun = true)
	public void reportHeader(Method method, ITestContext ctx) throws Throwable {
		
		itc = ctx;
		
		
			if(browsertype.equalsIgnoreCase("firefox"))
			{
				webDriver = new FirefoxDriver(FirefoxDriverProfile());
				i=i+1;
			}
			else if(browsertype.equalsIgnoreCase("ie"))
			{
				File file = new File("Drivers/IEDriverServer.exe");
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
				webDriver= new InternetExplorerDriver();
				i=i+1;
			}
			else if(browsertype.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");				
				webDriver=new ChromeDriver();
				
				i=i+1;

			}
		
		driver = new EventFiringWebDriver(webDriver);
		System.out.println("url opened "+appURL);
		MyListener myListener = new MyListener();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.register(myListener);

		try {

			if(browsertype.equalsIgnoreCase("IE")){
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			else{
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			}

			if(browsertype.equalsIgnoreCase("Firefox") || browsertype.equalsIgnoreCase("IE") || browsertype.equalsIgnoreCase("Chrome"))
			{
				driver.manage().window().maximize();
			}
				
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(appURL);
			boolean blnPopup = driver.findElement(By.id("closewelcomeRedirectPopupDialog")).isDisplayed();
			if (blnPopup) {
				driver.findElement(By.id("closewelcomeRedirectPopupDialog")).click();
			}
			currentSuit = ctx.getCurrentXmlTest().getSuite().getName();
		} catch (Exception e1) {
			System.out.println(e1);
		}

		calculateTestCaseStartTime();

		flag = false;

		tc_name = method.getName().toString() + "-" + browsertype;
		String[] ts_Name = this.getClass().getName().toString().split("\\.");
		packageName = ts_Name[0] + "." + ts_Name[1] + "."+ ts_Name[2];


		testHeader(tc_name);

		stepNum = 0;
		PassNum = 0;
		FailNum = 0;
		testName = method.getName();
		String[] tmp=testName.split("_");
		String desc = testName.replaceAll("_", " ")+" Script";
		testDescription.put(testName+ "-" + browsertype, desc);

	}


	@AfterMethod(alwaysRun = true)
	public void tearDown()
	{
		calculateTestCaseExecutionTime();
		closeDetailedReport(browsertype);
		System.out.println("browser :"+strTestName);
		String[] test=strTestName.split("-");
		int stringlength=test.length;
		String currentBrwoser=test[1];           
		if(FailNum!=0)
		{
			testResults.put(tc_name, "FAIL");
			System.out.println("current Browser:"+currentBrwoser);
			failCount++;
		}

		else if(PassNum!=0)
		{
			testResults.put(tc_name, "PASS");
			passCount++;
		}

		try{
			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	
	@AfterClass(alwaysRun=true)
	public void close(){

	}


	public void calculateTestCaseStartTime(){			
		iStartTime = System.currentTimeMillis();
	}


	/***
	 * 		This method is supposed to be used in the @AfterMethod to calculate the total test case execution time 
	 * to show in Reports by taking the start time from the calculateTestCaseStartTime method.
	 */
	public void calculateTestCaseExecutionTime(){	
		iEndTime = System.currentTimeMillis();
		iExecutionTime=(iEndTime-iStartTime);
		TimeUnit.MILLISECONDS.toSeconds(iExecutionTime);
		HtmlReportSupport.executionTime.put(tc_name,String.valueOf(TimeUnit.MILLISECONDS.toSeconds(iExecutionTime)));
	}


	public void onSuccess(String strStepName, String strStepDes) {


		strTestName=strTestName.replaceAll("_", " ");	
		String status = "PASS";
		File file = new File("Results/HTML"+suiteStartTime+"/" + strTestName+"_Results"
				+ ".html");// "SummaryReport.html"
		Writer writer = null;
		stepNum = stepNum + 1;

		try {
			//testdescrption.put(TestTitleDetails.x.toString(), TestEngine.testDescription.get(TestTitleDetails.x));
			
			
			if (!map.get(packageName + ":" + tc_name).equals("FAIL")) {
				map.put(packageName + ":" + tc_name, "PASS");
				//map.put(TestTitleDetails.x.toString(), TestEngine.testDescription.get(TestTitleDetails.x.toString()));
			}
			writer = new FileWriter(file, true);
			writer.write("<tr class='content2' >");
			writer.write("<td>" + stepNum + "</td> ");
			writer.write("<td class='justified'>" + strStepName + "</td>");
			writer.write("<td class='justified'>" + strStepDes + "</td> ");
			writer.write("<td class='Pass' align='center'><img  src='./Screenshots/passed.ico' width='18' height='18'/></td> ");
			//writer.write("<td>" + status + "</td> ");
			
			//writer.write("<td> <font color='#008000'><b>" + status + "<b></font></td>");
			
			PassNum  =PassNum + 1;
			cmdEndTime=System.currentTimeMillis();
        	cmdTime=cmdEndTime-cmdStartTime;
        	int time=(int) TimeUnit.MILLISECONDS.toSeconds(cmdTime);
        	if(time==0)
        		time=1;
			writer.write("<td><small>" + time +" Sec "+ "</small></td> ");
			writer.write("</tr> ");
			writer.close();

		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void onWarning(String strStepName, String strStepDes) {
		Writer writer = null;
		String status = "Warning/Failed";
		try {
			//String fileName= strTestName;
			strTestName=strTestName.replaceAll("_", " ");	

			File file = new File("Results/HTML"+suiteStartTime+"/" + strTestName+"_Results"
					+ ".html");// "SummaryReport.html"
			
			writer = new FileWriter(file, true);
			stepNum = stepNum + 1;

			writer.write("<tr class='content2' >");
			writer.write("<td>" + stepNum + "</td> ");
			writer.write("<td class='justified'>" + strStepName + "</td>");
			writer.write("<td class='justified'>" + strStepDes + "</td> ");
			FailNum = FailNum + 1;


			/*writer.write("<td class='Fail'  align='center'><a  href='"+"./Screenshots"+"/"
					+ strStepDes.replaceAll("[^\\w]", "_")
					+ ".jpeg'"+" alt= Screenshot  width= 15 height=15 style='text-decoration:none;'><img src='./Screenshots/warning.ico' width='18' height='18'/></a></td>");*/
			writer.write("<td>" + status + "</td> ");
			cmdEndTime=System.currentTimeMillis();
        	cmdTime=cmdEndTime-cmdStartTime;
        	int time=(int) TimeUnit.MILLISECONDS.toSeconds(cmdTime);
        	if(time==0)
        		time=1;
			writer.write("<td><small>" + time +" Sec "+ "</small></td> ");
			writer.write("</tr> ");
			writer.close();

		} catch (Exception e) {

		}

	}


	/*
	 * 
	 * 
	 */
	public void onFailure(String strStepName, String strStepDes, String stepExecTime) {
		Writer writer = null;
		try {
			//String fileName= strTestName;
			String status = "FAIL";
			strTestName=strTestName.replaceAll("_", " ");			
			File file = new File("Results/HTML"+suiteStartTime+"/" + strTestName+"_Results"
					+ ".html");// "SummaryReport.html"

			writer = new FileWriter(file, true);
			stepNum = stepNum + 1;

			writer.write("<tr class='content2' >");
			writer.write("<td>" + stepNum + "</td> ");
			writer.write("<td class='justified'>" + strStepName + "</td>");
			writer.write("<td class='justified'>" + strStepDes + "</td> ");
			FailNum = FailNum + 1;
			RowFailNum=RowFailNum+1;


			writer.write("<td class='Fail' align='center'><a  href='"+"./Screenshots"+"/"+ strStepDes.replaceAll("[^\\w]", "_")
					+ stepExecTime +".jpeg'"+" alt= Screenshot  width= 15 height=15 style='text-decoration:none;'><img  src='./Screenshots/failed.ico' width='18' height='18'/></a></td>");
			//writer.write("<td>" + status + "</td> ");
			//writer.write("<td> <font color='#FF0000'> <b>" + status + "<b> </font></td>");
			cmdEndTime=System.currentTimeMillis();
        	cmdTime=cmdEndTime-cmdStartTime;
        	int time=(int) TimeUnit.MILLISECONDS.toSeconds(cmdTime);
        	if(time==0)
        		time=1;
			writer.write("<td><small>" + time +" Sec "+ "</small></td> ");
			writer.write("</tr> ");
			writer.close();
			if (!map.get(packageName + ":" + tc_name).equals("PASS")) {
				map.put(packageName + ":" + tc_name+":", "FAIL");
				//map.put(TestTitleDetails.x.toString(), TestEngine.testDescription.get(TestTitleDetails.x.toString()));
			}
		} catch (Exception e) {

		}

	}

	public void closeDetailedReport(String browser) {

		//String fileName= strTestName;
		strTestName=strTestName.replaceAll("_", " ");	
		File file = new File("Results/HTML"+suiteStartTime+"/" + strTestName+"_Results"
				+ ".html");// "SummaryReport.html"
		Writer writer = null;

		try {
			writer = new FileWriter(file, true);
			writer.write("</table>");
			writer.write("<table id='footer'>");
			writer.write("<colgroup>");
			writer.write("<col style='width: 25%' />");
			writer.write("<col style='width: 25%' />");
			writer.write("<col style='width: 25%' />");
			writer.write("<col style='width: 25%' />");
			writer.write("</colgroup>");
			writer.write("<tfoot>");
			writer.write("<tr class='heading'> ");
			writer.write("<th colspan='4'>Execution Time In Seconds (Includes Report Creation Time) : "
					+ executionTime.get(tc_name)+ "&nbsp;</th> ");
			writer.write("</tr> ");
			writer.write("<tr class='content'>");
			writer.write("<td class='pass'>&nbsp;Steps Passed&nbsp;:</td>");
			writer.write("<td class='pass'> " + PassNum
					+ "</td>");
			writer.write("<td class='fail'>&nbsp;Steps Failed&nbsp;: </td>");
			writer.write("<td class='fail'>" + FailNum
					+ "</td>");
			writer.write("</tr>");
			writer.close();			

		} catch (Exception e) {

		}
	}

	public void closeSummaryReport(String browser) {	
		File file = new File("Results/HTML"+suiteStartTime+"/SummaryResults_"+browser+".html");// "SummaryReport.html"
		Writer writer = null;
		try {
			writer = new FileWriter(file, true);

			writer.write("<table id='footer'>");
			writer.write("<colgroup>");
			writer.write("<col style='width: 25%' />");
			writer.write("<col style='width: 25%' />");
			writer.write("<col style='width: 25%' />");
			writer.write("<col style='width: 25%' /> ");
			writer.write("</colgroup> ");
			writer.write("<tfoot>");
			writer.write("<tr class='heading'>");
			writer.write("<th colspan='4'>Total Duration  In Minutes (Including Report Creation) : "
					+ (iSuiteExecutionTime) + "</th>");
			writer.write("</tr>");
			writer.write("<tr class='content'>");
			writer.write("<td class='pass'>&nbsp;Tests Passed&nbsp;:</td>");
			writer.write("<td class='pass'> " + passCount
					+ "</td> ");
			writer.write("<td class='fail'>&nbsp;Tests Failed&nbsp;:</td>");
			writer.write("<td class='fail'> " + failCount
					+ "</td> ");
			writer.write("</tr>");
			writer.write("</tfoot>");
			writer.write("</table> ");
			writer.close();
			
		} catch (Exception e) {

		}
	}

public void WriteExcelfile() throws IOException {
		
	  HSSFWorkbook workbook = new HSSFWorkbook();
	
	  File dir=new File("Results/HTML"+suiteStartTime);
	  int sheetno = 0;
	  int c = 0;
	  File[] directoryListing = dir.listFiles();
	  if (directoryListing != null) {
	    for (File child : directoryListing) {
	        if(child.getName().endsWith("html"))
	        {
	        System.out.println(child.getName());
	        
	        System.out.println("Entire File Path:"+child.getAbsolutePath());  
	        	sheetno++;
	        	Document html = Jsoup.parse(FileUtils.readFileToString(new File(child.getAbsolutePath())));
	    		
	    		Elements elements = html.body().getElementById("main").getElementsByTag("tr");
	    		
	    		                                      
	    		setTrElements(elements.get(0), new Object[elements.get(0).getElementsByTag("th").size() + 1]);                                  
	    		
	    		for (Element Elemen : elements) {
	    			   
	    			//setTrElements(Elemen, new Object[Elemen.getElementsByTag("th").size() + 1]);// check this place to remove extra line from excel
	    			setElements(Elemen,	new Object[Elemen.getElementsByTag("td").size() ]);
	    		}
	        	
	        	HSSFSheet sheet = workbook.createSheet(child.getName().replace(".html", ""));

	        	Set<Integer> keyset = data.keySet();
	        	
	      
	    		
	    		int rownum = 0;
	    		for (Integer key : keyset) {
	    			Row row = sheet.createRow(rownum++);
	    			Object[] objArr = data.get(key);
	    			int cellnum = 0;
	    			for (Object obj : objArr) {
	    				Cell cell = row.createCell(cellnum++);
	    				if (obj instanceof Date)
	    					cell.setCellValue((Date) obj);
	    				else if (obj instanceof Boolean)
	    					cell.setCellValue((Boolean) obj);
	    				else if (obj instanceof String)
	    					cell.setCellValue((String) obj);
	    				else if (obj instanceof Double)
	    					cell.setCellValue((Double) obj);
	    			
	    				sheet.autoSizeColumn(cellnum);
	    			}
	    		}
	    		
	    		try {
	    			FileOutputStream out = new FileOutputStream(new File("Results/HTML"+suiteStartTime+"/SummaryResults_IE.xls"));
	    				
	    			workbook.write(out);
	    			out.close();
	    			System.out.println("Excel written successfully..");

	    		} catch (FileNotFoundException e) {
	    			e.printStackTrace();
	    		} catch (IOException e) {
	    			e.printStackTrace();
	    		}
	    		for(int i = 0; i<rownum;i++)
	    		{
	    		Object key = data.keySet().iterator().next();
	    		data.remove(key);
	    		}
	        }
	    	else
	        {
	        }
	    
	    }
	  } 
	  else {
	   	  }
		
	  
	}
	

	private void setTrElements(Element es, Object[] m) {

		int y = 0;
		for (Element k : es.getElementsByTag("th")) {
			m[y++] = Jsoup.parse(k.childNodes().get(0).toString()).text();
		}

		data.put(h, m);
		h++;
	}

	private void setElements(Element es, Object[] m) {
		int y = 0;
		for (Element k : es.getElementsByTag("td")) {
			m[y++] = Jsoup.parse(k.childNodes().get(0).toString()).text();
		}

		data.put(h, m);
		h++;
	}
	/*public static void SendSimpleMessage() {
	    HttpClient client = new Client(); 
	    
	    client.addFilter(new HTTPBasicAuthFilter("api","key-3146ad1438f23839acf67735c2acade0"));
	    WebResource webResource =
	        client.resource("https://api.mailgun.net/v3/sandbox64f3e1f8fdcb4530850fd11f3cce01e8.mailgun.org/messages");
	    MultivaluedMapImpl formData = new MultivaluedMapImpl();
	    formData.add("from", "Mailgun Sandbox <postmaster@sandbox64f3e1f8fdcb4530850fd11f3cce01e8.mailgun.org>");
	    formData.add("to", "rajesh <rajesh.nadella@gmail.com>");
	    formData.add("subject", "Hello rajesh");
	    formData.add("text", "Congratulations rajesh, you just sent an email with Mailgun!  You are truly awesome!  You can see a record of this email in your logs: https://mailgun.com/cp/log .  You can send up to 300 emails/day from this sandbox server.  Next, you should add your own domain so you can send 10,000 emails/month for free.");
	    return webResource.type(MediaType.APPLICATION_FORM_URLENCODED).
	                                                post(ClientResponse.class, formData);
	}*/
	    
	public  void iterationReport(int iLoop,String strStatus) throws Throwable{


		File file = new File("Results/HTML"+suiteStartTime+"/" + strTestName + "_Results"
				+ ".html");
		Writer writer = null;

		try {
			iStepNo = 0;
			writer = new FileWriter(file, true);
			writer.write("<tr class='content2'>");
			if(strStatus.equalsIgnoreCase("Start"))
			{
				writer.write("<td colspan='2' height='25' ><b> TestCase-ID"+iLoop+"</b></td>");
				writer.write("<td colspan='3' height='25' ><b>Started</b></td>");
			}
			else if(strStatus.equalsIgnoreCase("Order"))
			{
				writer.write("<td colspan='2' height='25' ><b> TestCase-ID"+iLoop+" </b></td>");
				writer.write("<td colspan='4' height='25' ><b> Completed and Order No : "+orderNumber+"</b></td>");
			}
			else{
				writer.write("<td colspan='2' height='25' ><b> TestCase-ID"+iLoop+" </b></td>");
				writer.write("<td colspan='4' height='25' ><b> Completed</b></td>");
			}
			writer.write("</tr> ");
			writer.close();
			}catch (Exception e) {
			e.printStackTrace();
		}

	}	
	
	/*public void openBrowser(){
		
		
		if(browsertype.equalsIgnoreCase("firefox"))
		{
			webDriver = new FirefoxDriver();
			i=i+1;
		}
		else if(browsertype.equalsIgnoreCase("ie"))
		{
			File file = new File("Drivers/IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			webDriver= new InternetExplorerDriver();
			i=i+1;
		}
		else if(browsertype.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");				
			webDriver=new ChromeDriver();
			i=i+1;

		}

		driver = new EventFiringWebDriver(webDriver);
		System.out.println("url opened"+e1url);
		MyListener myListener = new MyListener();
		driver.register(myListener);

		try {

			if(browsertype.equalsIgnoreCase("IE")){
				driver.manage().timeouts().implicitlyWait(5 * 2, TimeUnit.SECONDS);
			}
			else{
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}

			if(browsertype.equalsIgnoreCase("Firefox") || browsertype.equalsIgnoreCase("IE") || browsertype.equalsIgnoreCase("Chrome"))
			{
				driver.manage().window().maximize();
			}
				
			
			driver.get(e1url);
			
		} catch (Exception e1) {
			System.out.println(e1);
		}
	}
	*/
	
	//FirefoxProfile
	
	
	public static FirefoxProfile FirefoxDriverProfile() throws Exception {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 1);
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		//profile.setPreference("browser.download.dir", downloadPath);
		profile.setPreference("browser.helperApps.neverAsk.openFile",
				"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.download.manager.focusWhenStarting", false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		profile.setPreference("browser.download.manager.closeWhenDone", false);
		profile.setAcceptUntrustedCertificates (true); 
		return profile;
	}
	
	

}
