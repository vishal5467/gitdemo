package com.objectRepository;

import org.openqa.selenium.By;

import com.accelerators.ActionEngine;

public class bcbs extends ActionEngine
{
	public By bluecross=By.xpath("//img[@title='Blue Cross Blue Shield of Michigan and Blue Care Network are Michigan health insurance companies.']");
    public By findplan=By.xpath("//a[@id='Find Plans']");
    public By indiv=By.xpath("//a[@aria-labelledby='Individual and Family']");
    public By popup=By.className("acsCloseButton acsAbandonButton ");
    public By jobloss=By.xpath("//a[contains(.,'Job Loss')]");
    public By joblosstext=By.xpath("//small[contains(.,'Qualifying Life Event')]");
    public By marriage=By.xpath("//a[@href='/index/plans/michigan-health-insurance/qualifying-event-special-enrollment/marriage.html']");                                                                                                               
     public By marriagetext=By.xpath("//h1[contains(.,'Marriag                   Qualifying Life Event           ')]");
     public By birth=By.xpath("//a[@href='/index/plans/michigan-health-insurance/qualifying-event-special-enrollment/birth.html']");
     public By turnig26=By.xpath("//a[@href='/index/plans/michigan-health-insurance/qualifying-event-special-enrollment/age-26.html']");
   public By individualhealth=By.xpath("//a[contains(.,'Individual and Family Health Plans')]");
   public By dental=By.xpath("//a[@aria-labelledby='Dental and Vision']");
   public By howindividual=By.xpath("//a[@aria-label='How do blue dental individual plans works']");
   public By affordabalecare=By.xpath("//a[@href='/index/health-insurance-help/faqs/topics/health-care-reform/whats-the-affordable-care-act.html']");
   public By findplan1=By.xpath("//a[@arial-label='button for find a Plan']");
   public By howinsurancework=By.xpath("//a[@href='/index/health-insurance-help/faqs/topics/how-health-insurance-works.html']");
   public By buyinghealthinsurance=By.xpath("//a[@href='/index/health-insurance-help/faqs/topics/buying-insurance.html']");
   public By understadningmybenfit=By.xpath("//a[@href='/index/health-insurance-help/faqs/topics/understanding-benefits.html']");
   public By gettingcare=By.xpath("//a[@href='/index/health-insurance-help/faqs/topics/getting-care.html']");
   public By manageaccount=By.xpath("//a[@href='/index/health-insurance-help/faqs/topics/managing-my-account.html']");
   public By claim=By.xpath("//a[@href='/index/health-insurance-help/faqs/topics/claims/claims-faq.html']");
   public By reform=By.xpath("//a[@href='/index/health-insurance-help/faqs/topics/health-care-reform.html']");
   public By othertopic=By.xpath("//a[@href='/index/health-insurance-help/faqs/topics/other-topics.html']");
   public By popup1=By.linkText("No, thanks");
   public By yeslogin=By.xpath("//a[@arial-label='button for Preview 2017 plans']");
   public By username=By.xpath("//input[@id='j_username']");
   public By password=By.xpath("//input[@id='j_password']");
   public By login1=By.xpath("//button[@class='btn btn-success continue']");
   public By closeloginwindow=By.xpath("//button[@class='close']");
   public By chatonline=By.xpath("//a[@aria-label='Chat with one of our online representatives']");
   public By onlinename=By.xpath("//input[@name='full_name']");
   public By onlineemail=By.xpath("//input[@name='email_address']");
   public By startchat=By.xpath("//input[@type='submit']");
   public By livechat=By.xpath("//img[@alt='offline-live-chat-icon']");
   public By livechatname=By.xpath("//input[@aria-label='First Name']");
   public By lastnamecht=By.xpath("//input[@aria-label='Last Name']");
   public By addresscht=By.xpath("//input[@aria-label='Address']");
   public By city=By.xpath("//input[@aria-label='City']");
   public By selectcht=By.xpath("//select[@aria-labelledby='select-state states']");
   public By emaillive=By.xpath("//select[@aria-labelledby='select-state states']");
   public By phonelive=By.xpath("//input[@aria-label='Phone']");
   public By ageselect=By.xpath("//select[@aria-labelledby='select-age age']");
   public By radiocheckbox=By.xpath("//input[@id='radiobutton_1']");
   public By radiodentalcheck=By.xpath("//input[@id='dental']");
   public By longtermcheck=By.xpath("//input[@id='long-term-care']");
   public By livesublit=By.xpath("//button[@class='btn btn-large btn-primary']");
   public By dentalppo=By.xpath("//a[@href='/index/plans/dental-insurance-michigan/2017/ppo.html']");
   public By allagespdf=By.xpath("//a[@href='/content/dam/public/Consumer/Documents/find-plans/2017/certificates/blue-dental.pdf']");
   public By ppostandard=By.xpath("//a[@href='/index/plans/dental-insurance-michigan/2017/ppo-plus.html']");
   public By medicare=By.xpath("//a[@aria-labelledby='Medicare']");
   public By medicareadvanceplan=By.xpath("//a[@adhocenable='false']");
   public By viewextendsplan=By.xpath("//a[@href='/medicare/plans/2017-ma/extended.html']");
   public By viewplandetail =By.xpath("//a[@aria-label='View Medicare Plus Blue PPO Assure plan details.']");
   public By findpharmacy=By.xpath("//a[@href='/medicare/help/understanding-plans/pharmacy-prescription-drugs/find-network.html']");
   public By findapharmacy=By.xpath("//a[@alt=' ']");
   public By localpharmacy=By.xpath("//input[@id='zip']");
   public By medicareppo=By.xpath("//a[@href='/content/dam/microsites/medicare/documents/2017/provider/ppo-directory-intro.pdf']");
   public By medicarepriscriptiondrug=By.xpath("//a[contains(.,'Part D prescription drug plans')]");
   public By dollarplan28=By.xpath("//a[@class='button external']");
   public By networkpharmaacy=By.xpath("//a[contains(.,'67,000 network pharmacies')]");
   public By cvsspecialist=By.xpath("//a[@data-tooltip='Members - access your Basic Blue Rx account for specialty pharmacy by logging in on the CVS/Caremark customer portal.']");
   public By Cvsvideo=By.xpath("//a[@class='watch-video']");
   public By pharmacynetwork=By.xpath("//a[contains(.,'About our pharmacy network')]");
   
