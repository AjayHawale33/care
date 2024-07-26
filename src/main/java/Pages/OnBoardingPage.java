package Pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.interactions.Actions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class OnBoardingPage extends Aulas_Base.BaseTest {

	@FindBy(xpath = "(//li[@class='ant-menu-item ant-menu-item-only-child'])[10]")
	WebElement Notification;
	@FindBy(xpath = "//div[text()='Notifications']")
	WebElement NotificationText;
	@FindBy(xpath = "//div[@class='ant-tabs-tab ant-tabs-tab-active']")
	WebElement NotificationClick;
	@FindBy(xpath = "(//div[@class='r-jsb-fc notifyCard'])[1]")
	WebElement NotificationOpen;
	@FindBy(xpath = "//button[@class='ant-btn mod-notifyApprove-btn']")
	WebElement Close;

	public OnBoardingPage() {
		PageFactory.initElements(driver, this);
	}

	public void mailLoginPage() throws InterruptedException {
		Thread.sleep(2000);

		// Open Gmail and log in
		driver.get("https://mail.google.com");
		Thread.sleep(5000);

		// Enter your email address
		/*
		 * WebElement email_input = driver.findElement(By.xpath(""));
		 * email_input.send_keys("your_email@gmail.com")
		 * email_input.send_keys(Keys.RETURN) time.sleep(2) # Wait for the next page to
		 * load
		 * 
		 * # Enter your password password_input = driver.find_element(By.NAME,
		 * "password") password_input.send_keys("your_password")
		 * password_input.send_keys(Keys.RETURN) time.sleep(2) # Wait for the Gmail
		 * inbox to load
		 */

		// Find and click the email containing the link you want to click (use your
		// specific email's subject)
		/*
		 * String email_subject = "aulas Onboarding Form"; email_link =
		 * driver.find_element(By.XPATH, f'//span[contains(text(),
		 * "{email_subject}")]/ancestor::tr') email_link.click();
		 * 
		 * # Wait for the email to load (you may need to adjust the wait time)
		 * time.sleep(5)
		 * 
		 * # Find and click the link within the email (use a specific link text or
		 * attribute value) link_text = "Your Link Text" # Change to the actual link
		 * text email_body = driver.find_element(By.XPATH, "//div[@class='a3s aXjCH']")
		 * link = email_body.find_element(By.PARTIAL_LINK_TEXT, link_text) link.click()
		 * 
		 * # Close the browser window driver.quit()
		 */

	}

	public static void refreshPageUntilLoaded() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Maximum time to wait for the page to load (adjust as needed)
		int maxWaitTimeInSeconds = 60;

		// Check if the document is ready and page is fully loaded
		for (int i = 0; i < maxWaitTimeInSeconds; i++) {
			if (js.executeScript("return document.readyState").equals("complete")) {
				break;
			}
			try {
				Thread.sleep(1000); // Sleep for 1 second before checking again
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			js.executeScript("location.reload();");
		}
	}

	public void getonboardingURL() throws InterruptedException {
		Thread.sleep(4000);

		String onboardingURL = "https://autodeployments.aulas.in/on-boarding-form?reqId=29&orgId=13578615835052465";
		int pageLoadTimeoutSeconds = 30;
        driver.manage().timeouts().pageLoadTimeout(pageLoadTimeoutSeconds, TimeUnit.SECONDS);

		driver.get(onboardingURL);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete'"));

		//Thread.sleep(4000);
		WebElement onbaordingForm = driver.findElement(By.xpath("//*[text()='Onboarding ']"));
		waitElementisVisible(onbaordingForm);
		
		//System.out.println("Waited for 8 seconds to load the URL");
System.out.println("Opened onbaording URL....");

	}

	public void InstituteDetails() throws InterruptedException {
		Thread.sleep(4000);
		InstituteName("Testing academy");
		selectInstituteType("Private Limited");
		enterWebSiteURL();
		enterPinCode();
		enterAddressDetails();

	}

	public void clickProceedBtn() throws InterruptedException {
		//Thread.sleep(4000);
		WebElement processBtn = driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-round ant-btn-primary']"));

		// Create a JavascriptExecutor object
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int maxRetries = 3;
		for (int retry = 0; retry < maxRetries; retry++) {
			try {
				Thread.sleep(5000);
				js.executeScript("arguments[0].scrollIntoView(true);", processBtn);
				//Thread.sleep(3000);
				processBtn.click();
				System.out.println("ScrollDown and clicked on PROCCED BUTTON...");

				break; // Exit the loop if the action was successful
			} catch (StaleElementReferenceException e) {
				// Handle the exception and decide whether to retry or not
				System.out.println("StaleElementReferenceException occurred, retrying...");
			}
		}

	}

	public void InstituteName(String OrganizationName) throws InterruptedException {
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@placeholder='Organisation Name*']")).sendKeys(OrganizationName);
		System.out.println("Entered Organization name is :" + OrganizationName);

	}

	public void selectInstituteType(String instituteName) throws InterruptedException {
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[1]")).click();
		//Thread.sleep(4000);
		List<WebElement> ele = driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']"));
		int institutioncount = ele.size();
		System.out.println("The size is :" + " " + institutioncount);
		for (int i = 1; i <= institutioncount; i++) {
			String nameis = driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]"))
					.getText();
			if (nameis.equalsIgnoreCase(instituteName)) {
				//wait(3000);
				driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]")).click();
				System.out.println("The selected option is :" + instituteName);
				break;
			}
		}
		System.out.println("Clicked successfully and selected INSTITUTE TYPE is...:" + "instituteName");
	}

	public void enterWebSiteURL() throws InterruptedException {
		//Thread.sleep(4000);
		String webSiteName = "AutomationTesting.com";
		driver.findElement(By.xpath("//*[@placeholder='Website URL']")).sendKeys(webSiteName);
		System.out.println("Entered web site name is..." + webSiteName);
	}

	public void enterPinCode() throws InterruptedException {
		//Thread.sleep(4000);
		String pinCode = "562125";
		driver.findElement(By.xpath("(//*[@placeholder='Pincode*'])[1]")).sendKeys(pinCode);
		System.out.println("Entered pin code SUCCESSFULLY...");
	}

	public void enterAddressDetails() throws InterruptedException {
		//Thread.sleep(4000);
		String address1 = "DOMMASANDRA Pin Code is 562125. DOMMASANDRA is located in Sarjapura S.O BANGALORE, KARNATAKA, ";
		driver.findElement(By.xpath("(//*[@placeholder='Building No./Locality/Area*'])[1]")).sendKeys(address1);
		System.out.println("Entered pin code SUCCESSFULLY...");
	}

	/****************************************
	 * B. Super Administrator Details
	 **********************************/

	public void scrollToElement(WebElement ele) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int maxRetries = 3;
		for (int retry = 0; retry < maxRetries; retry++) {
			try {
				Thread.sleep(5000);
				js.executeScript("arguments[0].scrollIntoView(true);", ele);
				Thread.sleep(3000);
				String elementName = ele.getText();
				System.out.println("ScrollDown till " + elementName);

				break; // Exit the loop if the action was successful
			} catch (StaleElementReferenceException e) {
				// Handle the exception and decide whether to retry or not
				System.out.println("StaleElementReferenceException occurred, retrying...");
			}
		}

	}

	public static void scrollToText(String text) {
		// Create a JavaScriptExecutor object
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Find the element with the target text
		WebElement element = driver.findElement(By.xpath("//*[contains(text(), '" + text + "')]"));

		// Scroll to the element
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void enterSuperAdminDetails() throws InterruptedException {
		//Thread.sleep(4000);
		WebElement verifyEmailId = driver
				.findElement(By.xpath("//*[@placeholder='Enter OTP sent to the email ID entered*']"));
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrollIntoView();", verifyEmailId);
		 */
		scrollToElement(verifyEmailId);
		enterName();
		selectDesgInInstitute("Principal");
		enterPhoneNumber();
		enterEmailID();

		System.out.println("Entered pin code SUCCESSFULLY...");
	}

	public void enterName() throws InterruptedException {
		//Thread.sleep(4000);
		String Name = "Ravi Kumar aravindh";
		driver.findElement(By.xpath("(//*[@placeholder='Name*'])[1]")).sendKeys(Name);
		Thread.sleep(4000);
		System.out.println("Entered NAME SUCCESSFULLY..." + Name);

	}

	public void selectDesgInInstitute(String desgination) throws InterruptedException {
		//Thread.sleep(4000);
		// driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-round
		// ant-btn-primary']")).click();
		driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[2]")).click();
		//Thread.sleep(4000);
		List<WebElement> designation = driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']"));
		int designationCount = designation.size();
		System.out.println("The size is :" + " " + designationCount);
		for (int i = 1; i <= designationCount; i++) {
			String designationname = driver
					.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]")).getText();
			System.out.println("The names are :" + " " + designationname);
			if (designationname.equalsIgnoreCase(desgination)) {
				wait(3000);
				driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]")).click();
				System.out.println("The selected desgination option is :" + desgination);
				break;
			}
		}

	}

	public void enterPhoneNumber() throws InterruptedException {
		//Thread.sleep(4000);
		// Phone number and OTP verification
		String PhoneNum = "10830180231";
		String OTP = "111111";
		
		driver.findElement(By.xpath("(//*[@placeholder='Phone Number*'])[1]")).sendKeys(PhoneNum);
		//Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-link m-l-5'])[1]")).click();
		Thread.sleep(3000);

		// Phone OTP verification
		driver.findElement(By.xpath("//*[@placeholder='Enter OTP sent to the phone no. entered*']")).sendKeys(OTP);
		//Thread.sleep(3000);
		
		WebElement verifybtn = driver.findElement(By.xpath("(//*[text()=' Verify'])[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(verifybtn));
		verifybtn.click();
		Thread.sleep(4000);

		System.out.println("The entered Phone and verfied  :" + PhoneNum);

	}

	public void enterEmailID() throws InterruptedException {
		//Thread.sleep(4000);
		String emailID = "test1283715@brigosha.com";
		String mailOTP = "111111";
		driver.findElement(By.xpath("//*[@placeholder='Email ID*']")).sendKeys(emailID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-link m-l-5'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@placeholder='Enter OTP sent to the email ID entered*']")).sendKeys(mailOTP);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-link m-l-5'])[1]")).click();
		System.out.println("The entered emaild and verfied  :" + emailID);

	}

	/*****************************
	 * C. Secondary Contact Details
	 **********************/

	public void enterSecondaryContactDetails(String secName, String secEmail, String SecPhoneNum)
			throws InterruptedException {
		//Thread.sleep(4000);
		String SecondaryContactDetails = "C. Secondary Contact Details";
		scrollToText(SecondaryContactDetails);
		WebElement checkBox = driver.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[1]"));
		// WebElement
		// checkBox=driver.findElement(By.xpath("(//*[@class='ant-checkbox-inner'])[1]"));

		//Thread.sleep(4000);
		checkBox.click();
		Thread.sleep(3000);
		checkBox.click();
		System.out.println("Checked and uncheck same as super administrator");
//enter secondary Contact name
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@placeholder='Name*'])[2]")).sendKeys(secName);
		System.out.println("entered secondary contact name is: " + secName);

