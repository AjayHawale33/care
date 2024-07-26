package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PMTHomePage extends Aulas_Base.BaseTest {

	@FindBy(xpath = "(//div[@class='homePage_hoverDiv__2owFr'])")
	WebElement PmtCards;

	@FindBy(xpath = "//div[@class='r-c-c m-l-10']")
	WebElement ListView;

	@FindBy(xpath = "(//div[@class='r-c-c'])[1]")
	WebElement GridView;

	@FindBy(xpath = "(//div[@class='homePage_hoverDiv__2owFr'])[3]")
	WebElement AttendanceCard;

	public PMTHomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickAttendance() {
		AttendanceCard.click();
	}

}
