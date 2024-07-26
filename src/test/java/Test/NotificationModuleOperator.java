package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.AnnouncementPage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.NotificationPage;
import Pages.SchedulePage;
//@Listeners(TestNGListener.Listeners.class)

public class NotificationModuleOperator extends Aulas_Base.BaseTest {
	LoginClass LC;

	HomePage1 HP;

	AnnouncementPage AP;
	SchedulePage SP;
	NotificationPage NP;

	public NotificationModuleOperator() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();

		AP = new AnnouncementPage();

		LC = new LoginClass();
		SP = new SchedulePage();
		NP=new NotificationPage();
		//HP = LC.newLoginUsingMobile(prop.getProperty("Np"), prop.getProperty("OTP"));
		HP = LC.newLoginUsingMobile(prop.getProperty("NO"), prop.getProperty("OTP"));


		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver; Thread.sleep(1000);
		 * WebElement Communication =
		 * driver.findElement(By.xpath("//div[text()='Communication']"));
		 * Thread.sleep(1000); js.executeScript("arguments[0].scrollIntoView(true)",
		 * Communication);
		 */

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