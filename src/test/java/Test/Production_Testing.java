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

public class Production_Testing extends BaseTest {

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

	public Production_Testing() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		//initilization();
		setUpBrowser("production");
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
		//HP = LC.modeOfLogin("email");
		HP = LC.ProdmodeOfLogin("email");

	}
	@Test(priority = 1)
	public void fillDemorequestForm() throws AWTException, InterruptedException {
		CP=HP.selectCourseModule();
		CP.selectTypeofCourse("Live Courses");
		CP.clickAddLiveCourse();
		CP.fillLiveCourseDetails();
		
		

	}
}