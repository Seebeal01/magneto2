package magnetosecndtest;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Parameters {
	WebDriver driver = new ChromeDriver();
	String magentoUrl="https://magento.softwaretestingboard.com/";
	Random rand =new Random();
	String[] First_Name = { " Mohammed", "Ahmed", "Ali", "Youssef", "Ibrahim", "Omar", "Fatima", "Aisha " };
	String[] Last_Name = { "Al-Sayed", "Hassan", "Abdullah", "Hussein", "Mustafa", "Najjar", "Karim", "Nasser" };
	int randomIndexForTheFirstName = rand.nextInt(First_Name.length);
	int randomIndexForTheLastName = rand.nextInt(Last_Name.length);
	int RandomNamber = rand.nextInt(9999);
	String domainName = "@gmail.com";
	String passward = "Seebeal123";
	String emailAddressToLogin = "";
	String logoutPage = "https://magento.softwaretestingboard.com/customer/account/logout/";
	
	
	public void GeneralSetup() {
		driver.manage().window().maximize();
		driver.get(magentoUrl);
		
		
	
	
	
	
	
	}
	
	

	
	

}
