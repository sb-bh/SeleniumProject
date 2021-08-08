package mavenPckg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenPrg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icicidirect.com/equity/stockpricequote/nse/icici-securities/12466");
		

		WebElement tableElement = driver.findElement(By.id("profitLoss"));
		List<WebElement> allrow = tableElement.findElements(By.tagName("tr"));
		int rowsize = allrow.size();
		System.out.println("Row :"+rowsize);
	
		for (int i=0; i<allrow.size(); i++)
		{
					
			List<WebElement> allcol = allrow.get(i).findElements(By.tagName("td"));
			int columnSize = allrow.size();
			System.out.println("Column :"+columnSize);
		
			
			for (int j=0; j<allcol.size(); j++)
			{
				String data = allcol.get(j).getText();
				System.out.println(data);
				
				
				
			}
			

	}

}
}
