package Test;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.AnnouncementPage;
import Pages.AulasCarePage;
import Pages.ClassroomPage;
import Pages.CoursePage;
import Pages.DigitalLibraryPage;
import Pages.FeeManagementPage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.NotificationPage;
import Pages.OnBoardingPage;
import Pages.SchedulePage;
import Pages.TestPage;
import Pages.UserManagementPage;
import Util.TestUtil;

public class OnBoardingForm extends BaseTest {

	LoginClass LC;
	HomePage1 HP;
	TestUtil testUtil;
	UserManagementPage UM;
	ClassroomPage CR;
	CoursePage CP;
	SchedulePage SP;
	FeeManagementPage FM;
	NotificationPage NP;
	DigitalLibraryPage DL;
	TestPage TP;
	AulasCarePage AC;
	AnnouncementPage AP;
	OnBoardingPage OBF;

	public OnBoardingForm() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();
		UM = new UserManagementPage();
		LC = new LoginClass();

		CR = new ClassroomPage();

		CP = new CoursePage();
		SP = new SchedulePage();
		NP = new NotificationPage();
		DL = new DigitalLibraryPage();
		TP = new TestPage();
		AC = new AulasCarePage();
		AP = new AnnouncementPage();
		FM = new FeeManagementPage();
		OBF = new OnBoardingPage();
		// HP = LC.newLoginUsingMobile(prop.getProperty("MobileSuperAdmin"),
		// prop.getProperty("OTP"));
		// HP = LC.newLoginFlow(prop.getProperty("username"),
		// prop.getProperty("password"));

	}
	@Test(priority = 1)
	public void fillDemorequestForm() throws AWTException, InterruptedException {
		OBF.openAulasURL();
		OBF.clickrequestDemo();
		OBF.selectRole("Administrator");
		OBF.countOfStudents("1 - 100");
		OBF.fillform();
		OBF.validateSuccessMessage();

	}
	@Test(priority = 2)
	public void fillAutodeployemtForm() throws AWTException, InterruptedException {
		Thread.sleep(4000);

		OBF.getonboardingURL();
		OBF.clickProceedBtn();
		OBF.InstituteDetails();
		OBF.enterSuperAdminDetails();
		OBF.enterSecondaryContactDetails("Hari Krishna ", "RamaKrishnaParama546@gmail.com", "9812168599");
		OBF.BillingDetails();
		OBF.agreeTeramsAndConditions();
		OBF.confirmdetails();
		// OBF.PayNow("card");
	}

	// sumbit demo request ...
	

	@Test(priority = 2)
	public void LoginToMail() throws AWTException, InterruptedException {
		OBF.loginToGmail("prabhakara.bm@brigosha.com", "Prabha@1994");
		OBF.searchInEmail("aulas Onboarding Form");
		OBF.openFirstEmail();
		OBF.GetMailLinksExample();

	}

	@Test(priority = 3)
	public void createAndFillOnboardingfrom() {
		try {
			
			//submit demo request 
			Thread.sleep(3000);
			System.out.println("Create and fill onborading form request test is started...");
			OBF.openAulasURL();
			OBF.clickrequestDemo();
			OBF.selectRole("Administrator");
			OBF.countOfStudents("1 - 100");
			OBF.fillform();
			OBF.validateSuccessMessage();
			//driver.close();
			
			// Gmail login ..
			OBF.loginToGmail("prabhakara.bm@brigosha.com", "Prabha@1994");
			OBF.searchInEmail("aulas Onboarding Form");
			OBF.openFirstEmail();
			
			//fill onboarding details..
			Thread.sleep(5000);
			System.out.println(" fill onborading form request test is started...");
			OBF.getonboardingURL();
			OBF.clickProceedBtn();
			OBF.InstituteDetails();
			OBF.enterSuperAdminDetails();
			OBF.enterSecondaryContactDetails("Hari Krishna ", "RamaKrishnaParama546@gmail.com", "9812168599");
			OBF.BillingDetails();
			OBF.agreeTeramsAndConditions();
			OBF.confirmdetails();
			System.out.println(" fill onborading form request test is completed....");
			System.out.println("Create and fill onborading form request test is completed...");

			driver.quit();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			// Handle NoSuchElementException (element not found)
			System.out.println("Element not found. Exception message: " + e.getMessage());
		} catch (Exception e) {
			// Handle other exceptions
			System.out.println("An unexpected exception occurred: " + e.getMessage());
		}
		finally {
            // Close the browser
            driver.quit();
        }
	}
	

}