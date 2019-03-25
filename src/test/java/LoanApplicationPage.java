import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoanApplicationPage extends PathPages{

	private static String page= "LoanApplicationPage.html";
	private static String title = "Loan Application Page";
	
	public LoanApplicationPage() {
		super(page , title);
		PageFactory.initElements(Browser.driver, this);
	}
	
	@FindBy(how=How.ID,id="firstName")
	private WebElement firstName;
	
	@FindBy(how=How.ID,id="lastName")
	private WebElement lastName;

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);;
	}
	
	public String getFirstName() {
		return firstName.getText();
	}
	
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);;
	}
	
	public String getLastName() {
		return lastName.getText();
	}
	
	public void AcceptTermsAndConditions() {
//		Browser.driver.FindElement(By.ByTagName("TermsAcceptance")).Click();
		Browser.driver.findElement(By.name("TermsAcceptance")).click();
		
	}

	public void SubmitApplication() {
		Browser.driver.findElement(By.cssSelector(".btn.btn-primary")).click();
	}

}
