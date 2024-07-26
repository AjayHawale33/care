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

public class AulasCareSuperAdmin extends BaseTest {

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

	public AulasCareSuperAdmin() {
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
	public void instituteSupport() throws AWTException, InterruptedException {
		System.out.println("Aulas Care :Test case 12 is started");
		
		WaitTil(2000);
		AC.clickOnAulasCare();
		WaitTil(2000);
		AC.clickOnSupport();
		System.out.println("Aulas Care :Test case 12 is completed");
		
	}

@Test(priority = 2)
	public void resources() throws InterruptedException {
		WaitTil(2000);
	
		System.out.println("Aulas Care :Test case 13 is Started");
		AC.clickOnAulasCare();
		WaitTil(2000);
		AC.checkALLFAQ();
		
		System.out.println("Aulas Care :Test case  13 is completed");
		
		
	}

	@Test(priority = 15)
	public void chatAndCallWithAulasTeam() throws InterruptedException, AWTException {
		WaitTil(2000);
		
		System.out.println("Aulas Care :Test case 14 is Started");
		AC.clickOnAulasCare();
		WaitTil(2000);
		AC.covidResources();
		System.out.println("Aulas Care :Test case 14 is Completed");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}