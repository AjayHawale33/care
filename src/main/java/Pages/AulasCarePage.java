package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Aulas_Base.BaseTest;

public class AulasCarePage extends BaseTest {

	public AulasCarePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@href, '/care')]")
	WebElement AulasCare;

	/*** Institute Support ***/

	@FindBy(xpath = "//*[@class='careCard cursor-pointer']")
	WebElement ClickOnSupport;
	@FindBy(xpath = "//*[text()='Support your students and staff']")
	WebElement Support;
	@FindBy(xpath = "//*[@class='ant-select-selector']")
	WebElement ClickOnSummary;
	@FindBy(xpath = "//*[@title='Week']")
	WebElement ClickOnWeek;
	@FindBy(xpath = "(//*[@title='Months'])[1]")
	WebElement ClickOnMonths;
	@FindBy(xpath = "//*[@class='userCards_viewAll']")
	WebElement ClickOnViewAll;
	@FindBy(xpath = "//*[@placeholder='Search by name']")
	WebElement SearchByName;
	@FindBy(xpath = "(//*[@type='button'])[1]")
	WebElement ClickOnSearchButton;
	@FindBy(xpath = "//*[@class='anticon anticon-close-circle']")
	WebElement xbtn;
	@FindBy(xpath = "(//*[@class='overallStatusCard-h1'])[1]")
	WebElement TotalConversations;
	@FindBy(xpath = "(//*[@class='overallStatusCard-h1'])[2]")
	WebElement ClosedConversations;
	@FindBy(xpath = "(//*[@class='overallStatusCard-h1'])[3]")
	WebElement OpenConversations;
	@FindBy(xpath = "(//*[@data-icon='calendar'])[1]")
	WebElement Calender;
	@FindBy(xpath = "//*[@placeholder='Start Date']")
	WebElement StartDate;
	@FindBy(xpath = "//*[@placeholder='End Date']")
	WebElement EndDate;
	@FindBy(xpath = "(//*[@type='button'])[4]")
	WebElement BackwardBtn;
	@FindBy(xpath = "(//*[text()='7'])[1]")
	WebElement ClickOnSeven;
	@FindBy(xpath = "(//*[text()='17'])[1]")
	WebElement ClickOnSeventeen;
	@FindBy(xpath = "(//*[text()='OK'])[1]")
	WebElement ClickOk;
	@FindBy(xpath = "//*[@class='adminSummary_p']")
	WebElement SelectedSummary;
	@FindBy(xpath = "//*[@class='ant-select-selector']")
	WebElement DropDown;
	@FindBy(xpath = "(//*[@class='ant-select-selector'])[2]")
	WebElement DropDown1;
	@FindBy(xpath = "//*[@class='ant-select-item-option-content']")
	List<WebElement> AllSelections;
	@FindBy(xpath = "(//*[@class='careUserCard-p'])[3]")
	WebElement Operator;
	@FindBy(xpath = "//*[@placeholder='Type a message...']")
	WebElement TypeMessage;
	@FindBy(xpath = "(//*[@focusable='false'])[8]")
	WebElement UploadImage;
	@FindBy(xpath = "//*[@class='anticon anticon-arrow-left']")
	WebElement ConversationBackButton;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[3]")
	WebElement Student;
	@FindBy(xpath = "//div[@class='ant-select-selector']")
	WebElement ClickOnAll;
    @FindBy(xpath ="(//h3[text()='All Batches'])[1]")
    WebElement AllBatches;
   
    
	/*** Resources ***/

	@FindBy(xpath = "//*[@class='careCard cursor-pointer ']")
	WebElement ClickOnFAQs;
	@FindBy(xpath = "//*[@class='careCard ']")
	WebElement ClickOnCovid19;
	@FindBy(xpath = "(//*[@class='queAns'])[8]")
	WebElement FAQsEndPage;
	@FindBy(xpath = "(//h1[@class='careHeading_h2'])[2]")
	WebElement Resource;
	@FindBy(xpath = "//button[text()='FIND A VACCINATION CENTER']")
	WebElement VaccinationCenter;
	@FindBy(xpath = "(//*[contains(@href,'https://healthid.ndhm.gov.in/')])[1]")
	WebElement HealthId;
	@FindBy(xpath = "(//*[@class='dropdwnbtn accessibility-plugin-ac newMenu'])[1]")
	WebElement Dashboard;
	@FindBy(xpath = "(//*[@class='dropdwnbtn accessibility-plugin-ac newMenu'])[2]")
	WebElement VerifyCertificate;
	@FindBy(xpath = "(//*[@class='dropdwnbtn accessibility-plugin-ac newMenu'])[3]")
	WebElement ClickOnFA2;
	@FindBy(xpath = "(//*[@class='dropdwnbtn accessibility-plugin-ac newMenu'])[4]")
	WebElement ClickOnPartners;

	@FindBy(xpath = "(//*[@class='careCard'])[1]")
	WebElement ChatWithAulasTeam;
	@FindBy(xpath = "(//*[@class='careCard'])[2]")
	WebElement CallAulasTeam;

	public void randomTexts() {
		String name = " abcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder name1 = new StringBuilder(10);
		for (int i = 0; i < 10; i++) {
			name1.append(name.charAt(rnd.nextInt(name.length())));
		}
		TypeMessage.sendKeys("Hi...." + name1 + ":)))))Bye");
	}

	public void randomTexts(WebElement ele) {
		String name = " abcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder name1 = new StringBuilder(10);
		for (int i = 0; i < 10; i++) {
			name1.append(name.charAt(rnd.nextInt(name.length())));
		}
		ele.sendKeys(name1);
	}

	public void clickOnAulasCare() {
		WaitTil(2000);
		WebElement Aulascare = AulasCare;
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Aulascare);
		AulasCare.click();

	}

	public void clickOnSupport() {

		WaitTil(2000);
		driver.findElement(By.xpath("(//*[@class='careHomeCards cursor-pointer display-flex'])[1]")).click();
		System.out.println("Clicked on support button...!");
		WaitTil(4000);
		driver.findElement(By.xpath("(//*[@class='careUserCard'])[1]")).click();
		WaitTil(2000);
		WebElement chat=driver.findElement(By.xpath("//*[@testid='Type a message...']"));
		chat.sendKeys("Hi");
		chat.sendKeys(Keys.ENTER);
		}
	
	public void chekcDropInsupoort() {
		WaitTil(2000);
		driver.findElement(By.xpath("//*[@class='ant-select-selector']")).click();
		WaitTil(3000);
		List<WebElement> ele=driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']"));
		int size =ele.size();
		System.out.println("The size is :"+size);
		for(int i=1;i<3;i++) {
			WaitTil(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])["+i+"]")).click();
			WaitTil(2000);
		}
		
	}

	public void overview() {
		System.out.println("Total Overview");
		WaitTil(2000);
		String TotalConversation = TotalConversations.getText();
		System.out.println("Total Conversations : " + TotalConversation);
		WaitTil(2000);
		String ClosedConversation = ClosedConversations.getText();
		System.out.println("Closed Conversations :" + ClosedConversation);
		WaitTil(2000);
		String OpenConversation = OpenConversations.getText();
		System.out.println("Open Conversations : " + OpenConversation);

	}

	public void summary() {
		WaitTil(2000);
		ClickOnMonths.click();
		WaitTil(6000);
		String SelectedSummaryMonths = SelectedSummary.getText();
		System.out.println("Showing Summary Months of " + SelectedSummaryMonths);
		ClickOnWeek.click();
		WaitTil(6000);
		
		Calender.click();
		WaitTil(2000);
		StartDate.click();
		WaitTil(2000);
		BackwardBtn.click();
		WaitTil(2000);
		ClickOnSeven.click();
		WaitTil(2000);
		ClickOnSeventeen.click();
		WaitTil(2000);
		ClickOk.click();
		ClickOk.click();
		WaitTil(2000);
		SelectedSummary.click();
		WaitTil(2000);
		String SelectedSummaryDates = SelectedSummary.getText();
		System.out.println("Showing Summary Dates of " + SelectedSummaryDates);

	}

	public void latestConversation() throws AWTException {
		WaitTil(2000);
		ClickOnViewAll.click();
		WaitTil(2000);
		DropDown.click();
		WaitTil(2000);
		List<WebElement> AllSelects = AllSelections;
		int All = AllSelects.size();
		System.out.println("The element size is :" + All);
		for (int i = 1; i < All; i++) {
			WaitTil(2000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]")).click();
			WaitTil(4000);
			DropDown.click();
			String AllBatches = DropDown.getText();
			System.out.println(AllBatches);
			if (AllBatches.equalsIgnoreCase("All Batches")) {
				WaitTil(2000);
				DropDown1.click();
			}
		}

		if (Operator.equals(Operator)) {
			WaitTil(4000);
			Operator.click();
			WaitTil(4000);
			randomTexts();
			WaitTil(4000);
			enter();
			WaitTil(4000);
			// UploadImage.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			System.out.println("Conversation Support Messages Sent");
		} else {
			WaitTil(2000);
			ConversationBackButton.click();
		}
		WaitTil(2000);
		randomTexts(SearchByName);
		WaitTil(2000);
		ClickOnSearchButton.click();
		WaitTil(2000);
		xbtn.click();
		WaitTil(2000);
		ConversationBackButton.click();
		WaitTil(2000);
		ConversationBackButton.click();
		// WaitTil(2000);
		// recevieConversation();
		WaitTil(2000);
		ConversationBackButton.click();
	}
	
	public void allBatchStudents() {
		WaitTil(2000);
		ClickOnSupport.click();
		WaitTil(2000);
		ClickOnViewAll.click();
		WaitTil(2000);
		DropDown.click();
		WaitTil(2000);
		Student.click();
		WaitTil(2000);
		AllBatches.click();
		
		
		
		
	}

	public void recevieConversation() {
		WaitTil(2000);
		String originalWindow = driver.getWindowHandle();
		assert driver.getWindowHandles().size() == 1;
		driver.findElement(By.linkText("https://test.aulas.one/login")).click();
		WaitTil(4000);
		for (String windowHandle : driver.getWindowHandles()) {
			if (!originalWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

	}

	public void viewAll() throws InterruptedException, AWTException {

		wait(2000);
		ClickOnViewAll.click();
		wait(2000);
		List<WebElement> Allconversation = driver.findElements(By.xpath("//div[@class='careUserCard']"));
		int size = Allconversation.size();
		System.out.println(" total size of the conversation :--------" + size);
		for (int i = 1; i < size; i++) {
			String conversation = driver.findElement(By.xpath("(//div[@class='careUserCard'])[" + i + "]")).getText();
			System.out.println("all the latest conversation list:-------" + conversation);

		}
        ConversationBackButton.click();
	}

	public void AllRoles() {
		wait(2000);
		// click on all
		ClickOnAll.click();
		wait(2000);
		List<WebElement> AllRoles = driver.findElements(By.xpath("//div[@class='ant-select-item-option-content']"));
		int size1 = AllRoles.size();
		System.out.println(" all the roles size:-----" + size1);
		for (int i = 1; i <= size1; i++) {
			wait(2000);
			String RoleNames = driver
					.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[" + i + "]")).getText();
			System.out.println("All the roles name :-------" + RoleNames);

		}
	}

	public void rolesname(String names) throws InterruptedException, AWTException {
		wait(2000);
		driver.findElement(By.xpath("//span[@class='ant-input-affix-wrapper']")).click();
		wait(2000);
		// click on all
		driver.findElement(By.xpath("//div[@class='ant-select-selector']")).click();
		wait(2000);
		// driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
		// wait(2000);
		if (names.equalsIgnoreCase("Teacher")) {

			// click on teacher
			wait(2000);
			driver.findElement(By.xpath("//*[@class='rc-virtual-list-holder-inner']/div[2]")).click();
			wait(2000);
			List<WebElement> teacher = driver.findElements(By.xpath("//div[@class='careUserCard']"));
			int teasize = teacher.size();
			System.out.println("all the teacher name size:-----" + teasize);
			for (int i = 1; i <= teasize; i++) {
				String teachername = driver.findElement(By.xpath("(//div[@class='careUserCard'])[" + i + "]"))
						.getText();
				System.out.println("all the teachers name :----" + teachername);
			}
			Msgpart();
			wait(3000);
			copyFileLocation();
			// driver.findElement(By.xpath("//button[@class='ant-btn
			// ant-btn-primary']")).click();
			wait(3000);
			//driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).sendKeys(Keys.ENTER);
			wait(3000);
			ConversationBackButton.click();
			wait(3000);
			ConversationBackButton.click();
			ClickOnSupport.click();

		}

	}

	public void Msgpart() {
		wait(2000);
		// click on name
		driver.findElement(By.xpath("(//div[@class='careUserCard'])[1]")).click();
		wait(2000);
		// click on type msg filed
		driver.findElement(By.xpath("//textarea[@placeholder='Type a message...']")).sendKeys("hai good morning");
		wait(3000);
		// click on send button
		driver.findElement(By.xpath("//div[@style='margin-bottom: 10px; margin-top: 10px; margin-right: 10px;']"))
				.click();
		wait(2000);
		// click on image
		driver.findElement(By.xpath("//div[@class='imgUploader']")).click();
		wait(2000);

	}

	public void copyFileLocation() throws InterruptedException, AWTException {
		// File Location
		StringSelection select = new StringSelection("C:\\Users\\Brigosha_Guest\\Pictures\\Screenshots\\Screenshot (1).png");
		// Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		Thread.sleep(6000);
		// Create object of Robot class
		Robot robot = new Robot();
		Thread.sleep(1000);

		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// Wait
		Thread.sleep(1000);

		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		// Wait
		Thread.sleep(1000);
		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("---successfull upload---");
	}

	public void ScrollDown() throws InterruptedException {
		wait(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait(2000);
		WebElement Communication = driver.findElement(By.xpath("//div[text()='Communication']"));
		wait(2000);
		js.executeScript("arguments[0].scrollIntoView(true)", Communication);
		wait(2000);
	}

	private void scrollDownTillBottom() {
		WaitTil(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

	public void FAQs() {
		WaitTil(4000);
		String FAQs = ClickOnFAQs.getText();
		System.out.println("FAQs :" + FAQs);
		scrollByElement(ClickOnFAQs);
		ClickOnFAQs.click();
		WaitTil(2000);
		scrollDownTillBottom();
		WaitTil(2000);
		scrollByElement(FAQsEndPage);
		WaitTil(2000);
		scrollByElement(ConversationBackButton);
		WaitTil(2000);
		ConversationBackButton.click();
	}

	public void Covid19resource() throws InterruptedException {

		wait(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(4000);
		WebElement Resources = Resource;
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", Resources);
		Thread.sleep(4000);
		// click on covid 19 resource
		ClickOnCovid19.click();
		wait(2000);
		VaccinationCenter.click();
		wait(2000);
		// click on health id
		HealthId.click();
		wait(3000);
		String oldTab = driver.getWindowHandle();
		driver.switchTo().window(oldTab);
		wait(3000);
		// click on Dashboard
		Dashboard.click();
		wait(3000);
		String oldTab1 = driver.getWindowHandle();
		driver.switchTo().window(oldTab1);
		wait(3000);
		// click on verify certificate
		VerifyCertificate.click();
		wait(4000);

		String oldTab2 = driver.getWindowHandle();
		driver.switchTo().window(oldTab2);
		wait(3000);
		// click on FA2
		ClickOnFA2.click();
		wait(3000);

		String oldTab3 = driver.getWindowHandle();
		driver.switchTo().window(oldTab3);
		wait(3000);

		// click on partners
		ClickOnPartners.click();
		wait(3000);

		String oldTab4 = driver.getWindowHandle();
		driver.switchTo().window(oldTab4);
		wait(3000);
		driver.navigate().back();
		wait(2000);
		driver.navigate().refresh();
		wait(3000);
		ConversationBackButton.click();

	}
	public void chatwithAulasteam() throws InterruptedException, AWTException
	{
		ScrollDown();
		wait(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//a[contains(@href, '/care')]")).click();
		wait(4000);
		WebElement Resources = driver.findElement(By.xpath("(//h1[@class='careHeading_h2'])[2]"));
		wait(4000);
		js.executeScript("arguments[0].scrollIntoView(true)", Resources);
		wait(4000);
		//click on chat with aulas team 
		driver.findElement(By.xpath("(//div[@class='careCard'])[1]")).click();
		wait(2000);
		//click on msg field
		driver.findElement(By.xpath("//textarea[@placeholder='Type your question here...']"))
		.sendKeys("hai good morning ");
		 wait(3000);
		 //click on send button
			driver.findElement(By.xpath("//div[@style='margin-bottom: 10px; margin-top: 10px; margin-right: 10px;']"))
			.click();
			wait(2000);
			//click on image 
			driver.findElement(By.xpath("//div[@class='imgUploader']")).click();
			wait(2000);
		 copyFileLocation();
		 wait(3000);
		 driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).click();
			wait(3000);
		
	}
	public void callaulasTeam() throws InterruptedException
	{
		ScrollDown();
		wait(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//a[contains(@href, '/care')]")).click();
		wait(4000);
		WebElement Resources = driver.findElement(By.xpath("(//h1[@class='careHeading_h2'])[2]"));
		wait(4000);
		js.executeScript("arguments[0].scrollIntoView(true)", Resources);
		wait(4000);
		//click on chat with aulas team 
		WebElement AulasCarenumber = driver.findElement(By.xpath("(//div[@class='careCard'])[2]"));
		String text=AulasCarenumber.getText();
		System.out.println("aulas care number:------"+text);
	}
	public void ChatWithInstitute() throws InterruptedException, AWTException {
		ScrollDown();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@href, '/care')]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(
				"(//h1[@style='margin-bottom: 0px; font-size: 18px; color: rgb(25, 25, 25); opacity: 1; font-family: roboto; font-weight: bold;'])[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@testid='Type your question here...']")).sendKeys("Hai Good Morning");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@style='margin-bottom: 10px; margin-top: 10px; margin-right: 10px;']"))
				.click();
		wait(2000);
	}
	public void CallYourInstitute() throws InterruptedException {
		ScrollDown();
		wait(2000);
		driver.findElement(By.xpath("//a[contains(@href, '/care')]")).click();
		wait(2000);
		WebElement callInstitute=driver.findElement(By.xpath("(//div[@class='careCard'])[1]"));
		String Text=callInstitute.getText();
		System.out.println(" Institute information :-----"+Text);
		Actions ac = new Actions(driver);
		WebElement number=driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-link text-xs bold-600']"));
		ac.moveToElement(number).build().perform();
		
		
	}
	
	
	public void checkALLFAQ() {
		wait(2000);
		//driver.findElement(By.xpath("(//*[@class='careHomeCards cursor-pointer display-flex'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='FAQs']")).click();
		wait(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scrolled down till end of the page ...");
	}
	public void covidResources() {
		wait(5000);
		WebElement covid=driver.findElement(By.xpath("//*[text()='Covid-19 resources']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(covid));
		covid.click();
		
		wait(3000);
		driver.findElement(By.xpath("//*[text()='FIND A VACCINATION CENTER']")).click();
		wait(3000);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
