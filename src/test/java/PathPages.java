public class PathPages {

	private String url = "file:///D:\\Users\\ABHKRISH\\Desktop\\Cucumber-Selenium-POM-Demo/scr/main/webapp/LoanApplicationPage.html";
private String title = "Loan Application Page";
	
	
	public PathPages(String url, String title) {
	
		String webPageLocation = "file:///"+ System.getProperty("user.dir") + "/src/main/webapp/";
	this.url =webPageLocation + url;
	this.title = title;
}

	public void goTo() {
		
		Browser.goTo(url);
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

	
	
}
