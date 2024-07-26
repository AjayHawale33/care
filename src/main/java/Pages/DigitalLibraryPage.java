package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DigitalLibraryPage  extends Aulas_Base.BaseTest{
	@FindBy(xpath="(//span[@class='ant-menu-title-content'])[7]")
	WebElement ClickOnDigitalLibrary;
	@FindBy(xpath="//span[@class='anticon anticon-setting']")
	WebElement ClickOnManage;
	@FindBy(xpath="//div[@class='menuItems cursor-pointer']")
	WebElement UserDetails ;
	@FindBy(xpath="(//*[@class='ant-btn ant-btn-default'])[2]")
	WebElement Save;
	@FindBy(xpath="//div[@style='height: 40px; background-color: rgb(152, 118, 230); width: 9.98%;']")
	WebElement ClickOnPurple;
	@FindBy(xpath="//div[@style='height: 40px; background-color: rgb(255, 131, 208); width: 10.06%;']")
	WebElement ClickOnPink ;
	@FindBy(xpath="//div[@style='height: 40px; background-color: rgb(230, 230, 230); width: 79.96%;']")
	WebElement  ClickOnGray;
	@FindBy(xpath="//span[@class='ant-typography text-heading-library cursor-pointer']")
	WebElement ClickOnUpdatePlan;
	@FindBy(xpath="(//button[@class='ant-btn button-buy-storage'])[1]")
	WebElement ClickOnSubscribe;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-default']")
	WebElement ClickOnCancel ;
	@FindBy(xpath="(//button[@class='ant-btn button-buy-storage'])[1]")
	WebElement ClickOnSubscribes;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement ClickOnPay;
	//@FindBy(xpath="//*[@data-icon='close']")
	//WebElement ClickOnIntoMark ;
	@FindBy(xpath="//span[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement ClickOnIntoMarks ;
	@FindBy(xpath="(//button[@class='ant-btn button-buy-storage'])[8]")
	WebElement  ClickOnContackUs;
	@FindBy(xpath="//textarea[@placeholder='Type your question here...']")
	WebElement ClickOnTextBox ;
	@FindBy(xpath="//div[@style='margin-bottom: 10px; margin-top: 10px; margin-right: 10px;']")
	WebElement  ClickOnsendButton ;
	
	/************UPLOAD Lecture notes*****************/
	@FindBy(xpath="(//span[@class='ant-menu-title-content'])[7]")
	WebElement ClickOnDigitalLibrary1;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary btn-radius-15__height-38 m-l-20 text-xmd']")
	WebElement ClickOnUpload;
	@FindBy(xpath="(//input[@class='ant-radio-input'])[1]")
	WebElement ClickOnLectureNotes;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement ClickOnNext;
	@FindBy(xpath="//input[@class='ant-input ant-select-selection-search-input']")
	WebElement ClickSubject;
	@FindBy(xpath="(//div[@style='display: flex; justify-content: space-between;'])[5]")
	WebElement SelectSub;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[2]")
	WebElement ClickClass;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[11]")
	WebElement SelectClass;
	@FindBy(xpath="(//input[@class='ant-input ant-select-selection-search-input'])[2]")
	WebElement ClickChapter;
	@FindBy(xpath="(//div[@style='display: flex; justify-content: space-between;'])[11]")
	WebElement SelectChapter;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[3]")
	WebElement ClickTopic;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[31]")
	WebElement ClickOnCreate;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[3]")
	WebElement ClickOnTopic;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[27]")
	WebElement SelectTopic;
	@FindBy(xpath="//input[@class='ant-input ant-input-borderless']")
	WebElement ClickOnTitle;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-default'])[1]")
	WebElement ClickChooseFile;
	@FindBy(xpath="//*[text( )='PUBLISH']")
	WebElement Publish;
	@FindBy(xpath="//*[text( )='SEE IT NOW']")
	WebElement SeeIt;
	@FindBy(xpath="(//*[@class='cursor-pointer'])[1]")
	WebElement Edit;
	@FindBy(xpath="(//*[@class='cursor-pointer'])[2]")
	WebElement Clone;
	@FindBy(xpath="(//*[@class='cursor-pointer'])[3]")
	WebElement Delete;
	@FindBy(xpath="//*[text( )='YES']")
	WebElement Yes;
	@FindBy(xpath="//*[text( )='NO']")
	WebElement No;
	@FindBy(xpath="//*[@data-icon='arrow-left']")
	WebElement BackArrow;
	
	/************UPLOAD VIDEO NOTES*****************/
	@FindBy(xpath="(//span[@class='ant-menu-title-content'])[7]")
	WebElement ClickOnDigitalLibrary2;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary btn-radius-15__height-38 m-l-20 text-xmd']")
	WebElement ClickOnUpload1;
	@FindBy(xpath="(//input[@class='ant-radio-input'])[2]")
	WebElement ClickOnVideo;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement ClickOnNext1;
	@FindBy(xpath="//*[@class='ant-radio-input']")
	WebElement LocalVideo;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement ClickOnNext2;
	@FindBy(xpath="//input[@class='ant-input ant-select-selection-search-input']")
	WebElement ClickSubject1;
	@FindBy(xpath="(//div[@style='display: flex; justify-content: space-between;'])[5]")
	WebElement SelectSub1;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[2]")
	WebElement ClickClass1;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[11]")
	WebElement SelectClass1;
	@FindBy(xpath="(//input[@class='ant-input ant-select-selection-search-input'])[2]")
	WebElement ClickChapter1;
	@FindBy(xpath="(//div[@style='display: flex; justify-content: space-between;'])[11]")
	WebElement SelectChapter1;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[3]")
	WebElement ClickTopic1;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[31]")
	WebElement ClickOnCreate1;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[3]")
	WebElement ClickOnTopic1;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[27]")
	WebElement SelectTopic1;
	@FindBy(xpath="//input[@class='ant-input ant-input-borderless']")
	WebElement ClickOnTitle1;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-default'])[1]")
	WebElement ClickChooseFile1;
	@FindBy(xpath="//*[text( )='PUBLISH']")
	WebElement Publish1;
	@FindBys
	({
		@FindBy(xpath="//*[@class='anticon anticon-close ant-modal-close-icon']"),
		@FindBy(xpath="//*[@class='ant-modal-close-x']")
	})
	WebElement ClickOnIntoMarkVideo;
	
	/*-----------upload youtube link---------*/
	@FindBy(xpath="(//span[@class='ant-menu-title-content'])[7]")
	WebElement ClickOnDigitalLibrary3;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary btn-radius-15__height-38 m-l-20 text-xmd']")
	WebElement ClickOnUpload2;
	@FindBy(xpath="(//input[@class='ant-radio-input'])[2]")
	WebElement ClickOnVideoYouTube;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement ClickOnNextYouTube;
	@FindBy(xpath="(//*[@class='ant-radio-input'])[2]")
	WebElement YoutubeVideo;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement ClickOnNext3;
	//@FindBy(xpath="//*[@class='ant-input']")
	//WebElement YouTubeLink;
	//@FindBy(xpath="https://www.youtube.com/watch?v=APRVsl01AZI")
	//WebElement Link;
	@FindBy(xpath="//input[@class='ant-input ant-select-selection-search-input']")
	WebElement ClickSubject2;
	@FindBy(xpath="(//div[@style='display: flex; justify-content: space-between;'])[5]")
	WebElement SelectSub2;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[2]")
	WebElement ClickClass2;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[11]")
	WebElement SelectClass2;
	@FindBy(xpath="(//input[@class='ant-input ant-select-selection-search-input'])[2]")
	WebElement ClickChapter2;
	@FindBy(xpath="(//div[@style='display: flex; justify-content: space-between;'])[11]")
	WebElement SelectChapter2;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[3]")
	WebElement ClickTopic2;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[31]")
	WebElement ClickOnCreate2;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[3]")
	WebElement ClickOnTopic2;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[27]")
	WebElement SelectTopic2;
	@FindBy(xpath="//input[@class='ant-input ant-input-borderless']")
	WebElement ClickOnTitle2;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-default'])[1]")
	WebElement ClickChooseFile2;
	@FindBy(xpath="//*[text( )='PUBLISH']")
	WebElement Publish2;
	@FindBy(xpath="//*[text( )='SEE IT NOW']")
	WebElement YouTubeSeeIt;
	@FindBy(xpath="(//*[@class='cursor-pointer'])[1]")
	WebElement YouTubeEdit;
	@FindBy(xpath="(//*[@class='cursor-pointer'])[2]")
	WebElement YouTubeClone;
	@FindBy(xpath="(//*[@class='cursor-pointer'])[3]")
	WebElement YouTubeDelete;
	@FindBy(xpath="//*[text( )='YES']")
	WebElement YouTubeYes;
	@FindBy(xpath="//*[text( )='NO']")
	WebElement YouTubeNo;
	
	/*-----------------Document Notes------------------*/
	@FindBy(xpath="(//span[@class='ant-menu-title-content'])[7]")
	WebElement ClickOnDigitalLibrary4;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary btn-radius-15__height-38 m-l-20 text-xmd']")
	WebElement ClickOnUpload3;
	@FindBy(xpath="(//input[@class='ant-radio-input'])[3]")
	WebElement ClickOnDocument;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement ClickOnNextQ1;
	@FindBy(xpath="//input[@class='ant-input ant-select-selection-search-input']")
	WebElement ClickSubjectQ;
	@FindBy(xpath="(//div[@style='display: flex; justify-content: space-between;'])[5]")
	WebElement SelectSubQ;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[2]")
	WebElement ClickClassQ;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[11]")
	WebElement SelectClassQ;
	@FindBy(xpath="(//input[@class='ant-input ant-select-selection-search-input'])[2]")
	WebElement ClickChapterQ;
	@FindBy(xpath="(//div[@style='display: flex; justify-content: space-between;'])[11]")
	WebElement SelectChapterQ;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[3]")
	WebElement ClickTopicQ;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[31]")
	WebElement ClickOnCreateQ;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[3]")
	WebElement ClickOnTopicQ;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[27]")
	WebElement SelectTopicQ;
	@FindBy(xpath="//input[@class='ant-input ant-input-borderless']")
	WebElement ClickOnTitleQ;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-default'])[1]")
	WebElement ClickChooseFileQ;
	@FindBy(xpath="//*[text( )='PUBLISH']")
	WebElement PublishQ;
	@FindBy(xpath="//*[text( )='SEE IT NOW']")
	WebElement SeeItQ;
	@FindBy(xpath="(//*[@class='cursor-pointer'])[1]")
	WebElement EditQ;
	@FindBy(xpath="(//*[@class='cursor-pointer'])[2]")
	WebElement CloneQ;
	@FindBy(xpath="(//*[@class='cursor-pointer'])[3]")
	WebElement DeleteQ;
	@FindBy(xpath="//*[text( )='YES']")
	WebElement YesQ;
	@FindBy(xpath="//*[text( )='NO']")
	WebElement NoQ;
	
	/*-----------All Classes--------------*/
	@FindBy(xpath="(//span[@class='ant-menu-title-content'])[7]")
	WebElement ClickOnDigitalLibrary5;
	@FindBy(xpath="(//*[@class='firstdivdivision'])[7]")
	WebElement AllClass;
	@FindBy(xpath="//*[@class='ant-select ant-select-borderless inputSelecter ant-select-single ant-select-show-arrow']")
	WebElement SelectFilter;
	@FindBy(xpath="(//*[@class='ant-select-item-option-content'])[1]")
	WebElement week;
	@FindBy(xpath="//*[@class='calenderIcon']")
	WebElement Calendar;
	@FindBy(xpath="(//*[@class='ant-picker-cell-inner'])[29]")
	WebElement StartDate;
	@FindBy(xpath="(//*[@class='ant-picker-cell-inner'])[35]")
	WebElement EndDate;
	@FindBy(xpath="//*[text( )='OK']")
	WebElement ok;
	@FindBy(xpath="(//*[@class='ant-select-item-option-content'])[2]")
	WebElement Month;
	@FindBy(xpath="//*[@class='ant-select ant-select-single ant-select-show-arrow']")
	WebElement Filter;
	@FindBy(xpath="(//*[@class='all-comp'])[2]")
	WebElement Class;
	@FindBy(xpath="(//*[@focusable='false'])[3]")
	WebElement AddTeacher;
	@FindBy(xpath="//*[@class='ant-select ant-select-single ant-select-show-arrow ant-select-show-search']")
	WebElement ViewAccess;
	@FindBy(xpath="//*[text( )=' VAnzyosURq']")
	WebElement SelectTeacher;
	@FindBy(xpath="//*[text( )='Submit']")
	WebElement Submit;
	@FindBy(xpath="(//*[@class='anticon anticon-close'])[4]")
	WebElement TeacherClose;
	@FindBy(xpath="(//*[@class='digital-library-chapter-card cursor-pointer'])[1]")
	WebElement Chapter; 
	@FindBy(xpath="//*[text( )=' + Create a topic']")
	WebElement CreateTopic;
	@FindBy(xpath="(//*[@class='ant-input'])[2]")
	WebElement EnterTopic;
	@FindBy(xpath="//*[text( )='Create']")
	WebElement Create;
	@FindBy(xpath="(//*[@class='ant-dropdown-trigger'])[2]")
	WebElement Threedots;
	@FindBy(xpath="(//*[@class='ant-dropdown-menu-title-content'])[1]")
	WebElement TopicEdit;
	@FindBy(xpath="//*[text( )='Save']")
	WebElement TopicSave;
	@FindBy(xpath="(//*[@class='ant-dropdown-menu-title-content'])[2]")
	WebElement TopicDelete;
	@FindBy(xpath="//*[text( )='YES']")
	WebElement TopicYes;
	
	
	
	public DigitalLibraryPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void GetStorage() throws InterruptedException
	{
		Thread.sleep(2000);
		ClickOnDigitalLibrary.click();
		Thread.sleep(2000);
		ClickOnManage.click();
		Thread.sleep(2000);
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='menuItems cursor-pointer']"));
		int elesize=ele.size();
		for(int i=0;i<elesize;i++)
		{
			Thread.sleep(2000);
			ele.get(i).click();
		}
		UserDetails.click();
		WaitTil(2000);
		Save.click();
		WaitTil(2000);
		Thread.sleep(2000);
		ClickOnDigitalLibrary.click();
		Thread.sleep(2000);
		/*ClickOnPurple.click();
		Thread.sleep(2000);
		ClickOnPink.click();
		Thread.sleep(2000);
		ClickOnGray.click();
		Thread.sleep(2000);
		ClickOnUpdatePlan.click();
		Thread.sleep(2000);
		ClickOnSubscribe.click();
		Thread.sleep(2000);
		ClickOnCancel.click();
		Thread.sleep(2000);
		ClickOnSubscribes.click();
		Thread.sleep(2000);
		ClickOnPay.click();
		Thread.sleep(2000);
		ClickOnIntoMark.click();
		Thread.sleep(2000);
		ClickOnIntoMarks.click();
		Thread.sleep(2000);
		ClickOnContackUs.click();
		Thread.sleep(2000);
		ClickOnTextBox.sendKeys("Hi");
		Thread.sleep(2000);
		ClickOnsendButton.click();*/
		}
	
	public void LectureNotes() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		ClickOnDigitalLibrary.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ClickOnDigitalLibrary1.click();
		Thread.sleep(2000);
		ClickOnUpload.click();
		Thread.sleep(2000);
		ClickOnLectureNotes.click();
		Thread.sleep(2000);
		ClickOnNext.click();
		Thread.sleep(2000);
		ClickSubject.click();
		Thread.sleep(2000);
		SelectSub.click();
		Thread.sleep(2000);
		ClickClass.click();
		Thread.sleep(2000);
		SelectClass.click();
		Thread.sleep(2000);
		ClickChapter.click();
		Thread.sleep(2000);
		SelectChapter.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ClickOnTopic.click();
		Thread.sleep(2000);
		SelectTopic.click();
		Thread.sleep(2000);
		ClickOnTitle.sendKeys("video");
		Thread.sleep(2000);
		//WebElement tops=driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default'])[1]"));
		//tops.click();
		//Thread.sleep(6000);
		
		//tops.sendKeys("C:\\Users\\Brigosha_Guest\\file\\user.pdf");*/
		 // File Location
		StringSelection select = new StringSelection("C:\\Users\\Prabhakar\\Downloads\\Transaction.pdf");
		// Copy to clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		WebElement upload = driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default'])[1]"));
		upload.click();
		Thread.sleep(6000);
		// Create object of Robot class
        Robot robot = new Robot();
        Thread.sleep(1000);

        // Press CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        // Wait
        Thread.sleep(1000);

        // Release CTRL+V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        // Wait
        Thread.sleep(1000);
     // Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		//driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[2]")).click();
		//Thread.sleep(4000);
		
	System.out.println("---successfull upload---");
	
	Publish.click();
	System.out.println("-----sucessfully published----");
	WaitTil(2000);
	SeeIt.click();
	WaitTil(2000);
	Edit.click();
	WaitTil(2000);
	Publish.click();
	WaitTil(4000);
	Clone.click();
	WaitTil(3000);
	Publish.click();
	WaitTil(4000);
	Delete.click();
	WaitTil(2000);
	No.click();
	WaitTil(2000);
	Delete.click();
	WaitTil(2000);
	Yes.click();
	WaitTil(2000);
	//BackArrow.click();
	//WaitTil(2000);

	}
	
	public void ClickOnVideo() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		ClickOnDigitalLibrary.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ClickOnDigitalLibrary2.click();
		Thread.sleep(2000);
		ClickOnUpload.click();
		Thread.sleep(2000);
		ClickOnVideo.click();
		Thread.sleep(2000);
		ClickOnNext1.click();
		Thread.sleep(2000);
		LocalVideo.click();
		Thread.sleep(2000);
		ClickOnNext2.click();
		Thread.sleep(2000);
		ClickSubject1.click();
		Thread.sleep(2000);
		SelectSub1.click();
		Thread.sleep(2000);
		ClickClass1.click();
		Thread.sleep(2000);
		SelectClass1.click();
		Thread.sleep(2000);
		ClickChapter1.click();
		Thread.sleep(2000);
		SelectChapter1.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ClickOnTopic1.click();
		Thread.sleep(2000);
		SelectTopic1.click();
		Thread.sleep(2000);
		ClickOnTitle1.sendKeys("video");
		Thread.sleep(2000);
		//WebElement tops=driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default'])[1]"));
		//tops.click();
		//Thread.sleep(6000);
		
		//tops.sendKeys("C:\\Users\\Brigosha_Guest\\file\\user.pdf");*/
		 // File Location
		StringSelection select = new StringSelection("C:\\Users\\Prabhakar\\Downloads\\VediosUplaod.mp4");
		// Copy to clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		WebElement upload = driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default'])[1]"));
		upload.click();
		Thread.sleep(6000);
		// Create object of Robot class
        Robot robot = new Robot();
        Thread.sleep(1000);

        // Press CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        // Wait
        Thread.sleep(1000);

        // Release CTRL+V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        // Wait
        Thread.sleep(1000);
     // Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		//driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[2]")).click();
		//Thread.sleep(4000);
		
	System.out.println("---successfull upload---");
	
	Publish.click();
	System.out.println("-----sucessfully published----");
	WaitTil(3000);
	ClickOnIntoMarkVideo.click();
	WaitTil(2000);
	

	}
	
	public void ClickOnYouTubeVideo() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		ClickOnDigitalLibrary.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ClickOnDigitalLibrary3.click();
		Thread.sleep(2000);
		ClickOnUpload2.click();
		Thread.sleep(2000);
		ClickOnVideoYouTube.click();
		Thread.sleep(2000);
		ClickOnNextYouTube.click();
		Thread.sleep(2000);
		YoutubeVideo.click();
		Thread.sleep(2000);
		ClickOnNext3.click();
		Thread.sleep(2000);
		ClickSubject2.click();
		Thread.sleep(2000);
		SelectSub2.click();
		Thread.sleep(2000);
		ClickClass2.click();
		Thread.sleep(2000);
		SelectClass2.click();
		Thread.sleep(2000);
		ClickChapter2.click();
		Thread.sleep(2000);
		SelectChapter2.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ClickOnTopic2.click();
		Thread.sleep(2000);
		SelectTopic2.click();
		Thread.sleep(2000);
		ClickOnTitle2.sendKeys("video");
		Thread.sleep(2000);
		//WebElement tops=driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default'])[1]"));
		//tops.click();
		//Thread.sleep(6000);
		
		//tops.sendKeys("C:\\Users\\Brigosha_Guest\\file\\user.pdf");*/
		 // File Location
		StringSelection select = new StringSelection("https://www.youtube.com/watch?v=APRVsl01AZI");
		// Copy to clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		WebElement upload = driver.findElement(By.xpath("//*[@class='ant-input']"));
		upload.click();
		Thread.sleep(6000);
		// Create object of Robot class
        Robot robot = new Robot();
        Thread.sleep(1000);

        // Press CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        // Wait
        Thread.sleep(1000);

        // Release CTRL+V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        // Wait
        Thread.sleep(1000);
     // Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		//driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[2]")).click();
		//Thread.sleep(4000);
		
	System.out.println("---successfull upload---");
	
	Publish.click();
	System.out.println("-----sucessfully published----");
	WaitTil(3000);
	YouTubeSeeIt.click();
	WaitTil(2000);
	YouTubeEdit.click();
	WaitTil(2000);
	Publish2.click();
	WaitTil(4000);
	YouTubeClone.click();
	WaitTil(3000);
	Publish2.click();
	WaitTil(4000);
	YouTubeDelete.click();
	WaitTil(2000);
	YouTubeNo.click();
	WaitTil(2000);
	YouTubeDelete.click();
	WaitTil(2000);
	YouTubeYes.click();
	WaitTil(2000);
	

	}

	public void DocumentNotes() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		ClickOnDigitalLibrary.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ClickOnDigitalLibrary4.click();
		Thread.sleep(2000);
		ClickOnUpload3.click();
		Thread.sleep(2000);
		ClickOnDocument.click();
		Thread.sleep(2000);
		ClickOnNextQ1.click();
		Thread.sleep(2000);
		ClickSubjectQ.click();
		Thread.sleep(2000);
		SelectSubQ.click();
		Thread.sleep(2000);
		ClickClassQ.click();
		Thread.sleep(2000);
		SelectClassQ.click();
		Thread.sleep(2000);
		ClickChapterQ.click();
		Thread.sleep(2000);
		SelectChapterQ.click();
		Thread.sleep(2000);
		ClickOnTopicQ.click();
		Thread.sleep(2000);
		SelectTopicQ.click();
		Thread.sleep(2000);
		ClickOnTitleQ.sendKeys("video");
		Thread.sleep(2000);
		//WebElement tops=driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default'])[1]"));
		//tops.click();
		//Thread.sleep(6000);
		
		//tops.sendKeys("C:\\Users\\Brigosha_Guest\\file\\user.pdf");*/
		 // File Location
		StringSelection select = new StringSelection("C:\\Users\\Prabhakar\\Downloads\\Transaction.pdf");
		// Copy to clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		WebElement upload = driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default'])[1]"));
		upload.click();
		Thread.sleep(6000);
		// Create object of Robot class
        Robot robot = new Robot();
        Thread.sleep(1000);

        // Press CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        // Wait
        Thread.sleep(1000);

        // Release CTRL+V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        // Wait
        Thread.sleep(1000);
     // Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		//driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[2]")).click();
		//Thread.sleep(4000);
		
	System.out.println("---successfull upload---");
	
	PublishQ.click();
	System.out.println("-----sucessfully published----");
	WaitTil(2000);
	SeeItQ.click();
	WaitTil(2000);
	EditQ.click();
	WaitTil(2000);
	PublishQ.click();
	WaitTil(4000);
	CloneQ.click();
	WaitTil(3000);
	PublishQ.click();
	WaitTil(4000);
	DeleteQ.click();
	WaitTil(2000);
	NoQ.click();
	WaitTil(2000);
	DeleteQ.click();
	WaitTil(2000);
	YesQ.click();
	WaitTil(2000);
	//BackArrow.click();
	//WaitTil(2000);

	}

	public void AllClasses() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		ClickOnDigitalLibrary.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ClickOnDigitalLibrary5.click();
		Thread.sleep(2000);
		AllClass.click();
		Thread.sleep(2000);
		SelectFilter.click();
		Thread.sleep(2000);
		week.click();
		Thread.sleep(2000);
		Calendar.click();
		Thread.sleep(2000);
	    SelectFilter.click();
		Thread.sleep(2000);
	    Month.click();
	    Thread.sleep(2000);
	    Class.click();
	    Thread.sleep(2000);
		AddTeacher.click();
		Thread.sleep(2000);
		ViewAccess.click();
		Thread.sleep(2000);
		SelectTeacher.click();
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		AddTeacher.click();
		Thread.sleep(2000);
		TeacherClose.click();
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(2000);
		Chapter.click();
		Thread.sleep(3000);
		CreateTopic.click();
		Thread.sleep(3000);
		EnterTopic.sendKeys("qwerty");
		Thread.sleep(2000);
		Create.click();
		Thread.sleep(2000);
		Threedots.click();
		Thread.sleep(2000);
		TopicEdit.click();
		Thread.sleep(2000);
		TopicSave.click();
		Thread.sleep(2000);
		Threedots.click();
		Thread.sleep(2000);
		TopicDelete.click();
		Thread.sleep(2000);
		TopicYes.click();
		Thread.sleep(20000);
	}
	
	
}
