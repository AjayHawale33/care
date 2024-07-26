package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PmtLoginPage extends Aulas_Base.BaseTest {
	@FindBy(xpath = "//header[@class='login_header__V-ns4']/div/div[3]")
	WebElement Profile;

	@FindBy(xpath = "//button[text()='Sign in']")
	WebElement SignInBtn;

	@FindBy(xpath = "//span[text()='email ID']")
	WebElement ChooseEmailField;

	@FindBy(id = "email")
	WebElement emailField;

	@FindBy(xpath = "//button[@htmltype='submit']")
	WebElement submitbtn;

	@FindBy(xpath = "//input[@id='password']")
	WebElement PasswordField;

	@FindBy(xpath = "//button[text()='Sign in']")
	WebElement SignInButton;

	@FindBy(xpath = "(//div[@class='homePage_hoverDiv__2owFr'])")
	WebElement PmtCards;

	@FindBy(xpath = "//div[@class='r-c-c m-l-10']")
	WebElement ListView;

	@FindBy(xpath = "(//div[@class='r-c-c'])[1]")
	WebElement GridView;

	@FindBy(xpath = "(//div[@class='homePage_hoverDiv__2owFr'])[3]")
	WebElement AttendanceCard;

	public PmtLoginPage() {
		PageFactory.initElements(driver, this);
	}

	public PMTHomePage DoLogin() throws InterruptedException {
		boolean a = Profile.isEnabled();
		System.out.println("button is enabled" + a);
		Thread.sleep(3000);
		Profile.click();
		Thread.sleep(3000);
		SignInBtn.click();
		Thread.sleep(3000);
		ChooseEmailField.click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("ajay.digambar@brigosha.com");
		Thread.sleep(3000);
		submitbtn.click();
		Thread.sleep(3000);
		PasswordField.sendKeys("Ajay@1997");
		Thread.sleep(3000);
		SignInButton.click();
		return new PMTHomePage() ;

//		System.out.println("Reach inside PMT");
//		int count = driver.findElements(By.xpath("(//div[@class='homePage_hoverDiv__2owFr'])")).size();
//		System.out.println(count);
//
//		driver.findElement(By.xpath("//div[@class='r-c-c m-l-10']")).click();
//		System.out.println("List view is applied");
//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//div[@class='r-c-c'])[1]")).click();
//		System.out.println("Again shifted to Grid view");

	//	AttendanceCard.click();

	}

}
