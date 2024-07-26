package Test;

import java.awt.AWTException;

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
import Pages.SchedulePage;
import Pages.TestPage;
import Pages.UserManagementPage;
import Util.TestUtil;

public class AllModulesSmokeTest extends BaseTest {

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

	public AllModulesSmokeTest() {
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
		FM=new FeeManagementPage();
		//HP = LC.newLoginUsingMobile(prop.getProperty("MobileSuperAdmin"), prop.getProperty("OTP"));
		HP = LC.newLoginFlow(prop.getProperty("username"), prop.getProperty("password"));

	}

	/******************************* User managemenement **************/
	/*@Test(priority = 1)
	public void userCreations() throws InterruptedException {
		System.out.println("User managemenement: Test case 1 User Management  started ");
		//Thread.sleep(0);
		
		WaitTil(2000);
		UM.clickUserManagement();
		WaitTil(2000);
		UM.validateClickCancelStudent();
		WaitTil(2000);
		UM.addaUser("StudentCreation");
		WaitTil(2000);
		UM.validateClickCancelTeacher();

		WaitTil(2000);
		UM.addaUser("TeacherCreation");
		WaitTil(2000);

		UM.validateClickCancelDataOperator();
		WaitTil(2000);
		UM.addaUser("DataOperatorCreation");

		UM.validateClickCancelOperation();
		WaitTil(2000);
		UM.addaUser("OperationCreation");
		WaitTil(4000);

		
	}

	@Test(priority = 2)
	public void validateUserManagementPage() throws InterruptedException  {
		WaitTil(2000);
		
			Thread.sleep(3000);
		
		System.out.println("User managemenement:Test case 2 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.validateUserManagementPage();
		WaitTil(4000);
		System.out.println("User managemenement:Test case 2 Completed ");
		
	}

	@Test(priority = 3)
	public void registrationRequestsApprovals() throws InterruptedException  {
		WaitTil(2000);
	
		System.out.println("User managemenement:Test case 3 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.registrationRequestsApprovals();
		WaitTil(4000);
		System.out.println("User managemenement:Test case 3 Completed ");
		
	}

	@Test(priority = 4)
	public void validateRegistrationRequestsPage() throws InterruptedException {
		WaitTil(2000);
	
		System.out.println("User managemenement:Test case 4 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.validateRegistrationRequestsPage();
		WaitTil(4000);
		System.out.println("User managemenement:Test case 4 Completed ");
		
	}*/

	/**************************
	 * Fee Management -Test cases not added
	 *********************/
	
/*	@Test(priority = 1)
	public void OverviewAndGenerateOnlineRequest() throws InterruptedException {
		System.out.println("--------Fee Management The test case 11 was started------- ");
		WaitTil(2000);
		FM.validateFeemanagementPage();
		WaitTil(2000);
		WaitTil(2000);
		System.out.println("--------Fee Management The test case 11 was completed------- ");
		
	}
 @Test(priority = 2)
	public void GenerateOnlineRequest() throws InterruptedException {
		WaitTil(2000);
		FM.GeneratePaymentRequest();
		WaitTil(2000);
		FM.PaymentRequestForClass();
		WaitTil(2000);
		System.out.println("--------Fee Management The test case 12 was completed-------");
		}
	@Test(priority = 3)
	public void AddOfflinePaymnet() throws InterruptedException {
		//System.out.println("--------The test case 3 was started------- ");
		WaitTil(2000);
		FM.AddAllOfflinePaymnets();
		System.out.println("--------Fee Management The test case 13 was completed-------");
		}

	@Test(priority = 4)
	public void Transaction() throws InterruptedException {
		//System.out.println("--------The test case 6 was started------- ");
		Thread.sleep(2000);
		FM.Transaction();
		System.out.println("--------Fee Management The test case 14 was completed-------");
		}

	@Test(priority = 5)
	public void AllStudents() throws InterruptedException {
		//System.out.println("--------The test case 7 was started------- ");
		Thread.sleep(2000);
		FM.studentAll();
		System.out.println("--------Fee Management The test case 15 was completed-------");
		} 
	/**************************
	 * ClassRoom -Test cases 
	 *********************/
/*	@Test(priority = 6)
	public void CreateClassRoom() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("ClassRoom:Test case 6 started ");
		CR.clickingClassRoom();
		wait(3000);
		CR.clickOnCreateNewClass();
		wait(3000);
		CR.enterClassRoomDetails();
		wait(3000);
		CR.clickONSAVE();
		wait(3000);
		CR.cilckMayBeLater();
		
		WaitTil(4000);
		System.out.println("ClassRoom:Test case 6 completed ");
		
	}

	/******************* CourseModule *******************************/

/*	@Test(priority = 7)
	public void CourseCreations() throws InterruptedException {
		wait(3000);
	
		System.out.println("CourseModule:Test case 7 started ");
		// CP.ClickonCourse();
		CP.CancelCourse();
		WaitTil(2000);
		driver.navigate().refresh();
		WaitTil(2000);
		CP.CourseCreation();
		WaitTil(5000);
		System.out.println("CourseModule:Test case 7 completed ");
		

	}

	@Test(priority = 8)
	public void CourseUpdate() throws InterruptedException {
		System.out.println("CourseModule:Test case 8 started ");
	
		WaitTil(2000);
		CP.CourseUpdate();
		WaitTil(4000);
		System.out.println("CourseModule:Test case 8 completed ");
		
	}

	/***************************************
	 * Schedule Module-Test cases are not added
	 **************************/
	/***************************************
	 * Attendance Module-Test cases are not added
	 **************************/

	/************************
	 * Digital Library
	 * 
	 * @throws AWTException
	 ***********************************/

