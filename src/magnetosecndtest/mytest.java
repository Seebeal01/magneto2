package magnetosecndtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mytest extends Parameters {

	@BeforeTest
	public void mysetup() {
		GeneralSetup();

	}

	@Test(priority = 1)
	public void CreateAnAccount() {
		driver.findElement(By.partialLinkText("Create an Account")).click();
		WebElement FirstNameInput = driver.findElement(By.id("firstname"));
		WebElement LastNameInput = driver.findElement(By.id("lastname"));
		WebElement emailInput = driver.findElement(By.id("email_address"));
		WebElement passwardInput = driver.findElement(By.id("password"));
		WebElement passwarconfirmInput = driver.findElement(By.id("password-confirmation"));
		WebElement createButton = driver.findElement(By.xpath("//button[@title='Create an Account']"));
		String firstname = First_Name[randomIndexForTheFirstName];
		String lastname = Last_Name[randomIndexForTheLastName];
		FirstNameInput.sendKeys(firstname);
		LastNameInput.sendKeys(lastname);
		emailInput.sendKeys(firstname + lastname + RandomNamber + domainName);
		passwardInput.sendKeys(passward);
		passwarconfirmInput.sendKeys(passward);
		createButton.click();
		emailAddressToLogin = firstname + lastname + RandomNamber + domainName;
		driver.get(logoutPage);
	}

	@Test(priority = 2)
	public void LogIn() {

		WebElement LoginPage = driver.findElement(By.linkText("Sign In"));
		LoginPage.click();

		WebElement emailToLogin = driver.findElement(By.id("email"));
		WebElement passwardToLogin = driver.findElement(By.id("pass"));
		WebElement singinButton = driver.findElement(By.cssSelector(".action.login.primary"));
		emailToLogin.sendKeys(emailAddressToLogin);
		passwardToLogin.sendKeys(passward);
		singinButton.click();
	}

}
