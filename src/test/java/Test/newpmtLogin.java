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
import Pages.PMTHomePage;
import Pages.PmtLoginPage;
import Pages.SchedulePage;
import Pages.TestPage;
import Pages.UserManagementPage;
import Util.TestUtil;

public class newpmtLogin extends BaseTest {

	PmtLoginPage PMT;
	PMTHomePage PMTHP;

	public newpmtLogin() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();
		PMT = new PmtLoginPage();
		PMTHP = new PMTHomePage();
		PMTHP = PMT.DoLogin();
	}

	@Test(priority = 1)

	public void LoginPmt() throws InterruptedException {
		System.out.println("Login in new flferrr");
		//PMT.DoLogin();
		//PMTHP.DoLogin();
		PMTHP.clickAttendance();

	}

}
