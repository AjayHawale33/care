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

public class NotificationSuperAdmin extends BaseTest {

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

	public NotificationSuperAdmin() {
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
		HP = LC.newLogin3(prop.getProperty("username"), prop.getProperty("password"));

	}
	@Test(priority = 1)
	public void checkAllNotifiations() throws InterruptedException {
		System.out.println("Notification : Checking all notifications started ");
		Thread.sleep(3000);
		NP.clickOnNotification();
		NP.checkAllNotications();
		//NP.clickAllNotifications();
		//NP.numberOfBlocksInAllNotifications();
		System.out.println("Notification : Checking all notifications Completed ");
		
	}

	@Test(priority = 2)
	public void announcemnetNotifi() throws InterruptedException {
		System.out.println("Notification :Checking Announcement notifications started ");
		Thread.sleep(3000);
		NP.clickOnNotification();
		NP.checkAnnouncementNotications();
		//NP.clickAllNotifications();
		//NP.numberOfBlocksInAllNotifications();
		System.out.println("Notification :Checking Announcement notifications Completed ");
		
	}
	@Test(priority = 3)
	public void testNotifi() throws InterruptedException {
		System.out.println("Notification :Checking Test notifications started ");
		Thread.sleep(3000);
		NP.clickOnNotification();
		NP.testNotications();
		//NP.clickAllNotifications();
		//NP.numberOfBlocksInAllNotifications();
		System.out.println("Notification :Checking Test notifications Completed ");
		
	}
	@Test(priority = 4)
	public void feePaymentNotifi() throws InterruptedException {
		System.out.println("Notification :Checking feePayment notifications started ");
		Thread.sleep(3000);
		NP.clickOnNotification();
		NP.feePaymentNotications();
		System.out.println("Notification :Checking feePayment notifications Completed ");
		
	}
	
	@Test(priority = 5)
	public void DLNotifi() throws InterruptedException {
		System.out.println("Notification :Checking DL-notifications started ");
		Thread.sleep(3000);
		NP.clickOnNotification();
		NP.DLNotications();
		System.out.println("Notification :Checking DL- notifications Completed ");
		
	}
	
	@Test(priority = 6)
	public void othersNotifi() throws InterruptedException {
		System.out.println("Notification :Checking DL-notifications started ");
		Thread.sleep(3000);
		NP.clickOnNotification();
		NP.otherNotications();
		System.out.println("Notification :Checking DL- notifications Completed ");
		
	}
	
	
	@Test(priority = 7)
	public void dropDownValidation() throws InterruptedException {
		System.out.println("Notification :Checking dropdown started ");
		Thread.sleep(3000);
		NP.clickOnNotification();
		NP.dropDownCheck();
		System.out.println("Notification :Checking dropdown Completed ");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
















