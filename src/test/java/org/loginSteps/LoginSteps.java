package org.loginSteps;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.mavenBaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends BaseClass {
	
	

@Given("user have to be in fb login page")
public void user_have_to_be_in_fb_login_page() {
    
     driver.get("https://www.facebook.com/");
	
    
}

@Given("user have to maximize screen")
public void user_have_to_maximize_screen() {
	driver.manage().window().maximize();
    
}

@When("user have to enter valide email and invalid password")
public void user_have_to_enter_valide_email_and_invalid_password() {
   WebElement textemail = driver.findElement(By.id("email"));
   textemail.sendKeys("harisince1996@gmail.com");
   WebElement textpass = driver.findElement(By.id("pass"));
   textpass.sendKeys("12345678");
}

@When("user have to click login button")
public void user_have_to_click_login_button() throws InterruptedException {
	WebElement clicklogin = driver.findElement(By.name("login"));
	clicklogin.click();
	Thread.sleep(4000);
   
}

@Then("user have to be in password incorrect page")
public void user_have_to_be_in_password_incorrect_page() {
	String url = driver.getCurrentUrl();
	
	if (url.contains("lara_product")) {
		System.out.println("user in invaled password page");
	}else {
		System.out.println("user is not invalued password page");
	}
	
}
@When("user have to enter invalide email and valid password")
public void user_have_to_enter_invalide_email_and_valid_password() {
	WebElement textemail = driver.findElement(By.id("email"));
	   textemail.sendKeys("haris");
	   WebElement textpass = driver.findElement(By.id("pass"));
	   textpass.sendKeys("1234");
	
}

@When("user have to enter valid number and invalid pswd")
public void user_have_to_enter_valid_number_and_invalid_pswd() {
	WebElement textemail = driver.findElement(By.id("email"));
	   textemail.sendKeys("8940971233");
	   WebElement textpass = driver.findElement(By.id("pass"));
	   textpass.sendKeys("12345678");
	
   
}

@When("user have to enter invalide number  and invalid pass")
public void user_have_to_enter_invalide_number_and_invalid_pass() {
	WebElement textemail = driver.findElement(By.id("email"));
	   textemail.sendKeys("1234567890");
	   WebElement textpass = driver.findElement(By.id("pass"));
	   textpass.sendKeys("1234567sfda");
	
}
 

@When("user have to enter valide Email and invalid password")
public void user_have_to_enter_valide_Email_and_invalid_password(io.cucumber.datatable.DataTable d) {
   
	List<String> alldata = d.asList();
	String v1 = alldata.get(1);
	
	List<String> alldata1 = d.asList();
	String v2 = alldata1.get(2);
	
	WebElement textemail = driver.findElement(By.id("email"));
	Filltextbox(textemail, v1);
	
	WebElement textpass = driver.findElement(By.id("pass"));
	Filltextbox(textpass, v2);
}

@When("user have to enter invalide email and Valid password")
public void user_have_to_enter_invalide_email_and_Valid_password(io.cucumber.datatable.DataTable d) {
    
	List<List<String>> alllist = d.asLists();
	List<String> l1= alllist.get(2);
	String v1 = l1.get(0);
	String v2 = alllist.get(1).get(2);
	
	WebElement textemail = driver.findElement(By.id("email"));
	Filltextbox(textemail, v1);
	
	WebElement textpass = driver.findElement(By.id("pass"));
	Filltextbox(textpass, v2);
	
}

@When("user have to enter valid number and Invalid pswd")
public void user_have_to_enter_valid_number_and_Invalid_pswd(io.cucumber.datatable.DataTable d) {
    Map<String, String> mp = d.asMap(String.class, String.class);
    String v1 = mp.get("Email");
    String v2 = mp.get("Password");
    
    WebElement textemail = driver.findElement(By.id("email"));
	Filltextbox(textemail, v1);
	
	WebElement textpass = driver.findElement(By.id("pass"));
	Filltextbox(textpass, v2);
}
@When("user have to enter invalide Number  and invalid pass")
public void user_have_to_enter_invalide_Number_and_invalid_pass(io.cucumber.datatable.DataTable d) {
    
	List<Map<String, String>> mp = d.asMaps();
	Map<String, String> m = mp.get(1);
	String v1 = m.get("Email");
	String v2 = mp.get(0).get("Password");
	

    WebElement textemail = driver.findElement(By.id("email"));
	Filltextbox(textemail, v1);
	
	WebElement textpass = driver.findElement(By.id("pass"));
	Filltextbox(textpass, v2);
	
}



	




	
	
	
	
	
	
}

	
    





	
	
	
	
	
	
	
	
	
	
	
	