  public By monthlyppo89=By.xpath("//a[@class='button internal']");
  public By login=By.xpath("//a[@class='login internal']");
  public By uname=By.id("//input[@id='j_username']");
  public By password1=By.xpath("//input[@class='pwd-margin']");
  public By employer=By.xpath("//a[@id='log-in-employer']");
  public By employerlogin=By.xpath("//input[@id='userId']");
  public By employerpass=By.xpath("//input[@id='passwordEmployer2016']");
  public By windowsub=By.xpath("//button[@class='button-margin']");
  public By windowsub2=By.xpath("//button[@class='loginbutton']");
  public By member=By.xpath("//a[@id='log-in-member']");
  public By resisternow=By.xpath("//a[@href='https://member.bcbsm.com/mpa/register/']");
  public By alreadymember=By.xpath("//a[@class='newMember internal']");
  public By registernow=By.xpath("//a[@class='greenButton internal']");
  public By firstname=By.xpath("//input[@aria-label='Enter your first name here.']");
  public By lastname=By.xpath("//input[@aria-label='Enter your last name here.']");
  public By month=By.xpath("//select[@class='month input-medium']");
  public By day=By.xpath("//select[@class='day input-small']");
  public By year=By.xpath("//input[@class='year input-mini']");
  public By idnumber=By.xpath("//input[@id='enrolleeIdInput']");
  public By idonothaveid=By.xpath("//a[@class='toggleLink boldText']");
  public By enretemail=By.xpath("//input[@class='input-large']");
  public By continuesubmit=By.xpath("//button[@class='btn btn-success continue']");
  public By visitmedicaresite=By.xpath("//a[@class='blueButtonLong floatRight internal']");
  public By serch=By.name("q");
  public By serchbutton=By.xpath("//button[@aria-label='submit-search']");
  public By page3=By.xpath("//a[contains(.,'3')]");
  public By home=By.xpath("//a[@role='button']");
  public By bcucarelogo=By.xpath("//img[@alt='Blue Cross Blue Shield of Michigan']");
  public By contactus=By.xpath("//a[@id='mainContactUsLink']");
  public By medicareandstate=By.xpath("//a[@aria-labelledby='Medicaid and State Plans']");
  public  By doctor=By.xpath("//a[@aria-label='Find a Doctor']");
  public By finddoctor=By.xpath("//span[contains(.,'Find a doctor')]");
  public By all=By.xpath("//button[@class='btn btn-primary dropdown-toggle prov-list']");
  public By mentalhealth=By.xpath("//a[@data-value='Mental Health']");
  public  By mentalserch=By.xpath("//input[@id='search-input']");
  public By mentalzip=By.xpath("//input[@id='address']");
  public  By mentalserchbutton=By.xpath("//input[@class='btn btn-primary btn-large']");
  public By clooindoctor=By.xpath("//input[@data-compareid='350271']");
  public By naranyan=By.xpath("//input[@data-compareid='97495']");
  public  By compareserch=By.xpath("//a[@data-compareid='97495']");
  public By findapharmacy1=By.xpath("//span[contains(.,'Find a pharmacy')]");
  public By pharmacyselect=By.xpath("//select[@class='stateInput']");
  public  By pharmacyserch=By.xpath("//input[@class='zipInput']");
  public By pharmacrbutton=By.xpath("//button[@aria-disabled='false']");
  public By distancephar=By.xpath("//select[@class='margin-for-text-and-label withinEntryOneMenue']");
  public By  mentalhealthfilter=By.xpath("//button[@id='sortResults']");
  public By filter2=By.xpath("//a[@data-value='2']");
  public By logo=By.xpath("//img[@alt='Better Business Bureau Online Seal of Reliability']");
  public By arrow=By.xpath("//div[@class='accordian-downcarat2']");
  public By arrow2=By.xpath("//div[@class='accordian-downcarat2']");
  public By print=By.xpath("//img[@alt='Print icon']");
  public By informatiobn =By.xpath("//a[contains(.,'Information for Healthy Michigan Plan members')]");
  public By public1=By.xpath("//a[@rel='/content/microsites/blue-cross-complete/en/benefits/healthy-michigan/benefits.html .par']");
  public By dentalcare=By.xpath("//a[@rel='/content/microsites/blue-cross-complete/en/benefits/healthy-michigan/dental.html .par']");
  public By hearingcare=By.xpath("//a[@rel='/content/microsites/blue-cross-complete/en/benefits/healthy-michigan/hearing.html .par']");
  public By hebilativ=By.xpath("//a[@rel='/content/microsites/blue-cross-complete/en/benefits/healthy-michigan/habilitative.html .par']");
  public By finddoctor1=By.xpath("//a[@id='find-doctor']");
  public By finddoctortext=By.xpath("//h1[contains(.,'Find a Doctor, Pharmacy or Dentist')]");
  public By groupplan=By.xpath("//a[@aria-labelledby='Group Plans']");
  public By productandservice=By.xpath("//a[@id='Products and Services']");
  public By productandvision=By.xpath("//a[@aria-labelledby='Dental and Vision']");
  public By bluevision=By.xpath("//a[@adhocenable='false']");
  public By pricacyexchange=By.linkText("Private Exchanges");
  public By coveraglogo=By.xpath("//img[@alt='Learn more about Coverage for Companies']");
  public By youtubeclick=By.xpath("//div[@class='ytp-cued-thumbnail-overlay-image']");
  public By youtubeloop=By.xpath("//div[contains(.,'Loop')]");
  public By move=By.xpath("//div[@class='ytp-cued-thumbnail-overlay-image']");
  public By cvsvideo1=By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-red2']");
  public By help=By.xpath("//a[@id='Help']");
  public By contactus1=By.xpath("//a[@aria-labelledby='Contact Us']");
  public By plaus1=By.linkText("Small groups (50 or fewer full-time employees)");
  public By plus2=By.linkText("Large groups (51 or more full-time employees)");
  public By feedback=By.xpath("//a[@class='greenButton internal']");
  public By specialitybenifit=By.xpath("//a[@aria-labelledby='Specialty Benefits']");
  public By internationplan=By.linkText("International Plans");
  public By geoplan=By.xpath("//a[@class='green gaTrackElement external']");
  public By destinationhealth=By.xpath("//span[contains(.,'Destination Health')]");
  public By asia=By.xpath("//a[@href='/destination_dashboard/region.cfm?RegionID=2']");
  public By india=By.xpath("//a[contains(.,'India')]");
  public By travelmedicalpal=By.xpath("//span[contains(.,'Travel Medical')]");
  public By singletrip=By.xpath("//a[@href='/products/single-trip/voyager-5-overview.cfm']");
  public By voyangeressincial=By.xpath("//a[@href='/products/single-trip/voyager-4-overview.cfm']");
  public By comparevoyangerplan=By.xpath("//a[@class='button medium rounded arrow-right']");
  public By helthinsuranceradio=By.xpath("//input[@id='multipleTrip']");
  public By primaryhelthinsuracexzip=By.xpath("//input[@id='zipCode']");
  public By calanderfrom=By.xpath("//input[@id='fromSing']");
  public By selectdatefrom=By.xpath("//a[contains(.,'24')]");
  public By calanderto=By.xpath("//input[@id='toSing']");
  public By selecteddateto=By.xpath("//a[contains(.,'30')]");
  public By quatenow=By.xpath("//a[@id='planWidgetButton']");
  public By longterm=By.xpath("//input[@id='longTerm-plan']");
  public By quato1=By.xpath("//input[@type='submit']");
  public By startsekect=By.xpath("//select[@class='topDown2 leftPush']");
  public By citizenshipradio=By.xpath("//input[@id='usCitizenNo']");
  public By helthinsurance101=By.xpath("//a[@id='Health Insurance 101']");
  public By basic=By.xpath("//a[@aria-labelledby='The Basics']");
  public By lernmore=By.xpath("//a[@href='/index/health-insurance-101/basics/what-odds.html']");
  public By typesofplan=By.xpath("//a[@href='/index/health-insurance-101/basics/plans.html']");
  public By differeceplan=By.xpath("//a[@href='/index/health-insurance-help/faqs/topics/how-health-insurance-works/difference-hmo-ppo-epo.html']");
 public By veiwallcontact=By.xpath("//span[contains(.,'View all contacts')]");
 public By ppo=By.xpath("//a[@href='/index/health-insurance-help/contacts/blue-cross-blue-shield-of-michigan-contacts.html']");
 public By idppo=By.xpath("//a[@aria-label='See a sample ID card and EOB']");
 public By whatnew=By.xpath("//a[@class='internal']");
 public By findwalkin =By.xpath("//a[contains(.,'Find a walk-in center')]");
 public By calculatorAndtool=By.linkText("Calculators and Tools");
 public By helthsaviong=By.xpath("//a[@href='/index/health-insurance-help/calculators-tools/plan-types/health-spending-accounts/hsa-calculator.html']");
 public By futerbalacecalculator=By.linkText("HSA Future Balance Calculator");
 public By gestarted=By.xpath("//a[@aria-label='Get started with the future balance calculator']");
 public By balanceexistance=By.id("balanceBegin");
 public By rate=By.id("rate");
 public By calculate=By.id("calculate");
 public By whatnew1=By.xpath("//a[@href='/index/health-insurance-101/whats-new.html']");
 public By selectrightplan=By.xpath("//a[@aria-labelledby='Selecting the Right Plan']");
 public By choosingowninsurance=By.xpath("//a[@aria-label='Learn more about choosing your own health insurance']");
 public By formember=By.xpath("//a[@id='For Members']");
 public By onlineaccount=By.xpath("//a[@aria-labelledby='Your Online Account']");
 public By registernowon=By.xpath("//a[@class='greenButton internal']");
 public By helthandwellness=By.linkText("Health and Wellness");
 public By styinghealthy=By.xpath("//a[@aria-label='Learn More About Staying Healthy']");
 public By depressonscreening=By.linkText("Depression Screening");
 public By nod1=By.xpath("//input[@id='No1-value-3']");
 public By understandrisk=By.linkText("Understanding Your Risks");
 public By nod2=By.xpath("//input[@id='No2-value-1']");
 public By memberdiscount=By.xpath("//a[@aria-labelledby='Member Discounts']");
 public By saveonpersonalcare=By.xpath("//a[@aria-label='Save on personal care']");
 public By login2=By.xpath("//button[@id='proceed']");
 public By helthandwell =By.xpath("//a[@aria-labelledby='Health and Wellness']");
 public By gettingbetter=By.xpath("//a[@aria-label='Learn More About Getting Better']");
 public By kidneyhelth=By.xpath("//a[@href='/index/members/health-wellness/getting-better/kidney-disease.html']");
 public By quitsmoking=By.xpath("//a[@href='/index/members/health-wellness/programs.html']");
 public By account=By.xpath("//a[contains(.,'your account at bcbsm.com')]");
 public By drug=By.xpath("//a[@aria-labelledby='Drug Lists']");
 public By bronze=By.linkText("Bronze Plans");
 public By silvere=By.linkText("Silver Plans");
 public By goldplan=By.linkText("Gold Plans");
 public By catastophic=By.linkText("Catastrophic Plans");
 
 
 
 
 
 
  
		  
  
  
  
  
  
  
  
  
   
   
   
}

 


