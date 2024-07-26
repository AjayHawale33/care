package Pages;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Aulas_Base.BaseTest;

public class CoursePage extends BaseTest {
	@FindBy(xpath = "//a[@href ='/course']")
	WebElement Course;
	@FindBy(xpath = "(//button[@class='ant-btn'])[1]")
	WebElement AddCourse;
	@FindBy(xpath = "//*[@class='ant-btn ant-btn-default']")
	WebElement CourseName;
	@FindBy(xpath = "(//input[@class='ant-input'])[4]")
	WebElement CourseDuration;
	@FindBy(xpath = "//*[@class='ant-modal-body']/div/div[2]/div[2]/div[2]/div[2]/div/div")
	WebElement CourseDurationIn;
	@FindBy(xpath = "//div[text()='Day(s)']")
	WebElement CourseDurationInDays;
	@FindBy(xpath = "//div[text()='Month(s)']")
	WebElement CourseDurationInMonths;
	@FindBy(xpath = "//div[text()='Year(s)']")
	WebElement CourseDurationInYears;
	@FindBy(xpath = "(//input[@class='ant-input'])[2]")
	WebElement Description;
	@FindBy(xpath = "(//div[@class='ant-picker datePicker'])[1]")
	WebElement StartDate;
	@FindBy(xpath = "(//button[@class='ant-picker-header-next-btn'])[1]")
	WebElement NextMonth;
	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'])[9]")
	WebElement Date1;
	@FindBy(xpath = "(//div[@class='ant-picker datePicker'])[2]")
	WebElement EndDate;
	@FindBy(xpath = "(//button[@class='ant-picker-header-super-next-btn'])[2]")
	WebElement NextYear;
	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'])[71]")
	WebElement Date2;
	@FindBy(xpath = "(//input[@class='ant-input'])[3]")
	WebElement TotalCourseFee;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	WebElement BillingPlan;
	@FindBy(xpath = "//div[text()='Monthly']")
	WebElement MonthlyPlan;
	@FindBy(xpath = "//div[text()='Quarterly']")
	WebElement QuarterlyPlan;
	@FindBy(xpath = "//div[text()='Half Yearly']")
	WebElement HalfYearlyPlan;
	@FindBy(xpath = "(//div[text()='Annually'])[1]")
	WebElement AnnuallyPlan;
	@FindBy(xpath = "(//div[text()='One time'])[1]")
	WebElement OneTimePlan;
	@FindBy(xpath = "//div[text()='One time']")
	WebElement OneTimePlan1;
	@FindBy(xpath = "(//div[text()='Customize'])[1]")
	WebElement CustomizePlan;
	@FindBy(xpath = "(//input[@class='ant-input'])[5]")
	WebElement FirstInstalment;
	@FindBy(xpath = "//div[text()='+ADD INSTALLMENT']")
	WebElement ADDINSTALLMENT;
	@FindBy(xpath = "(//input[@class='ant-input'])[6]")
	WebElement SecondInstalment;
	@FindBy(xpath = "(//button[@class='ant-btn'])[2]")
	WebElement CancelButton;
	@FindBy(xpath = "(//*[@class='ant-btn ant-btn-default'])[2]")
	WebElement AddButton;
	// **************Deletecourse********************//
	@FindBy(xpath = "(//div[@class='box-shadow courseCardB'])[1]")
	WebElement OpenCourse;
	@FindBy(xpath = "(//*[text()='UPDATE'])[1]")
	WebElement CourseUpdate;
	@FindBy(xpath = "//div[@class='ant-page-header-back-button']")
	WebElement BackButton;

	@FindBy(xpath = "(//button[@class='ant-btn'])[1]")
	WebElement CourseDelete;
	@FindBy(xpath = "//span[@class='ant-input-affix-wrapper ant-input-affix-wrapper-lg']/input")
	WebElement CourseSearch;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-lg ant-btn-icon-only ant-input-search-button']")
	WebElement CourseSearchButton;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	WebElement CourseDeleteYes;
	@FindBy(xpath = "(//button[@class='ant-btn'])[3]")
	WebElement CourseDeleteNo;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public CoursePage() {
		PageFactory.initElements(driver, this);
	}