	/*
	 * @Test(priority=12) public void GetStorage() throws InterruptedException,
	 * AWTException { System.out.println("Digital Library:Test case 12 is Started");
	 * //WaitTil(4000); DL.GetStorage(); WaitTil(4000); DL.LectureNotes();
	 * WaitTil(2000); System.out.println("click on video"); DL.ClickOnVideo();
	 * WaitTil(2000); DL.ClickOnYouTubeVideo(); WaitTil(2000); DL.DocumentNotes();
	 * WaitTil(2000);
	 * System.out.println("Digital Library:Test case 12 is completed"); }
	 */

	/*@Test(priority = 9)
	public void AllClassesDemo() throws InterruptedException, AWTException {
		WaitTil(2000);
		
		System.out.println("Digital Library:Test case 13 is Started");
		DL.AllClasses();
		WaitTil(2000);
		System.out.println("Digital Library:Test case 13 is completed");
		

	}

	/*********************************** Test Module ************************/
	/*@Test(priority = 10)
	public void createPageTest() throws InterruptedException {
		Thread.sleep(3000);
		
		System.out.println("Test Module:Test case 14 is Started");
		// date();
		TP.clickOnTestButton();
		TP.clickOnCreateTest();
		TP.chooseTestType("Objective");
		TP.enterDetailsOfTest();
		TP.fillTimeAndDate();
		TP.testQuestion();
		TP.clickOnPublish("yes");
		System.out.println("Test Module:Test case 14 is Completed");
		
	}

	@Test(priority = 11)
	public void viewAll() throws InterruptedException {
		Thread.sleep(3000);
		
		System.out.println("Test Module:Test case 15 is Started");
		TP.clickOnTestButton();
		TP.clickOnViewAll();
		TP.selectSyllabusLoop();
		// TP.dateFilter();
		TP.filterByClass();
		TP.searchByName("Hello");
		// TP.clickOnPublish("YES");
		System.out.println("Test Module:Test case 15 is Completed");
		

	}

	/**********************************************
	 * Practice Test-Test cases are not added
	 ***************/
	/**********************************************
	 * Announcement-Test cases
	 ***************/
/*	@Test(priority = 12)
	public void AnnouncementClick() throws InterruptedException {
		Thread.sleep(1000);
		
		System.out.println("Announcement:Test cases 17 is started");
		AP.AnnouncementModule();
		Thread.sleep(1000);
		AP.validateAnnouncementText();
		Thread.sleep(1000);
		AP.SearchDraftAnnouncement();
		System.out.println("Announcement:Test cases 17 is Completed");
		
	}

	/**********************************************
	 * Aulas Care-Test cases
	 ***************/
@Test(priority = 13)
	public void instituteSupport() throws AWTException, InterruptedException {
		System.out.println("Aulas Care :Test case 12 is started");
		
		WaitTil(2000);
		AC.clickOnAulasCare();
		WaitTil(2000);
		AC.clickOnSupport();
		WaitTil(2000);
		AC.overview();
		WaitTil(2000);
		AC.summary();
		WaitTil(2000);
		AC.viewAll();
		WaitTil(2000);
		AC.latestConversation();
		System.out.println("Aulas Care :Test case 12 is completed");
		
	}

/*		@Test(priority = 14)
	public void resources() throws InterruptedException {
		WaitTil(2000);
	
		System.out.println("Aulas Care :Test case 13 is Started");
		AC.clickOnAulasCare();
		WaitTil(2000);
		AC.FAQs();
		WaitTil(2000);
		AC.Covid19resource();
		System.out.println("Aulas Care :Test case  13 is completed");
		
		
	}

	@Test(priority = 15)
	public void chatAndCallWithAulasTeam() throws InterruptedException, AWTException {
		WaitTil(2000);
		
		System.out.println("Aulas Care :Test case 14 is Started");
		AC.chatwithAulasteam();
		WaitTil(2000);
		AC.callaulasTeam();
		System.out.println("Aulas Care :Test case 14 is Completed");
		
	}*/

	/************************* Notofication Module ***************************/
	@Test(priority = 16)
	public void checkAllNotifiations() throws InterruptedException {
		System.out.println("Notification : First test case 7 started ");
		Thread.sleep(3000);
		NP.clickOnNotification();
		NP.clickAllNotifications();
		NP.numberOfBlocksInAllNotifications();
		System.out.println("Notification : First test case 7 Completed ");
		
	}

	@Test(priority = 17)
	public void selectValuesIndropdown() throws InterruptedException {
		System.out.println("Notification : First test case 8 started ");
		NP.clickOnNotification();
		NP.clickAllNotifications();
		NP.clickAllSelectOneByOne();
		System.out.println("Notification : First test case 8 Completed ");
	}

	@Test(priority = 18)
	public void announcements() throws InterruptedException {
		System.out.println("Notification : First test case 9 started ");
		NP.clickOnNotification();
		NP.clickOnAnnouncement();
		NP.clickAllSelectOneByOne();
		System.out.println("Notification : First test case 9 completed ");
	}

	@Test(priority = 19)
	public void assignments() throws InterruptedException {
		System.out.println("Notification : First test case 10 started ");
		NP.clickOnNotification();
		NP.clickOnAssignments();
		NP.clickAllSelectOneByOne();
		System.out.println("Notification : First test case 10 Completed ");
	}

	@Test(priority = 20)
	public void Test() throws InterruptedException {
		System.out.println("Notification : First test case 11 started ");
		NP.clickOnNotification();
		NP.clickOnTest();
		NP.clickAllSelectOneByOne();
		System.out.println("Notification : First test case 11 Completed ");
	}
	

}