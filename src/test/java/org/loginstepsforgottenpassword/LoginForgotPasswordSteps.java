package org.loginstepsforgottenpassword;

import org.mavenBaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginForgotPasswordSteps extends BaseClass {
	@Given("user have to be in fb login page")
	public void user_have_to_be_in_fb_login_page() {
		openchrome();
		geturl("https://www.facebook.com/");
	   
	}

	@Given("user have to maximize screen")
	public void user_have_to_maximize_screen() {
	   max();
	}

	@When("user have to click forgottenpassword")
	public void user_have_to_click_forgottenpassword() {
		WebElement clickforg = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		toclick(clickforg);
	   
	}

	@When("user have to enter valide email")
	public void user_have_to_enter_valide_email() {
	    WebElement usertext = driver.findElement(By.xpath("//input[@type='text']"));
	    Filltextbox(usertext, "harisince1996@gmail.com");
	}

	@When("user have to click search")
	public void user_have_to_click_search() throws InterruptedException {
	   WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
	   toclick(search);
	   wight(3000);
	}
	@When("user have to click continu")
	public void user_have_to_click_continu() throws InterruptedException {
	    WebElement c = driver.findElement(By.xpath("//button[@type='submit']"));
	    toclick(c);
	    wight(3000);
	}

	
	@When("user have to enter the invalide code")
	public void user_have_to_enter_the_invalide_code() {
	   WebElement code = driver.findElement(By.xpath("//input[@aria-label='Enter code']"));
	   Filltextbox(code, "12345678");
	}
	@When("user have to click continue")
	public void user_have_to_click_continue() {
	    WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
	    toclick(click);
	}

	@Then("user have to be in  doesn match your code page")
	public void user_have_to_be_in_doesn_match_your_code_page() {
	    String url = getcurrenturl();
	
	   
	   if (url.contains("default_recover")) {
			System.out.println("user in the doesn't match your code. Please try again page");
		}
	   else {
			System.out.println("user not in the doesn't match your code page ");
		}
	
	}
	

}