	UserManagementPage UM = new UserManagementPage();

	public void ClickonCourse() throws InterruptedException {
		WaitTil(2000);
		Course.click();
		WaitTil(2000);

	}

	public void CancelCourse() throws InterruptedException {
		WaitTil(2000);
		Course.click();
		WaitTil(2000);
		WaitTil(2000);

		// AddCourse.click();
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-default']")).click();
		WaitTil(2000);
		// CancelButton.click();
		driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default'])[2]")).click();
		// *[text()='CANCEL']
		WaitTil(2000);

	}

	public void CourseCreation() throws InterruptedException {

		Thread.sleep(3000);
		// AddCourse.click();

		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-default']")).click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(8);
		for (int n = 0; n < 8; n++) {
			name.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		Thread.sleep(3000);
		CourseName.sendKeys(name);
		WaitTil(2000);
		String captals1 = "123456789";
		Random rnd1 = new Random();
		StringBuilder Duration = new StringBuilder(2);
		for (int n = 0; n < 2; n++) {
			Duration.append(captals1.charAt(rnd1.nextInt(captals1.length())));
		}
		CourseDuration.sendKeys(Duration);
		WaitTil(2000);
		CourseDurationIn.click();
		WaitTil(2000);
		CourseDurationInMonths.click();
		WaitTil(2000);
		StringBuilder Des = new StringBuilder(15);
		for (int n = 0; n < 15; n++) {
			Des.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		Description.sendKeys(Des);
		WaitTil(2000);
		StartDate.click();
		WaitTil(2000);
		NextMonth.click();
		WaitTil(2000);
		Date1.click();
		WaitTil(2000);
		StringBuilder Fee = new StringBuilder(5);
		for (int n = 0; n < 5; n++) {
			Fee.append(captals1.charAt(rnd1.nextInt(captals1.length())));
		}
		TotalCourseFee.sendKeys(Fee);
		WaitTil(2000);
		WebElement Billingplan = driver.findElement(By.xpath("//*[text()='Billing plan']"));
		js.executeScript("arguments[0].scrollIntoView(true)", Billingplan);
		WaitTil(2000);
		BillingPlan.click();
		WaitTil(2000);
		CustomizePlan.click();
		WaitTil(2000);
		StringBuilder Fee1 = new StringBuilder(3);
		for (int n = 0; n < 3; n++) {
			Fee1.append(captals1.charAt(rnd1.nextInt(captals1.length())));
		}
		FirstInstalment.sendKeys(Fee1);
		WaitTil(2000);
		ADDINSTALLMENT.click();
		WaitTil(2000);
		SecondInstalment.sendKeys(Fee1);
		WaitTil(2000);
		AddButton.click();
		WaitTil(2000);
		// UM.popupContent();

	}

	public void SearchCourse() throws InterruptedException {
		WaitTil(2000);
		Course.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(8);
		for (int n = 0; n < 8; n++) {
			name.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		WaitTil(2000);
		CourseSearch.sendKeys(name);
		WaitTil(2000);
		CourseSearchButton.click();
		WaitTil(2000);

	}

	public void CourseUpdate() throws InterruptedException {
		WaitTil(2000);
		Course.click();
		WaitTil(2000);
		OpenCourse.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(8);
		for (int n = 0; n < 8; n++) {
			name.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		WebElement CourseName1 = CourseName;
		CourseName1.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		CourseName1.sendKeys(Keys.DELETE);
		WaitTil(2000);
		CourseName1.sendKeys(name);
		WaitTil(2000);
		String captals1 = "123456789";
		Random rnd1 = new Random();
		StringBuilder Duration = new StringBuilder(2);
		for (int n = 0; n < 2; n++) {
			Duration.append(captals1.charAt(rnd1.nextInt(captals1.length())));
		}
		WebElement CourseDuration1 = CourseDuration;
		CourseDuration1.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		CourseDuration1.sendKeys(Keys.DELETE);
		WaitTil(2000);
		CourseDuration1.sendKeys(Duration);
		WaitTil(2000);
		StringBuilder Des = new StringBuilder(15);
		for (int n = 0; n < 15; n++) {
			Des.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		Description.sendKeys(Des);
		WaitTil(2000);
		/*
		 * CourseDurationIn.click(); WaitTil(2000); CourseDurationInYears.click();
		 * WaitTil(2000); JavascriptExecutor js= (JavascriptExecutor)driver; WebElement
		 * CourseFeePlan =
		 * driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		 * js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan);
		 * WaitTil(2000); BillingPlan.click(); WaitTil(2000); MonthlyPlan.click();
		 * WaitTil(2000);
		 */
		CourseUpdate.click();
		WaitTil(2000);
		WebElement messagElement = driver.findElement(By.xpath("//div[@class='ant-notification-notice-content']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		WaitTil(2000);

	}

	public void CourseDelete() throws InterruptedException {
		WaitTil(2000);
		Course.click();
		WaitTil(2000);
		OpenCourse.click();
		WaitTil(2000);
		CourseDelete.click();
		WaitTil(2000);
		CourseDeleteNo.click();
		WaitTil(2000);
		CourseDelete.click();
		WaitTil(2000);
		CourseDeleteYes.click();
		WaitTil(2000);
		WebElement messagElement = driver.findElement(By.xpath("//div[@class='ant-notification-notice-content']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		WaitTil(2000);
	}

	public void selectTypeofCourse(String courseType) {
		// Live Courses,Video Resources,Online Test Series,Study Materials

		List<WebElement> noOfCourses = driver.findElements(By.xpath("//*[@class='course-dashboard-card']"));
		int sizeOfCourses = noOfCourses.size();
		System.out.println("Total size is ..." + sizeOfCourses);

		for (int i = 1; i <= sizeOfCourses; i++) {
			String nameOfCourse = driver.findElement(By.xpath("(//*[@class='course-dashboard-card'])[" + i + "]"))
					.getText();
			if (nameOfCourse.equalsIgnoreCase(courseType)) {
				wait(3000);
				driver.findElement(By.xpath("(//*[@class='course-dashboard-card'])[" + i + "]")).click();
				System.out.println("Selected course type is " + courseType + "...");
				break;
			}

		}

	}

	public void clickAddLiveCourse() {
		driver.findElement(By.xpath("//*[@class='sc-bdvvtL gfCDdx r-c-c']")).click();
		System.out.println("Clicked on add live course button...");

	}

	public void fillLiveCourseDetails() {
		courseName();
		ModeOfClass("ONLINE");
		courseBreif();
		courseDisc();
//Add course thumbnail
		ImageUploadExample();
		selectCategory();
		selectSubCategory();
		selectDifficulty("Beginner");
		selectDuration("2");
		selectPlan("Day(s)");
		startDate();
		enterRegistrationfee("199");
		enterTotalfee("299");
		selectDiscount("10");
		youtubeLink();

	}

	public void courseName() {
		// Live course name *
		String courseName = "API Automation testing";
		driver.findElement(By.xpath("//*[@placeholder='Enter course name']")).sendKeys(courseName);
	}

	public void ModeOfClass(String modeOfClass) {
		// Mode of class *
		// OFFLINE,HYBRID,ONLINE
		driver.findElement(By.xpath("//*[text()='" + modeOfClass + "']")).click();

	}
	
	public void courseBreif() {
		// Live course brief *
				String coursebrief = "Rest API Test Automation &amp; postman tutorial with Java from Basics to Framework with Real time examples";
				driver.findElement(By.xpath("//*[@placeholder='Enter course brief']")).sendKeys(coursebrief);

	}
	
	public void courseDisc() {
		//Description *
				String Description = " We start from Beginners level and go through Advanced FRAMEWORK level. ";
				driver.findElement(By.xpath("//*[@placeholder='//*[@data-placeholder='Add description']']"))
						.sendKeys(Description);
	}
	

	public void ImageUploadExample() {

		// Create a sample JPEG image
		BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
		File output = new File("sample.jpg");
		try {
			ImageIO.write(image, "jpg", output);
			// Find the file upload input element
			WebElement fileInput = driver.findElement(By.xpath("//*[text()=' Choose file ']"));

			// Upload the image file
			fileInput.sendKeys(output.getAbsolutePath());

			// You might need to add some waiting here for the file to upload

			// Perform any necessary actions after the upload

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void selectCategory() {
		driver.findElement(By.xpath("//*[text()='Select category']")).click();
		WebElement categoryEle = driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[1]"));
		// *[text()='Youtube_Test']
		categoryEle.click();
		String nameofCategory = categoryEle.getText();
		System.out.println("The selected category name is..." + nameofCategory);

	}

	public void selectSubCategory() {
		driver.findElement(By.xpath("//*[text()='Select subcategory']")).click();
		WebElement SubcategoryEle = driver.findElement(By.xpath("//*[text()='YouTube_Player']"));
		SubcategoryEle.click();
		String nameofSubCategory = SubcategoryEle.getText();
		System.out.println("The selected Sub category name is..." + nameofSubCategory);

	}

	public void selectDifficulty(String difficult) {
		driver.findElement(By.xpath("//*[text()='Select difficulty']")).click();
		// Beginner,Intermediate,Expert
		WebElement levelOfDifficulty = driver.findElement(By.xpath("//*[text()='" + difficult + "']"));
		levelOfDifficulty.click();
		String difLevel = levelOfDifficulty.getText();
		System.out.println("The level of difficulty is ..." + difLevel);

	}

	public void selectDuration(String duration) {
		driver.findElement(By.xpath("//*[@placeholder='Enter duration']")).sendKeys(duration);
		System.out.println("The level of difficulty is ...");

	}

	public void selectPlan(String plan) {
		driver.findElement(By.xpath("//*[text()='Select plan']")).click();
		// Day(s),Month(s),Year(s)
		WebElement plan2 = driver.findElement(By.xpath("//*[text()='" + plan + "']"));
		plan2.click();
		String planName = plan2.getText();
		System.out.println("The level of difficulty is ..." + planName);

	}

	public void startDate() {
		driver.findElement(By.xpath("(//*[@class='ant-picker datePicker'])[1]")).click();
		// System.out.println("The level of difficulty is ...");
//2024-02-22
		String todayDate = PrintDateExample();
		driver.findElement(By.xpath("(//*[@title='" + todayDate + "'])[1]")).click();
		/*
		 * Today xpath (//*[@class='ant-picker-today-btn'])[1]
		 */

	}

	public void endDate() {
		driver.findElement(By.xpath("(//*[@class='ant-picker datePicker'])[2]")).click();

		driver.findElement(By.xpath("")).click();

	}

	public void enterRegistrationfee(String RegAmount) {
		driver.findElement(By.xpath("(//input[@placeholder='Enter amount'])[1]")).sendKeys(RegAmount);
		System.out.println("The registration amount:" + RegAmount);

	}

	public void enterTotalfee(String feeAmount) {
		driver.findElement(By.xpath("(//input[@placeholder='Enter amount'])[2]")).sendKeys(feeAmount);
		System.out.println("The total fee amount:" + feeAmount);

	}

	public void selectDiscount(String discount) {
		driver.findElement(By.xpath("//span[@title='Percentage']")).click();
		driver.findElement(By.xpath("(//*[text()='Percentage'])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter percent']")).sendKeys(discount);

		System.out.println("The total discount amount:" + discount);

	}

	public void youtubeLink() {
		driver.findElement(
				By.xpath("//*[@placeholder='Enter YouTube link Example: https://www.youtube.com/watch?v=RlUOoCMnd']"))
				.click();
		System.out.println("Copied youtube link:");

	}

	public String PrintDateExample() {
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Define the date format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		// Format the date using the defined format
		String formattedDate = currentDate.format(formatter);

		// Print the formatted date
		System.out.println("Formatted date: " + formattedDate);
		return formattedDate;
	}

}
