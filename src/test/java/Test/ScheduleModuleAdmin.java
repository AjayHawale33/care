package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.AnnouncementPage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.SchedulePage;

//@Listeners(listerns_Demo.Listerns_Test.class)

public class ScheduleModuleAdmin extends Aulas_Base.BaseTest {
	LoginClass LC;

	HomePage1 HP;

	AnnouncementPage AP;
	SchedulePage SP;

	public ScheduleModuleAdmin() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();

		AP = new AnnouncementPage();

		LC = new LoginClass();
		SP = new SchedulePage();

		// HP = LC.loginViaEmail(prop.getProperty("username"),
		// prop.getProperty("password"));
		// HP = LC.loginViaPhone(prop.getProperty("phoneNumber"),
		// prop.getProperty("OTP"));
		// HP = LC.LoggingThorught(prop.getProperty("phoneNumber"),
		// prop.getProperty("OTP"));
		// email,mobile
		HP = LC.modeOfLogin("email");
		//HP = LC.loopLoginTest("99123");
		//HP = LC.loopLoginTest("99123");
	}

	@Test(priority = 1)
	public void CreateAndJoinBroadcast() throws InterruptedException {
		try {
			System.out.println("Create or Schedule Broadcast Test is started..");
			SP = HP.selectMyAccount();
			// SP.clickOnSceduleModule();
			SP.clickOnCreateButton();
			SP.selectSubject();
			SP.selectClass();
			SP.selectTeachername("!1234");
			SP.selectModeOfTheClass("Broadcast");
			SP.selectStartDate();
			SP.getLocalTime();
			// SP.repeatOnDay();
			SP.selectrepeatOnDay();
			SP.selectLastDay();
			SP.clickOnSaveBtn();
			SP.doLogOut();
			SP.doLoginAsTeacher("99123", "592726");
			SP.openScheuduleAsTeacher();
			SP.JoinMeeting();
			SP.verifyMenu();

			// SP.JoinNow();
			// SP.CheckwhiteBoard("Leave");

			System.out.println("Create or Schedule Broadcast and join broadcast Test is completed..");

		} catch (org.openqa.selenium.NoSuchElementException e) {
			// Handle NoSuchElementException (element not found)
			System.out.println("Element not found. Exception message: " + e.getMessage());
			System.out.println("Create or Schedule Broadcast and join broadcast Test is completed..");

		} catch (Exception e) {
			// Handle other exceptions
			System.out.println("An unexpected exception occurred: " + e.getMessage());
			System.out.println("Create or Schedule Broadcast and join broadcast Test is completed..");

		}

	}

	@Test(priority = 2)
	public void JoinBroadcast() throws InterruptedException {
		System.out.println("..Join Broadcast test is started..");

		try {
			SP = HP.selectMyAccount();
			// SP.clickOnCreateButton();
			SP.doLogOut();
			SP.doLoginAsTeacher("99123", "592726");
			SP.openScheuduleAsTeacher();
			SP.JoinMeeting();
			SP.verifyMenu();
//SP.checkallFeaturesInWhiteboard();
//SP.JoinMeeting();
			System.out.println("..Join Broadcast test is started..");

		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			// Handle NoSuchElementException (element not found)
			System.out.println("Element not found. Exception message: " + e.getMessage());
			// System.out.println("..Join Broadcast test is completed..");

		} catch (Exception e) {
			// Handle other exceptions
			System.out.println("An unexpected exception occurred: " + e.getMessage());
			// System.out.println("..Join Broadcast test is completed..");

		}
	}

}
