package com.objectRepository;

import org.openqa.selenium.By;

import com.accelerators.ActionEngine;

public class bank extends ActionEngine
{
    public By bankte =By.xpath("//span[contains(.,'Citizens Bank - regionalization')]");
    public By bankcredit=By.linkText("Banking & Credit Cards");
    public By subbankandcredit=By.xpath("//a[@href='/everyday-banking/overview.aspx']");
    public By bankcredittext=By.xpath("//h1[contains(.,'Banking and Credit Cards')]");
    public By explorecheckingaccount=By.xpath("//a[contains(.,'EXPLORE CHECKING ACCOUNTS ')]");
    public By openaccount=By.linkText("Open Account");
   public By zip=By.xpath("//input[@data-val-regex='Please enter a valid 5-digit Zip Code.']");
   public By checkbox=By.id("IsOLB");
   public By contbutton=By.xpath("//input[@class='OLBButton']");
   public By username=By.xpath("//input[@id='Applicant_FirstName']");
   public By lastname=By.xpath("//input[@id='Applicant_LastName']");
   public By login=By.xpath("//input[@class='OLBButton']");
   public By platinumaccount=By.xpath("//input[@data-val-required='The IsCrossSell field is required.']");
   public By dropdown=By.id("Applicant_PhoneNumberType");
   public By phonenumber=By.xpath("//input[@id='Applicant_PhoneNumber_AreaCode']");
   public By nextbutton=By.xpath("//input[@id='NextButton']");
   public By moblile=By.xpath("//a[contains(.,'mobile')]");
   public By onlinebanking=By.xpath("//a[contains(.,'Online Banking: Enroll Now ')]");
   public By lastfourssn=By.xpath("//input[@class='required number-only demo-ssn tooltip-validate']");
   public By accountnumber=By.id("accountNumber");
   public By atmcaedpin=By.id("cardPin");
   public By atmdebitcard=By.id("cardNumber");
   public By  nextbutto=By.id("VerifyBtn");
   public By overdraft5=By.xpath("//a[contains(.,'$5 Overdraft Pass®')]");
   public By overdraftchoice=By.xpath("//a[@class='button overdraft-choices']");
   public By findbranch=By.xpath("//a[@href='/branchlocator/']");
   public  By zipcodeserch1=By.xpath("//input[@autocomplete='off']");
   public By findbutton=By.xpath("//a[@class='findBranchBtn cta_btn']");
   public By branches=By.xpath("//p[contains(.,'Branches')]");
   public By atm=By.xpath("//div[@class='icon_atm icon_left filter_icon']");
   public By supermarket=By.xpath("//p[contains(.,'Supermarket Branches')]");
   public By voiceassistanceatm=By.xpath("//p[contains(.,'Voice Assisted ATMs')]");
   public By opennow=By.xpath("//p[@class='open_time']");
   public By cumberlandfarm=By.xpath("//h2[contains(.,'Cumberland Farms')]");
   public By savingaccount=By.xpath("//a[@href='/savings/overview.aspx']");
   public By exploresavingaccount=By.xpath("//a[contains(.,'EXPLORE SAVINGS ACCOUNTS')]");
   public By applynow=By.xpath("//a[@class='cta_btn']");
   public By savingcalculator=By.xpath("//h4[contains(.,'Savings Goal Calculator')]");
   public By savinggoal=By.xpath("//input[@id='KJE-AMT_TARGET']");
   public By monthlysavimg=By.xpath("//input[@id='KJE-AMT_SAVE_MONTH']");
   public By calculate=By.xpath("//input[@id='KJECalculate']");
   public By meetmoneymarket=By.xpath("//a[contains(.,'MEET OUR  MONEY MARKETS')]");
   public By platinummoney=By.xpath("//a[@href='/apps/pfdeposits/gettingstarted.aspx?productid=299']");
   public By cdsuit=By.xpath("//a[contains(.,'WHICH CD SUITS YOUR GOALS?')]");
   public By citizenonebank=By.xpath("//a[contains(.,'Visit CitizensOne.com')]");
   public By students=By.xpath("//a[@href='/student-services.html']");
   public By parents=By.xpath("//a[contains(.,'For Parents')]");
   public By applynow1=By.xpath("//span[@class='button left-nav-btn ctz-icon-arrow link-btn-tertiary']");
   public By tellus=By.xpath("//select[@id='ApplicantType']");
   public By selectschool=By.xpath("//a[contains(.,'Select school')]");
   public By state=By.xpath("//select[@id='schState']");
   public By nameofuni=By.xpath("//input[@name='searchText']");
   public By universityname=By.xpath("//div[contains(@class,'col-sm-2 sch-code')]");
   public By seeexample=By.xpath("//a[contains(.,'(see examples)')]");
   public By firstselect=By.id("rt-rate-type");
   public By secondselect=By.id("rt-trufit-borrower-type");
   public By thirdselect=By.id("rt-trufit-loan-type");
   public By forthsedlect=By.id("rt-term");
   public By undergraduatestudent=By.xpath("//a[contains(.,'Undergraduate Students')]");
   public By calculator=By.xpath("//p[contains(.,'Estimate the monthly payments for your loan terms.')]");
   public By slicebar=By.xpath("//div[@style='left: 38.3146px;']");
   public By graduate=By.xpath("//strong[contains(.,'GRADUATE BUSINESS AND LAW')]");
   public By apply1=By.xpath("//a[@class='btn btn-apply-bar']");
   public By phrame=By.xpath("//div[@style='width: 71%; margin-left: auto; margin-right: auto; margin-top: 0; margin-bottom: 50px;']");
   public By students1=By.xpath("//strong[contains(.,'PARENT')]");
  public By viewcalander=By.xpath("//span[contains(.,'View Calendar')]");
  public By january=By.xpath("//a[@href='#january']");
  public By february=By.xpath("//a[@href='#february']");
  public By getmyrate=By.xpath("//span[contains(.,'Get My Rate')]");
  public By currentlyinschool=By.xpath("//input[@id='NoCurrentlyEnrolled']");
  public By firstname1=By.xpath("//input[@data-val-length-max='15']");
  public By lastname1=By.xpath("//input[@data-val-length-max='35']");
  public By streetname=By.xpath("//input[@data-val-length-max='40']");
  public By appartment=By.xpath("//input[@data-val-length-max='50']");
  public By checkbox1=By.xpath("//input[@class='read-disclosure-checkbox ea-triggers-bound']");
  public By meidcaldentalstudent=By.xpath("//a[@href='/student-loans/graduate-loans/medical-dental-school.html']");
  public By fafsa=By.xpath("//a[contains(.,'Do I need to file the Free Application for Federal Student Aid (FAFSA) form to apply for a student loan?')]");
  public By borrowstugent=By.xpath("//a[contains(.,'How much can I borrow as a graduate student with a Citizens One Student Loan?')]");
  public By homeborrwing=By.xpath("//a[@href='/home-loans.html']");
  public By homefinancialsolution=By.xpath("//a[@href='/home-loans/financing.html']");
  public By actnow=By.xpath("//span[@class='button left-nav-btn ctz-icon-arrow link-btn-tertiary']");
  public By startnewapplication=By.xpath("//label[@for='LoginStart_New']");
  public By createuserid=By.id("CreateUserCode");
  public By createpassword=By.id("CreatePassword");
  public By repassword=By.id("ConfirmPassword");
  public By next=By.xpath("//button[@id='submitButton']");
  public By homeborrowuing=By.linkText("Home Borrowing");
  public By homeloanprogrram=By.xpath("//a[@href='/home-loans/loan-programs.html']");
  public By talktohomeloanoraganizer=By.xpath("//a[contains(.,'talk to a Home Loan Originator')]");
  public By whatstate=By.id("Q1779");
  public By whtcounty=By.id("level2Key");
  public By nextbutoon=By.xpath("//button[@aria-disabled='false']");
  public By creditcard1=By.linkText("Credit Cards");
  public By registernow1=By.xpath("//a[contains(.,'Register Now')]");
  public By learnmore=By.linkText("LEARN MORE");
  public By register=By.xpath("//input[@class='buttonImage']");
  public By nameappeard=By.xpath("//input[@autocomplete='off']");
  public By accountnumber1=By.xpath("//input[@name='acct_num.acct1']");
  public By accountnumbet2=By.xpath("//input[@name='acct_num.acct2']");
  public By accountnumber3=By.xpath("//input[@name='acct_num.acct3']");
  public By accountnumber4=By.xpath("//input[@name='acct_num.acct4']");
  public By next1=By.xpath("//input[@value='Next']");
  public By learnmoreckip=By.xpath("//a[@class='link-email-tertiary']");
  public By activecard=By.xpath("//span[contains(.,'ACTIVATE YOUR CARD')]");
  public By activeandregisternow=By.xpath("//img[@alt='Activate and Register to Manage Your Card Account Online']");
  public By learnmore2=By.xpath("//a[@href='Credit-Cards/estatements/index.html']");
  public By clickhere=By.xpath("//img[@alt='Click Here']");
  public By learnmore3=By.xpath("//a[@href='Credit-Cards/balancetransfer/index.html']");
  public By question1=By.xpath("//b[contains(.,'Q: If I take advantage of this offer, can I avoid interest on new purchases?')]");
  public By question2=By.xpath("//b[contains(.,'Q: Is there a fee to take advantage of this promotional offer?')]");
  public By personloan=By.linkText("Personal Loans");
  public By debtconsoliation=By.xpath("//img[@src='/images/ctz-personal-loans/plus-icon.png']");
  public By estimatepayment=By.xpath("//a[@data-reveal-id='debt-modal']");
  public By securelogin=By.xpath("//select[@class='input']");
  public By login1=By.xpath("//a[contains(.,'Login')]");
  public By makeloanpaymernt=By.xpath("//span[@class='button left-nav-btn ctz-icon-arrow link-btn-tertiary payment-btn']");
  public By continuefirstmakerservice=By.xpath("//a[@class='button btn-third left-nav-btn ctz-icon-arrow interstitialbtn']");
  public By aytofinance=By.xpath("//a[@href='/auto-finance.html']");
  public By paymyloan=By.xpath("//a[@href='/customer-service/pay-my-loan.html']");
  public By setrecurrentpayment=By.xpath("//span[contains(.,'Set-up Recurring Payments')]");
  public By uname=By.xpath("//input[@id='login']");
  public By password=By.xpath("//input[@autocomplete='off']");
  public By submit=By.xpath("//input[@id='submitButton']");
  public By accessautoloan=By.xpath("//a[@href='https://www3.citizensbankonline.com/efs/servlet/efs/login.jsp']");
  public By onlineuserid=By.xpath("//input[@autocomplete='off']");
  public By password1=By.xpath("//input[@class='required demo-password']");
  public By loginandaccept=By.xpath("//input[@class='submit-button arrow']");
  public By comparecreditcard=By.xpath("//a[contains(.,'COMPARE CREDIT CARDS ')]");
  public By learnmre=By.xpath("//a[@class='text_cta icon_right icon_arrow']");
  public By applynw=By.xpath("//a[contains(.,' Apply Now ')]");
  public By name=By.xpath("//input[@id='firstName']");
  public By birthmonth=By.xpath("//select[@name='birthdate.month']");
  public By mobliareacode=By.xpath("//input[@id='mobilePhoneAreaCode']");
  public By mobilephone1=By.xpath("//input[@id='mobilePhone1']");
  public By mobliephone2=By.xpath("//input[@id='mobilePhone2']");
  public By streetaddress=By.xpath("//input[@id='address_addressLine1']");
  public By zeroliability=By.xpath("//h4[contains(.,'Zero Liability')]");
  public By fulldefence=By.xpath("//h2[contains(.,'Full defense against unauthorized transactions')]");
  public By discoveronline=By.xpath("//a[contains(.,'DISCOVER ONLINE AND MOBILE BANKING')]");
  public By onlinebanking1=By.xpath("//h2[contains(.,'Online Banking')]");
  public By securepaymnet=By.xpath("//h2[contains(.,'Secure Payments and Transfers')]");
  public By allcheckingaccount=By.xpath("//a[@class='icon_right icon_arrow text_cta']");
  public By checkinaccountwork=By.xpath("//h4[contains(.,'How your Checking Account Works')]");
  public By ovedraftchoce=By.xpath("//a[@class='button overdraft-choices']");
  public By savingoverdraft=By.xpath("//a[@name='savings-overdraft-protection']");
  public By greensaving=By.xpath("//a[@href='/savings-and-cds/savings/green-savings.aspx']");
  public By platinumsaving=By.xpath("//a[contains(.,'Platinum Savings')]");
  public By platinumplus=By.xpath("//a[contains(.,'Platinum Plus Savings')]");
  public By comparechoice=By.xpath("//img[@alt='Compare Choices']");
  public By closecomparechoice=By.xpath("//button[@id='cboxClose']");
  public By compareeligibleaccount=By.xpath("//img[@alt='Compare Eligible Savings Accounts']");
  public By closeelegibleaccont=By.xpath("//button[@id='cboxClose']");
  public By overdraftlineof=By.xpath("//a[@name='overdraft-protection-line-of-credit']");
  public By avilablebalance=By.xpath("//a[@data-tooltip-key='AVAILABLE_BALANCE']");
  public By overdraftcoverage=By.xpath("//a[@name='standard-overdraft-practices']");
  public By checkandpreautorized=By.xpath("//span[contains(.,'Checks and Pre-authorized Payments Overdraft Coverage')]");
  public By returnitemfee=By.xpath(".//*[@id='bd']/div[2]/div[4]/div[2]/div[2]/table/tbody/tr[2]/td[3]/p/a");
  public By comparechoices=By.xpath(".//*[@id='bd']/div[2]/div[4]/div[2]/div[2]/div[3]/a/img");
  public By closecomparechoices=By.xpath("//button[@id='cboxClose']");
  public By howyourcheckingaccountworks=By.xpath("//a[@href='how-checking-accounts-work.aspx']");
  public By whereandwhenmakedeposite=By.xpath("//span[contains(.,'Where and when you  can make deposits')]");
  public By whenyourdepositavailanle=By.xpath(".//*[@id='bd']/div[2]/ul/li[3]/a/span/span");
  public By howdebitcardpurchgasework=By.xpath("//a[@name='how-debit-card-purchases-work']");
  public By howtransitionappliedonaccount=By.xpath(".//*[@id='bd']/div[2]/ul/li[5]/a/span/span");
  public By managingaccountwisley=By.xpath(".//*[@id='bd']/div[2]/ul/li[6]/a/span/span");
  public By checkingaccount1=By.xpath("//a[contains(.,'Checking Accounts')]");
  public By openaccount1=By.xpath("//a[@class='cta_btn']");
  public By changeyourlocation=By.xpath("//a[contains(.,'Change Your Location')]");
  public By zipinput=By.xpath("//input[@id='zip_input']");
  public By submit2=By.xpath("//a[@id='zip_submit']");
  public By specifieyourloaction=By.linkText("Specify Your Location");
  public By comparecheckingaccount=By.xpath("//a[contains(.,'Compare checking account benefits ')]");
  public By platiniumplus=By.xpath(".//*[@id='table-view']/div[1]/table[1]/tbody/tr[2]/td[4]/div/a");
  public By savingaccountoption=By.xpath("//a[contains(.,'Savings Account Options')]");
  public By comparesaving=By.xpath(".//*[@id='table-view']");
  public By applynow2=By.xpath(".//*[@id='table-view']/div[1]/table[1]/tbody/tr[2]/td[2]/div/a");
  public By moneymarketaccount=By.xpath("//a[contains(.,'Money Market Accounts')]");
  public By openaccount3=By.xpath(".//*[@id='list-view']/section[3]/div/div/div[1]/div[1]/p[5]/a");
  public By certificateofdeposit=By.xpath("//a[contains(.,'CDs (Certificates of Deposit)')]");
  public By learnmore4=By.xpath(".//*[@id='list-view']/section[3]/div/div/div/div[1]/p[4]/a");
  public By openaccount5=By.xpath(".//*[@id='1475881213663']/section/div[2]/div[1]/div/a[1]");
  public By irasaing=By.xpath("//a[contains(.,'IRA Savings & CDs')]");
  public By irasavinglearnmore=By.xpath("//a[@href='/savings/savings-accounts/retirement-savings-plans/ira.aspx']");
 public By compareiraaccount=By.xpath("//a[contains(.,'COMPARE ALL IRA ACCOUNTS')]");
 public By learnmore5=By.xpath(".//*[@id='list-view']/section[1]/div/div/div/div[1]/p[2]/a");
 public By accountdocument=By.xpath("//a[@href='/account-pdfs/overview.aspx']");
 public By checkingaccountexpand=By.xpath("//a[@aria-expanded='true']");
 public By savingaccountexpand=By.xpath("//a[@href='#panel20170518164713']");
 public By irssavingexpand=By.xpath("//a[@href='#panel20170518165411']");
 public By cashbackplus=By.xpath("//h3[contains(.,'Cash Back Plus® World Mastercard ®')]");
 public By borrowing=By.linkText("Borrowing");
 public By subborrowing=By.xpath("//a[@href='/loans/overview.aspx']");
 public By homemortage=By.xpath("//a[contains(.,'MORTGAGE OPTIONS')]");
 public By uparo=By.xpath("//img[@src='/assets/CB_resources/images/HLS_icon.png']");
 public By closeuparo=By.xpath("//a[@class='hls_close-reveal-modal repayment_modal_close']");
 public By getstert=By.xpath("//a[@class='cta_btn']");
 public By changloca=By.linkText("Change Your Location");
 public By homemortage1=By.xpath("//a[contains(.,'Home Mortgages')]");
 public By adjustablerate=By.linkText("Adjustable Rate");
 public By seconguparrow=By.id("mortgagetest_6");
 public By closesecondupaerrow=By.linkText("×");
 public By homeequityloan=By.xpath("//a[@href='/home-equity-loans/rates-and-products.aspx']");
 public By homeeqiutylearn=By.xpath(".//*[@id='1482132411521']/section/div/div/div[2]/div[2]/section/a[2]");
 public By homeequityapply=By.xpath("//a[@id='apply-now']");
 public By propertyloaction=By.xpath("//select[@id='footprint-state']");
 public By coapplicant=By.xpath("//input[@data-ng-value='false']");
 public By amountrequisted=By.xpath("//input[@id='amountRequested']");
 public By loanpurpose=By.xpath("//button[@class='btn btn-default dropdown-toggle ng-binding error']");
 public By homeloancontinue=By.xpath("//button[@id='continue-button']");
 public By loanpurpose1=By.className("btn-group");
 public By chechall=By.xpath("//button[@ng-click='checkAll()']");
 public By firstname=By.xpath("//input[@id='appPersonalControllerfirstName']");
 public By birthdate=By.xpath("//input[@id='appPersonalControllerdob']");
 public By conactinfo=By.xpath("html/body/div[2]/div[3]/form/div[1]/div/div/div/div[2]/div/div/div/div[2]");
 public By primaryresidency=By.xpath("html/body/div[2]/div[3]/form/div[1]/div/div/div/div[3]/div/div/div/div[2]");
 public By personalloan=By.linkText("Personal Loans");
 public By appynow9=By.xpath(".//*[@id='1475740396242']/section/div/div/ul/li[3]/div/a");
 public By startnewapplication1=By.xpath(".//*[@id='mainBody']/div[1]/div[1]/div/div[3]/div/div[1]/a");
 public By tooltip=By.xpath("//a[@more-help-id='HTxt_LoanAmt']");
 public By from=By.linkText("Forms");
 public By heading=By.xpath("//div[@class='sub-heading1']");
 public By submenu=By.linkText("Income Authorization Form");
 public By startover=By.className ("startover");
 public By faq=By.linkText("Help & FAQs");
 public By whatisrater=By.id("question");
 public By ratequate=By.id("question");
 public By creditscore=By.xpath("//div[contains(.,'Will a rate quote  have an impact on my credit score?')]");
 public By edxpandall=By.xpath(".//*[@id='expand-all-button']");
 public By example=By.xpath("//p[contains(.,'View Examples')]");
 public By amountborrow=By.xpath(".//*[@id='rt-borrow-amount']");
 public By calculatepaymnet=By.xpath("//p[contains(.,'Calculate my Payments')]");
 public By scroll=By.xpath("//div[@style='left: 136.178px;']");
 public By heighrescore=By.xpath("//div[@data-credit-score-id='7']");
 public By fouryears=By.xpath("//span[contains(.,'4 YEARS(48 MONTHS)')]");
 public By applyi=By.xpath(".//*[@id='calc-form-apply-now-button']");
 public By learnmorehomeequity=By.xpath(".//*[@id='1479713105900']/section/div/div[2]/div/div/p[4]/a");
 public By startnow1=By.xpath("//p[contains(.,'Start now ')]");
 public By whrehomelocated=By.xpath("//select[@class='form-control']");
 public By amountuwanttoborrow=By.xpath("//input[@data-val-minimumvalue-allowequals='True']");
 public By payoffcurrentradio=By.xpath("//input[@id='PayOffMortgageNo']");
 public By calculate1=By.xpath("//button[@id='CalculateButton']");
 public By startsaving=By.xpath("//p[contains(.,'Start saving ')]");
 public By purchasepriceofloan=By.xpath("//input[@id='KJE-PURCHASE_PRICE']");
 public By downpayment=By.xpath("//input[@id='KJE-DOWNPAYMENT_PERCENT']");
 public By calculate2=By.xpath("//input[@id='KJECalculate']");
 public By homeloanorganoz=By.xpath("//h3[contains(.,'Home Loan Originator NMLS Status')]");
 public By studentlending1=By.linkText("Student Lending");
 public By substudentlending=By.xpath("//a[@href='/student-lending/overview.aspx']");
 public By explorestudentloan=By.xpath("//a[contains(.,'EXPLORE OUR STUDENT LOANS')]");
 public By applyforstudentloan=By.xpath("//a[contains(.,'Apply for a Student Loan')]");
 public By selectloantype=By.xpath("//select[@id='ApplicantLoanOption']");
 public By citizenbankcustomet=By.xpath("//input[@aria-labelledby='spnrucustomer rucustomerno']");
 public By studentloan=By.xpath("//a[@href='/student-lending/student-loans.aspx']");
 public By appynow2=By.xpath(".//*[@id='1475287169899']/section/div/div/ul/li[3]/div/a");
 public By studentloanforparent=By.xpath("//a[@href='/student-lending/parent-loans.aspx']");
 public By explorestudentloanforparent=By.xpath("//a[contains(.,'EXPLORE OUR STUDENT LOAN FOR PARENTS ')]");
 public By appynow3=By.xpath(".//*[@id='1468499032781']/section/div/div/ul/li[3]/div/a");
 public By mbastudent=By.linkText("MBA Students");
 public By exploringgradutestudent=By.linkText("EXPLORE GRADUATE SCHOOL LOANS");
 public By appynow4=By.xpath(".//*[@id='1469014501556']/section/div/div/div[1]/div/p[5]/a");
 public By accessexistapplecation=By.xpath(".//*[@id='mainBody']/div[1]/div[1]/div/div/div[3]/div/a");
 public By uploadapplication=By.linkText("Upload Documents");
 
 
 
 
 
 
 
 
 
 
 
 
  
  
  
  
  
  
  
  
  
   
   
		   
   
		   
   
   
   
   
    
}
