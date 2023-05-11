package pageObjects;

import org.openqa.selenium.By;

public class RecrumentPage {
	public By btnAdd = By.xpath("//*[@class='orangehrm-header-container']//button");
	public By txtFirstName = By.xpath("//*[@placeholder='First Name']");
	public By txtMidleName = By.xpath("//*[@placeholder='Middle Name']");
	public By txtLastName = By.xpath("//*[@placeholder='Last Name']");
	public By ddVacency = By.xpath("//*[@class='oxd-select-wrapper']");
	public By txtEmail = By.xpath("//*[contains(text(),'Email')]/../..//input");
	public By btnSave = By.xpath("//*[@type='submit']");
	
	
	

}
