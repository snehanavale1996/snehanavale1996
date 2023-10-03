package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SikuliEx {

	public static void main(String[] args) throws Throwable {
		

		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[name()='svg' and @class='gb_h']")).click();
		
		Screen src = new Screen();
		Pattern play = new Pattern("C:\\Users\\Sneha Navale\\eclipse-workspace\\SikuliTool\\Playicon.png");
		src.click(play);
	}

}
