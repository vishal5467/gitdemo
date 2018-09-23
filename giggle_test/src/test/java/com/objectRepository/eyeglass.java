package com.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.FindElement;

import com.accelerators.ActionEngine;

public class eyeglass extends ActionEngine
{
  public  By imgloggo= By.xpath("//img[@height='75']");
  public By  yourshoppingcart=By.xpath("//h1[contains(.,'Your Shopping Cart')]");
  public By  shoppingcart= By.xpath("//a[contains(.,'Shopping Cart ')]");
  public By  imgcaroussel= By.xpath("//img[@src='/media/36024443/top.jpg']");
  public By  logan       = By.className("slogan");
  public By  serch       = By.name("searchText");
  public By  serchbutton= By.className("search-go");
  public By serchtext=By.xpath("//h2[contains(@class,'col-lg-6')]");
  public By zipserchtextbox= By.id("postalcode");
 public By  zipserchbutton= By.xpath("//button[contains(.,'Go')]");
 public By  zipserchsesult= By.xpath("//th[contains(.,'7 Locations Found ')]");
 public By store          =By.id("more_info_1");
 public By sameday=      By.linkText("Same Day Service");
 public By eyeexamlink= By.linkText("Eye Exams");
 public By offerslink=By.xpath("//a[@href='/offers']");
 public By lowcost=By.linkText("Low Cost Financing");
 public By  homepageadd=By.xpath("//img[@src='/media/36024443/top.jpg']");
 public By visioninsurance=By.linkText("Vision Insurance");
 public By logovisioninsurance=By.xpath("//h1[contains(.,'Vision Insurance')]");
 public By eyeglasss=By.xpath("//a[contains(.,'Eyeglasses▼▲')]");
 public By menglass=By.xpath("//a[@href='/shop/mens-eyeglasses']");
 public By frame=By.xpath("//span[contains(.,'Lucky Beach Front')]");
 public By contactlence=By.xpath("//a[contains(.,'Contact Lenses▼▲')]");
 public By cotanctlencediscount=By.xpath("//a[@href='/shop/contact-lenses-325/sofmed-55/']");
 public By rightcontactlence=By.xpath("//select[@id='rightEye_Sphere']");
 public By contactlencetext=By.xpath("//h1[contains(.,'Sofmed 55')]");
 public By leftcontact=By.xpath("//select[@id='leftEye_Sphere']");
 public By lenseshoppingcart=By.xpath("//input[@class='btn accent']");
 public By lenseshoppingtext=By.xpath("//h1[contains(.,'Your Shopping Cart')]");
 public By lensecheckout=By.xpath("//button[contains(.,'Start Checkout')]");
 public By lensestextshoppingcart=By.xpath("//h1[contains(.,'Your Shopping Cart')]");
 public By shoppingemailid=By.xpath("//input[@name='LoginEmail']");
 public By shoppingpassword=By.xpath("//input[@name='LoginPassword']");
 public By lencecreataccount=By.xpath("//h1[contains(.,'Create A NewEyeglass World Account')]");
 public By offer=By.xpath("//a[@href='/offers']");
 public By shoppinglogin=By.xpath("//input[@value='log in']");
 public By bifocaloffer=By.xpath("//a[@href='/offers/lined-bifocals/']");
 public By offerzipcode=By.xpath("//input[@maxlength='10']");
 public By offergo=By.xpath("//button[@type='submit']");
 public By offerserch=By.linkText("Altamonte Springs");
 public By samedayservice=By.xpath("//a[@href='/services/same-day-service/']");
 public By samedaytexe=By.xpath("//h1[contains(.,'Same Day Glasses at Eyeglass World')]");
 public By eyeglass =By.xpath("//a[contains(.,'Eyeglasses▼▲')]");
 public By womenglass=By.xpath("//a[@href='/shop/womens-eyeglasses']");
 public By womenglassname=By.xpath("//span[contains(.,'Marilyn Monroe  MMO 122')]");
 public By womenglassrotate=By.xpath("//button[@class='btn dark outline product-control-btn rotate-left']");
  public By kidsglass =By.xpath("//a[@href='/shop/kids-eyeglasses']");
  public By secondpage=By.xpath("//a[@aria-label='Page 2']");
  public By kidsglasssecond=By.xpath("//img[@alt='mini spada 1003 Eyeglasses Pink']");
  public By kidglassrotate=By.className("btn dark outline product-control-btn rotate-left");
  public By eyeexam=By.xpath("//a[@href='http://www.eyeglassworld.com/eye-exams/']");
  public By scheduleeyeexam=By.xpath("//a[contains(.,'schedule an eye exam')]");
  public By entercity=By.xpath("//input[@maxlength='50']");
  public By state=By.xpath("//select[@size='1']");
  public By gobuttn=By.xpath("//button[@aria-label='search for store submit']");
  public By gozip=By.xpath("//input[@aria-label='enter a zip code. press the down arrow for more search options.']");
 public By daytonabeac=By.xpath("//a[contains(.,'(407) 774-1318')]");
 public By eyeglasslence=By.xpath("//a[@href='/eyeglass-lenses/']");
public By cr39=By.linkText("Basic-CR-39 Lenses");
public By virithin=By.linkText("Verithin High Index");
public By copperlence=By.linkText("Coppertone Polarized Lenses");
public By driverlence=By.linkText("Drivewear");
public By scheduleexam=By.xpath("btn req_appt ");
public By altamon=By.linkText("Altamonte Springs");
public By commingsoon=By.id("comingsoonTAB");
public By schedule=By.className("btn req_appt");
public By sunglass=By.xpath("//a[@href='/shop/sunglasses']");
public By sunglasspage2=By.xpath("//a[@aria-label='Page 2']");
public By aramisunglass=By.xpath("//span[contains(.,'Armani Exchange Ax 4050s ')]");
public By aeamitext=By.xpath("//span[@itemprop='name']");
public By rotatesunglas=By.xpath("//button[@class='btn dark outline rotate-btn product-control-btn rotate-right']");
public By weeklydisposal=By.linkText("Weekly Disposable");
public By extremh20=By.xpath("//span[@aria-label='dollar 39 point 99 per Box']");
public By rightpower=By.xpath("//select[@aria-label='Right Eye Power or Sphere (PWR or SPH)']");
public By leftpower=By.xpath("//select[@aria-label='Left Eye Power or Sphere (PWR or SPH)']");
public By addshoppingcart=By.xpath("//input[@class='btn accent']");
public By preference=By.className("link");
public By startcheckout=By.xpath("//button[@class='btn accent btn-start-checkout']");
public By conti=By.xpath("//input[@class='continue-button btn accent formButton']");
public By schedulefire=By.xpath(".//*[@id='collection_poi']/tbody/tr[1]/td[2]/div[2]/div[4]/span[3]/div[1]/a");
public By frame1=By.id("storeIframe");
public  By clickaltamonspring=By.id("more_info_1");
public By schedulrexam=By.xpath(".//*[@id='collection_more_info']/div/div[3]/div[3]/a/div");
public By continue1=By.linkText("Continue");
public By kisseme=By.id("more_info_6");





}
