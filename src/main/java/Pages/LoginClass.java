package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginClass extends Aulas_Base.BaseTest {
	@FindBy(xpath = "(//div[contains(@class,'ant-col')]/img)[1]")
	WebElement Logo;
	@FindBy(xpath = "//a[text()='Privacy Policy']")
	WebElement PrivacyPolicy;
	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	WebElement TermsAndConditions;
	@FindBy(xpath = "//div[@class='m-t-5']/input")
	WebElement Email;
	@FindBy(xpath = "//div[@class='m-t-20']/span/input")
	WebElement Password;
	@FindBy(xpath = "(//button[contains(@class,'bold-bold')])[2]")
	WebElement LoginClick;
	@FindBy(xpath = "(//button[contains(@class,'ant-btn')]/span)[1]")
	WebElement ForgotPassword;
	@FindBy(xpath = "(//ul[@class='ant-menu-item-group-list'])[3]/li[2]")
	WebElement AulasCareLink;
	@FindBy(xpath = "(//div[@class='ant-tabs-tab'])[1]")
	WebElement Register;
	@FindBy(xpath = "//span[text()='Mobile']")
	WebElement Mobile;
	@FindBy(xpath = "//input[@class='form-control']")
	WebElement EnterMobileNumber;
	@FindBy(xpath = "//button[contains(@class,'ant-btn-block r-c-c bold-bold')]")
	WebElement sendOTP;
	@FindBy(xpath = "//input[@class='aulas-login__input-verify-otp']")
	WebElement EnterOTP;
	@FindBy(xpath = "(//button[contains(@class,'ant-btn-block r-c-c bold-bold m-t-20')])[1]")
	WebElement VerifyOTP;
	@FindBy(xpath = "//div[@class='m-t-20 m-b-5']/div[2]")
	WebElement LogOutButton;
	@FindBy(xpath = "//span[text()='Logout']")
	WebElement LogOut;

	Actions ac = new Actions(driver);

	public LoginClass() {
		PageFactory.initElements(driver, this);
	}

	public boolean aulasLogo() {
		return Logo.isDisplayed();

	}

	public void Privacypolicy() throws InterruptedException {
		Thread.sleep(4000);
		PrivacyPolicy.click();
	}

	public void TermsAndConditions() throws InterruptedException {
		Thread.sleep(4000);
		TermsAndConditions.click();
	}

	public HomePage1 newWEBLogin(String email, String password) throws InterruptedException {
		// Thread.sleep(4000);
		//
		driver.findElement(By.xpath("//*[text()=' Email ID']")).click();
		Email.sendKeys(email);
		Password.sendKeys(password);
		LoginClick.click();
		return new HomePage1();
	}

	public HomePage1 MarketPlaceLogin(String email, String password) throws InterruptedException {
		String captch = "AbC4De";

		driver.findElement(By.xpath("//*[text()=' Email ID']")).click();
		driver.findElement(By.xpath("//*[@placeholder='Enter email ID']")).sendKeys(email);
		System.out.println("Email Id entered successfully...");

		driver.findElement(By.xpath("//*[@placeholder='Enter password']")).sendKeys(password);
		System.out.println("Password entered successfully...");

		driver.findElement(By.xpath("//*[@placeholder='Enter captcha']")).sendKeys(captch);
		System.out.println("Captch entered successfully...");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='SIGN IN']")));
		driver.findElement(By.xpath("//*[text()='SIGN IN']")).click();
		Thread.sleep(3000);
		System.out.println("Login successfull");

		return new HomePage1();
	}

	public HomePage1 loginViaEmail(String email, String password) throws InterruptedException {
		driver.findElement(By.xpath("//*[text()=' Email ID']")).click();
		System.out.println("Selected login via email ..");

		driver.findElement(By.xpath("//*[@placeholder='Enter email ID']")).sendKeys(email);
		System.out.println("Email Id entered successfully...");

		driver.findElement(By.xpath("//*[@placeholder='Enter password']")).sendKeys(password);
		System.out.println("Password entered successfully...");

		/*
		 * driver.findElement(By.xpath("//*[@placeholder='Enter captcha']")).sendKeys(
		 * captch); System.out.println("Captch entered successfully...");
		 */

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='SIGN IN']")));
		driver.findElement(By.xpath("//*[text()='SIGN IN']")).click();
		Thread.sleep(3000);
		System.out.println("Login via email successfull");

		return new HomePage1();
	}

	public HomePage1 loginViaPhone(String phoneNumber, String OTP) throws InterruptedException {
		// String captch="AbC4De";
		driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//*[text()='VERIFY']")).click();
		driver.findElement(By.xpath("//*[@class='aulas-login__input-verify-otp']")).sendKeys(OTP);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='SUBMIT']")));
		driver.findElement(By.xpath("//*[text()='SUBMIT']")).click();
		Thread.sleep(3000);
		System.out.println("Login via phone number successfull");

		return new HomePage1();
	}

	public HomePage1 loopLoginTest(String phoneNumber) throws InterruptedException {
		int numberOfIterations = 10;

		for (int i = 0; i < numberOfIterations; i++) {

			WebElement PhoneNumberField = driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']"));

			/*
			 * PhoneNumberField.sendKeys(Keys.COMMAND + "a");
			 * 
			 * PhoneNumberField.sendKeys(Keys.BACK_SPACE); //PhoneNumberField.clear();
			 */
			PhoneNumberField.sendKeys(phoneNumber);
			System.out.println("Entered mobile number...");

			driver.findElement(By.xpath("//*[text()='VERIFY']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='aulas-login__input-verify-otp']")).sendKeys("592726");
			System.out.println("Entered OTP number...");

			driver.findElement(By.xpath("//*[text()='SUBMIT']")).click();
			System.out.println("Clicked on submit...");

			Thread.sleep(3000);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='anticon anticon-caret-down'])[2]")));
			driver.findElement(By.xpath("(//*[@class='anticon anticon-caret-down'])[2]")).click();
			driver.findElement(By.xpath("(//*[text()='Logout'])[2]")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//*[text()='LOGOUT']")).click();
			Thread.sleep(3000);

			System.out.println("logged out successfully ....." + i + "" + "time");
			selectMyaccount();

			/*
			 * driver.findElement(By.xpath("//*[text()=' Edit']")).click();
			 * System.out.println("logged out successfully ....."+i+""+"time");
			 */

		}
		return new HomePage1();

	}

	public HomePage1 editTest(String phoneNumber) throws InterruptedException {
		int numberOfIterations = 10;

		for (int i = 0; i < numberOfIterations; i++) {

			WebElement PhoneNumberField = driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']"));

			PhoneNumberField.sendKeys(Keys.COMMAND + "a");
			PhoneNumberField.sendKeys(Keys.BACK_SPACE);
			PhoneNumberField.sendKeys(phoneNumber);
			driver.findElement(By.xpath("//*[text()='VERIFY']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=' Edit']")).click();
			System.out.println("logged out successfully ....." + i + "" + "time");

		}
		// PhoneNumberField.clear();*/
		return new HomePage1();

	}

	public void selectMyaccount() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='anticon anticon-caret-down'])[2]")));
		driver.findElement(By.xpath("(//*[@class='anticon anticon-caret-down'])[2]")).click();

		driver.findElement(By.xpath("(//*[text()='My Account'])[1]")).click();

	}
	/***************************************
	 * Login to Test server
	 ******************************/

	public HomePage1 modeOfLogin(String typeOfLogin) throws InterruptedException {

		// EMAIL LOGIN
		if (typeOfLogin.equalsIgnoreCase("email")) {
			driver.findElement(By.xpath("//*[text()=' Email ID']")).click();
			System.out.println("Selected login via email ..");

			driver.findElement(By.xpath("//*[@placeholder='Enter email ID']")).sendKeys(prop.getProperty("username"));
			System.out.println("Email Id entered successfully...");

			driver.findElement(By.xpath("//*[@placeholder='Enter password']")).sendKeys(prop.getProperty("password"));
			System.out.println("Password entered successfully...");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='SIGN IN']")));
			driver.findElement(By.xpath("//*[text()='SIGN IN']")).click();
			Thread.sleep(3000);
			System.out.println("Login via email successfull");

		}
		// MOBILE LOGIN

		else if (typeOfLogin.equalsIgnoreCase("mobile")) {
			driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']"))
					.sendKeys(prop.getProperty("testmobile"));
			driver.findElement(By.xpath("//*[text()='VERIFY']")).click();
			driver.findElement(By.xpath("//*[@class='aulas-login__input-verify-otp']"))
					.sendKeys(prop.getProperty("testOTP"));

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='SUBMIT']")));
			driver.findElement(By.xpath("//*[text()='SUBMIT']")).click();
			Thread.sleep(3000);
			System.out.println("Login via phone number successfull");
		}

		return new HomePage1();

	}

	/***************************************
	 * Login to Production server
	 ******************************/

	public HomePage1 ProdmodeOfLogin(String typeOfLogin) throws InterruptedException {
		selectMyaccount();

		// EMAIL LOGIN
		if (typeOfLogin.equalsIgnoreCase("email")) {

			driver.findElement(By.xpath("//*[text()=' Email ID']")).click();
			System.out.println("Selected login via email ..");

			driver.findElement(By.xpath("//*[@placeholder='Enter email ID']"))
					.sendKeys(prop.getProperty("produsername"));
			System.out.println("Email Id entered successfully...");

			driver.findElement(By.xpath("//*[@placeholder='Enter password']"))
					.sendKeys(prop.getProperty("prodpassword"));
			System.out.println("Password entered successfully...");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='SIGN IN']")));
			driver.findElement(By.xpath("//*[text()='SIGN IN']")).click();
			Thread.sleep(3000);
			System.out.println("Login via email successfull");

		}
		// MOBILE LOGIN

		else if (typeOfLogin.equalsIgnoreCase("mobile")) {

			driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']"))
					.sendKeys(prop.getProperty("proMobile"));
			driver.findElement(By.xpath("//*[text()='VERIFY']")).click();
			driver.findElement(By.xpath("//*[@class='aulas-login__input-verify-otp']"))
					.sendKeys(prop.getProperty("proOTP"));

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='SUBMIT']")));
			driver.findElement(By.xpath("//*[text()='SUBMIT']")).click();
			Thread.sleep(3000);
			System.out.println("Login via phone number successfull");
		}

		return new HomePage1();

	}

	public HomePage1 LoggingThorught(String phoneNumber, String OTP) throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='Visit Site']")).click();

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter mobile number']")));

		driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//*[text()='VERIFY']")).click();
		driver.findElement(By.xpath("//*[@class='aulas-login__input-verify-otp']")).sendKeys(OTP);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='SUBMIT']")));
		driver.findElement(By.xpath("//*[text()='SUBMIT']")).click();
		Thread.sleep(3000);
		System.out.println("Login via phone number successfull");
		return new HomePage1();

	}

	public HomePage1 MarketPlaceNonAdminLogin(String teachernumber, String OTP) throws InterruptedException {
		String captch = "AbC4De";
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		 * wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("(//*[@class='anticon anticon-caret-down'])[2]")));
		 * driver.findElement(By.xpath("(//*[@class='anticon anticon-caret-down'])[2]"))
		 * .click();
		 * driver.findElement(By.xpath("(//*[text()='My Account'])[1]")).click();
		 */
		// login flow
		// 91123
		driver.findElement(By.xpath("//*[@placeholder='Enter mobile number']")).sendKeys(teachernumber);
		driver.findElement(By.xpath("//*[@placeholder='Enter captcha']")).sendKeys(captch);
		driver.findElement(By.xpath("//span[text()='VERIFY']")).click();
		driver.findElement(By.xpath("//input[@class='aulas-login__input-verify-otp']")).sendKeys(OTP);
		driver.findElement(By.xpath("//span[text()='SUBMIT']")).click();

		System.out.println("Logged in as teacher successfull...");

		return new HomePage1();
	}

	public HomePage1 newLogin2(String email, String password) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@placeholder='Enter email ID']")).sendKeys(email);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@placeholder='Enter password']")).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(
				By.xpath("//*[@class='ant-btn ant-btn-primary ant-btn-round ant-btn-block r-c-c bold-bold']")).click();
		return new HomePage1();

		//

	}

	public HomePage1 newLogin3(String email, String password) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='text-xs blue m-l-5 m-r-5 bold-600 cursor-pointer']")).click();
		driver.findElement(By.xpath("//*[@placeholder='Enter email ID']")).sendKeys(email);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@placeholder='Enter password']")).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-round ant-btn-primary r-c-c bold-bold']")).click();
		System.out.println("The login is sucessfully !!!");
		return new HomePage1();

		//

	}

	public HomePage1 newLoginFlow(String email, String password) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='text-xs blue m-l-5 m-r-5 bold-600 cursor-pointer']")).click();
		System.out.println("Selected email login!!!");
		driver.findElement(By.xpath("//*[@placeholder='Enter email ID']")).sendKeys(email);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@placeholder='Enter password']")).sendKeys(password);
		Thread.sleep(4000);

		// String captcha=driver.findElement(By.xpath("//*[@id='canv']")).getText();
		String captcha = driver.findElement(By.xpath("//*[@class='r-c-c']")).getText();
		System.out.println("The Generated captcha is " + captcha);
		driver.findElement(By.xpath("//*[@placeholder='Enter captcha']")).sendKeys(captcha);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[class='ant-btn ant-btn-round ant-btn-primary r-c-c bold-bold']")).click();
		Thread.sleep(4000);
		System.out.println("The login is sucessfully !!!");
		return new HomePage1();

	}

	public HomePage1 newLoginUsingMobile(String phonenumber, String OTP) throws InterruptedException {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-tabs-tab-btn'])[4]")).click();
		System.out.println("clicked on Mobile button ");
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='+1 (702) 123-4567']")).sendKeys(phonenumber);
		wait(3000);
		driver.findElement(
				By.xpath("//*[@class='ant-btn ant-btn-primary ant-btn-round ant-btn-block r-c-c bold-bold']")).click();
		// driver.findElement(By.xpath("(//*[contains(.,'Send OTP')])[15]")).click();
		String Text = driver.findElement(By.cssSelector(".ant-notification-notice-description")).getText();
		System.out.println("The Send OTP message is " + Text);
		driver.findElement(By.xpath("//*[@class='aulas-login__input-verify-otp']")).sendKeys(OTP);
		wait(3000);
		driver.findElement(By.xpath("(//*[contains(.,'Verify OTP')])[15]")).click();

		return new HomePage1();
	}

	public void ForgotPassword() throws InterruptedException {
		Thread.sleep(4000);
		ForgotPassword.click();
	}

	public void AulasCareLink() throws InterruptedException {
		Thread.sleep(4000);
		AulasCareLink.click();
	}

	public void Register() throws InterruptedException {
		Thread.sleep(4000);
		Register.click();
	}

	public void MobileRegister() throws InterruptedException {
		Thread.sleep(4000);
		Mobile.click();
		EnterMobileNumber.sendKeys("9886599380");
		Thread.sleep(4000);
		sendOTP.click();
		Thread.sleep(4000);
		EnterOTP.sendKeys("592726");
		Thread.sleep(4000);
		VerifyOTP.click();
	}

	public HomePage1 MobileRegister(String MobileNumber, String DefaultOTP) throws InterruptedException {
		WaitTil(2000);
		Mobile.click();
		WaitTil(2000);
		EnterMobileNumber.sendKeys(MobileNumber);
		WaitTil(2000);
		sendOTP.click();
		WaitTil(2000);
		EnterOTP.sendKeys(DefaultOTP);
		WaitTil(2000);
		VerifyOTP.click();
		WaitTil(3000);
		return new HomePage1();
	}

	public void LogOut() {
		WaitTil(3000);
		ac.moveToElement(LogOutButton).click().build().perform();
		WaitTil(2000);
		LogOut.click();

	}

}