//enter secondary Contact EmailID name
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@placeholder='Email*']")).sendKeys(secEmail);
		System.out.println("entered secondary email ID is: " + secEmail);

//Entered secondary Phone number
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@placeholder='Phone Number*'])[2]")).sendKeys(SecPhoneNum);
		System.out.println("entered secondary phone num is is: " + SecPhoneNum);

	}

	/*****************************
	 * D. Billing Details
	 * 
	 * @throws InterruptedException
	 **********************/
	public void BillingDetails() throws InterruptedException {
		//Thread.sleep(4000);
		WebElement state = driver.findElement(By.xpath("(//*[@placeholder='State*'])[2]"));
		// scrollToElement(state);
		String BillingDetails = "D. Billing Details";
		scrollToText(BillingDetails);

		// check or uncheck Same as Super Administrator
		WebElement checkbox2 = driver.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[2]"));
		Thread.sleep(4000);
		checkbox2.click();
		Thread.sleep(2000);
		checkbox2.click();
		System.out.println("Checked and uncheck same as address mentioned in section a ");

		String pincode2 = "560102";
		String address2 = " Basant Health Centre Building, 1, 24th Cross Rd, Sector 3, HSR Layout, Bengaluru, Karnataka 560102";

		driver.findElement(By.xpath("(//*[@placeholder='Pincode*'])[2]")).sendKeys(pincode2);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@placeholder='Building No./Locality/Area*'])[2]")).sendKeys(address2);
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-round
		// ant-btn-primary']")).click();

		// GST check and unchecck;
		WebElement GSTcheckbox = driver.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[3]"));
		Thread.sleep(2000);
		GSTcheckbox.click();
		String panNum = "DBYPP2352G";
		String GSTNum = "235342325";
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@placeholder='PAN No.']")).sendKeys(panNum);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@placeholder='GST No.']")).sendKeys(GSTNum);
		GSTcheckbox.click();
		clickNextbtn();
		clickNextbtn2();

	}

	public void clickNextbtn() throws InterruptedException {
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-round ant-btn-primary']")).click();
		System.out.println("Clicked on Next Button...");

	}

	/************************ Plan ************************/

	public void clickNextbtn2() throws InterruptedException {
		//Thread.sleep(4000);
		WebElement nextbtn2 = driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-round ant-btn-primary']"));
		scrollToElement(nextbtn2);
		nextbtn2.click();
		System.out.println("Clicked on Next Button 2...");

	}

	public void clickCancelbtn2() throws InterruptedException {
		//Thread.sleep(4000);
		WebElement cancelBtn = driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-round ant-btn-default']"));
		scrollToElement(cancelBtn);
		System.out.println("Clicked on cancel Button ...");

	}

	/************************ Agreement ************************/

	public void agreeTeramsAndConditions() throws InterruptedException {
		Thread.sleep(4000);
		// check box element
		clickNextbtn2();
		WebElement checkBoxBtn = driver.findElement(By.xpath("//*[@class='ant-checkbox-input']"));

		String termsandconditions = "I have read and agree/agreed with the Terms & Conditions and Privacy Policy of the Agreement";
		scrollToText(termsandconditions);
		checkBoxBtn.click();
		System.out.println("Accepted terms and conditions ...");
		clickNextbtn();

	}

	/************************ Confirm ************************/

	public void confirmdetails() throws InterruptedException {
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String text = "Subscription for :";

		// Execute JavaScript to scroll up until the specified text is visible
		js.executeScript("arguments[0].scrollIntoView(false);",
				driver.findElement(By.xpath("//*[contains(text(), '" + text + "')]")));

		// 2 year(s)
		// 1 year
		selectPlanPerYear("2 year(s)");
		selectNoOfStudents("1000-1500");
		applyCoupon();
		confirmAndPay();

	}

	public void selectPlanPerYear(String PlanPerYear) throws InterruptedException {
		WebElement planPerYear = driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[1]"));
		Thread.sleep(3000);
		planPerYear.click();

		List<WebElement> plandetails = driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']"));
		int totalcount = plandetails.size();
		System.out.println("The size is :" + " " + totalcount);
		for (int i = 1; i <= totalcount; i++) {
			String nameis = driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]"))
					.getText();
			if (nameis.equalsIgnoreCase(PlanPerYear)) {
				wait(3000);
				driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]")).click();
				System.out.println("The selected option is :" + PlanPerYear);

				break;
			}
		}
	}

	public void selectNoOfStudents(String students) throws InterruptedException {
		WebElement noOfStudents = driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[2]"));
		Thread.sleep(4000);
		noOfStudents.click();
		List<WebElement> ele = driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']"));
		int institutioncount = ele.size();
		System.out.println("The size is :" + " " + institutioncount);
		for (int i = 1; i <= institutioncount; i++) {
			String nameis = driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]"))
					.getText();
			if (nameis.equalsIgnoreCase(students)) {
				wait(3000);
				driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]")).click();
				System.out.println("The selected option is :" + students);

				break;
			}
		}
		// 1000-1500
	}

	public void applyCoupon() throws InterruptedException {
		//Thread.sleep(4000);
		String couponText = "TEST_7882657b_9a1fa54a8096";
		// WebElement inputBox =
		// driver.findElement(By.xpath("//*[@class='ant-input-affix-wrapper']"));
		WebElement inputBox = driver.findElement(By.xpath("//*[@placeholder='Type your code']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Type your code']")));
		for (int i = 0; i < 3; i++) {
			inputBox.sendKeys(couponText);

		}
		//Thread.sleep(4000);

		// inputBox.sendKeys(couponText);

		// Thread.sleep(4000);
		System.out.println("The entered new coupon text is  :" + couponText);

		WebElement couponbtn = driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-default']"));
		Thread.sleep(3000);
		couponbtn.click();
		System.out.println("The coupon card applied :");

	}

	public void confirmAndPay() throws InterruptedException {
		//Thread.sleep(4000);
		WebElement confirmandPayBtn = driver
				.findElement(By.xpath("//*[@class='ant-btn ant-btn-round ant-btn-primary']"));
		WebElement checkBoxThree = driver.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[1]"));

		scrollToElement(confirmandPayBtn);
		Thread.sleep(3000);
		checkBoxThree.click();
		//Thread.sleep(3000);
		confirmandPayBtn.click();
		Thread.sleep(10000);
		/*
		 * String paynNow="Pay Now";
		 * driver.findElement(By.xpath("//*[contains(text(), '" + paynNow +
		 * "')]")).click();
		 */

	}

	public void PayNow(String paymentMode) throws InterruptedException {
		Thread.sleep(3000);
		String phoneNum = "7483093376";
		String cardNumber = "5419190420581913";
		String cardHolderName = "Raghav";
		String expireDate = "0327";
		String cvv = "976";

		// enter phone number

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Phone Number'])[2]")));
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("(//*[text()='Phone Number'])[2]")).sendKeys(phoneNum);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Proceed']")).click();
			Thread.sleep(3000);
		}

		List<WebElement> ele = driver
				.findElements(By.xpath("//*[@class='new-method has-tooltip false svelte-1d17g67']"));
		int institutioncount = ele.size();
		System.out.println("The size is :" + " " + institutioncount);
		for (int i = 1; i <= institutioncount; i++) {
			String nameis = driver
					.findElement(By.xpath("(//*[@class='new-method has-tooltip false svelte-1d17g67'])[" + i + "]"))
					.getText();
			if (nameis.equalsIgnoreCase(paymentMode)) {
				wait(3000);
				driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]")).click();

				System.out.println("The selected option is :" + paymentMode);

				break;
			}
		}
		// card number
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='card_number']")).sendKeys(cardNumber);
//card Name

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='card[name]']")).sendKeys(cardHolderName);
		// expire date

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='card[expiry]']")).sendKeys(expireDate);

		// enter cvv
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='card[cvv]']")).sendKeys(cvv);
		// check box

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='checkbox svelte-wo3pzx']")).click();

	}

	public void openAulasURL() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://aulas.in/");
		Thread.sleep(6000);

		WebElement demoRequest = driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-lg'])[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // 30 seconds timeout
		while (true) {
			try {
				// Wait for the element to be visible
				WebElement element = wait.until(ExpectedConditions.visibilityOf(demoRequest));

				// If the element is visible, break out of the loop
				if (element.isDisplayed()) {
					System.out.println(" demoRequest Element is visible now.");
					break;
				}
			} catch (Exception e) {
				// Element is not visible, so refresh the page
				System.out.println(" demoRequest Element is not visible; refreshing the page...");
				driver.navigate().refresh();

				// Wait for 5 seconds (adjust as needed)
				try {
					Thread.sleep(5000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}

	}

	public void clickrequestDemo() throws InterruptedException {
		Thread.sleep(3000);
		WebElement demoRequest = driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-lg'])[1]"));
		demoRequest.click();

		System.out.println("Clicked on demo request button...");
	}

	public void selectRole(String roleName) throws InterruptedException {
		Thread.sleep(3000);
		// For teacher
		// Administrator
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		List<WebElement> roles = driver
				.findElements(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[5]/button"));
		int totalcount = roles.size();
		System.out.println("The size is :" + " " + totalcount);
		for (int i = 1; i <= totalcount; i++) {
			String nameis = driver
					.findElement(By.xpath("(/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[5]/button)[" + i + "]"))
					.getText();
			if (nameis.equalsIgnoreCase(roleName)) {

				wait.until(ExpectedConditions.elementToBeClickable(
						By.xpath("(/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[5]/button)[" + i + "]")));
				driver.findElement(
						By.xpath("(/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[5]/button)[" + i + "]")).click();
				System.out.println("The selected role is :" + roleName);

				break;
			}
		}
		/*
		 * String buttonText="Administrator"; String xpathExpression =
		 * "//*[contains(text(), '" + buttonText + "')]"; WebElement elementToClick =
		 * driver.findElement(By.xpath(xpathExpression)); elementToClick.click();
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		 * WebElement admin=driver.findElement(By.xpath(
		 * "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[5]/button[2]"));
		 * wait.until(ExpectedConditions.elementToBeClickable(admin)); admin.click();
		 */

	}

	public void countOfStudents(String studentsCount) throws InterruptedException {
		// Thread.sleep(3000);
		// 1 - 100
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		List<WebElement> noOfStudents = driver
				.findElements(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[7]/button"));
		int totalcount = noOfStudents.size();
		System.out.println("The size is :" + " " + totalcount);
		for (int i = 1; i <= totalcount; i++) {
			String nameis = driver
					.findElement(By.xpath("(/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[7]/button)[" + i + "]"))
					.getText();
			if (nameis.equalsIgnoreCase(studentsCount)) {

				wait.until(ExpectedConditions.elementToBeClickable(
						By.xpath("(/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[7]/button)[" + i + "]")));

				driver.findElement(
						By.xpath("(/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[7]/button)[" + i + "]")).click();
				System.out.println("The No. of students are :" + studentsCount);

				break;
			}
		}

	}

	public void fillform() throws InterruptedException {
		// Thread.sleep(3000);
		String Name = "Testing Team";
		String email = "test1283715@brigosha.com";
		String OrganizationName = "Testingacademy.com";
		String mobileNumber = "10830180231";
		String discription = "I would like to invite you to an on-site demo of aulas at your convenience. "
				+ "Our team will demonstrate the key features and functionalities, and answer any questions you may have. "
				+ "Please let me know a few dates and times that work for you, and we will make the necessary arrangements.";
		// name
		driver.findElement(By.xpath("(//*[@placeholder='Full Name*'])[2]")).sendKeys(Name);
		System.out.println("The name is  :" + Name);

		// Thread.sleep(3000);
		// email
		driver.findElement(By.xpath("(//*[@placeholder='Email*'])[2]")).sendKeys(email);
		System.out.println("The emailId is  :" + email);

		// Thread.sleep(3000);
		// organization name
		driver.findElement(By.xpath("(//*[@placeholder='Organisation name*'])[2]")).sendKeys(OrganizationName);
		System.out.println("The organization name is  :" + OrganizationName);

		// Thread.sleep(3000);
		// mobile number
		driver.findElement(By.xpath("(//*[@placeholder='Mobile number*'])[2]")).sendKeys(mobileNumber);
		System.out.println("The mobile number is  :" + mobileNumber);

		// Thread.sleep(3000);
		// discription
		driver.findElement(By.xpath("(//*[@placeholder='Let us know what you need'])[2]")).sendKeys(discription);
		System.out.println("The entered discription is  :" + discription);

		Thread.sleep(3000);
		// sumbit btn
		driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-lg font-600 home-modal-submit-btn'])[2]")).click();
		System.out.println("The clicked on submit button.  :");

	}

	public static void validateSuccessMessage() {
		// Locate the element that contains the success message (replace with your
		// actual locator)
		WebElement successMessageElement = driver.findElement(By.xpath("//*[@class='ant-result-title']"));

		// Get the text of the success message
		String actualMessage = successMessageElement.getText();
		String expectedMessage = "Request sent successfully!";

		// Assert that the actual message matches the expected message
		Assert.assertEquals(actualMessage, expectedMessage, "Success message does not match expected message");
		System.out.println("Success message validation passed!");

	}

	/***************************************
	 * Login to mail
	 * 
	 * @throws InterruptedException
	 *****************/
	public void loginToGmail(String username, String password) throws InterruptedException {
		//Thread.sleep(3000);
		int pageLoadTimeoutSeconds1 = 600;
        driver.manage().timeouts().pageLoadTimeout(pageLoadTimeoutSeconds1, TimeUnit.SECONDS);
		driver.get("https://mail.google.com/");
		WebElement emailInput = driver.findElement(By.id("identifierId"));

		emailInput.sendKeys(username);
		System.out.println("Email id entered successfully ...");
		WebElement nextButton = driver.findElement(By.id("identifierNext"));

		nextButton.click();
		//Thread.sleep(3000);
		WebElement passwordInput = driver.findElement(By.name("Passwd"));
		passwordInput.sendKeys(password);
		System.out.println("Password entered successfully ...");

		WebElement passwordNextButton = driver.findElement(By.id("passwordNext"));
		passwordNextButton.click();
		int pageLoadTimeoutSeconds = 600;
        driver.manage().timeouts().pageLoadTimeout(pageLoadTimeoutSeconds, TimeUnit.SECONDS);		//Thread.sleep(3000);
		WebElement inboxBtn = driver.findElement(By.xpath("(//*[text()='Inbox'])[1]"));
		//int pageLoadTimeoutSeconds = 60*10;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(600));
		/*System.out.println("waiting till inbox text visible ...");
		wait.until(ExpectedConditions.visibilityOf(inboxBtn));

        driver.manage().timeouts().pageLoadTimeout(pageLoadTimeoutSeconds, TimeUnit.SECONDS);
waitElementisVisibleForMail(inboxBtn);*/
		
		try {
            // Wait for the inbox text to be visible
            wait.until(ExpectedConditions.visibilityOf(inboxBtn));

            // Your code to interact with elements in the inbox
            System.out.println("Inbox text is visible. Perform further actions if needed.");

        } catch (Exception e) {
            System.err.println("Timeout waiting for inbox text to be visible.");
            e.printStackTrace();
        }

		System.out.println("The email is opened successfully ...");

	}

	public static void waitElementisVisible(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

		while (true) {
			try {
				// Wait for the element to be visible
				WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));

				// If the element is visible, break out of the loop
				if (element.isDisplayed()) {
					System.out.println("Element is visible now.");
					break;
				}
			} catch (Exception e) {
				// Element is not visible, so refresh the page
				System.out.println("Element is not visible; refreshing the page...");
				driver.navigate().refresh();

				// Wait for 5 seconds (adjust as needed)
				try {
					Thread.sleep(5000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}

	}
	
	public static void waitElementisVisibleForMail(WebElement ele) {
		int waitingFor=60*10;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitingFor));

		while (true) {
			try {
				// Wait for the element to be visible
				WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));

				// If the element is visible, break out of the loop
				if (element.isDisplayed()) {
					System.out.println("Element is visible now.");
					break;
				}
			} catch (Exception e) {
				// Element is not visible, so refresh the page
				System.out.println("Element is not visible; refreshing the page...");
				driver.navigate().refresh();

				// Wait for 5 seconds (adjust as needed)
				try {
					Thread.sleep(8000);
					System.out.println(" refreshing the page...");

				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}

	}

	public void searchInEmail(String searchTerm) throws AWTException {
      
		//String searchTerm = "aulas Onboarding Form";
		WebElement searchBtn = driver.findElement(By.xpath("//*[@placeholder='Search in mail']"));       
		searchBtn.sendKeys(searchTerm);
		System.out.println("searched content name is :..."+searchTerm);

		//searchBtn.sendKeys(Keys.RETURN);
	/*	Robot robot = new Robot();

        // Press and release the Enter key
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);*/
        // Wait until the search results are visible
		
		
		
		}

	public  void openFirstEmail( ) throws InterruptedException {
        // Click on the first email in the search results
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		WebElement firstEmail = driver.findElement(By.xpath("(//*[text()='aulas Onboarding Form'])[2]"));       

		wait.until(ExpectedConditions.visibilityOf(firstEmail));
       // WebElement  = driver.findElement(By.xpath("(//*[text()='Onboarding'])[2]"));  ;
        firstEmail.click();
		//System.out.println("clicked on searched first mail :...");
		Thread.sleep(8000);
		System.out.println("clicked on searched first mail :...");

        // Perform actions on the opened email if needed
    }
	
	public void GetMailLinksExample() {
		// Get all links in the opened inbox
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		WebElement link = driver.findElement(By.xpath("//*[text()='noreply@aulas.in']"));       

		wait.until(ExpectedConditions.visibilityOf(link));
		System.out.println("Link is present and clicked...");


		 /*  List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // Iterate through the links
        for (WebElement link : allLinks) {
            String href = link.getAttribute("href");
            if (href != null && href.startsWith("https")) {
                // Click on links that contain "https" extensions
            	wait.until(ExpectedConditions.visibilityOf(link));
              link.click();
                Set<String> windowHandles = driver.getWindowHandles();

                // Switch to the new tab (assuming the new tab is the last in the set)
                for (String windowHandle : windowHandles) {
                    driver.switchTo().window(windowHandle);
                    System.out.println("switched into new tab ");
            
                }
*/
                // Perform other actions if needed after clicking the link
                // ...

                // Go back to the inbox
              //  driver.navigate().back();
            }
        

		
		
	}
	
	

