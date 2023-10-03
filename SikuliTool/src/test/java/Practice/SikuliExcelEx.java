package Practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SikuliExcelEx {
	
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		Screen scr = new Screen();
		Pattern miniBar = new Pattern("C:\\Users\\Sneha Navale\\eclipse-workspace\\SikuliTool\\miniBar.png");
		scr.click(miniBar);
		
		Pattern search = new Pattern("C:\\Users\\Sneha Navale\\eclipse-workspace\\SikuliTool\\scarchBar.png");
		scr.type(search, "Excel");
		
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		Pattern ExcelSheet = new Pattern("C:\\Users\\Sneha Navale\\eclipse-workspace\\SikuliTool\\ExcelSheet1.png");
		scr.click(ExcelSheet);
		
		Pattern cell = new Pattern("C:\\Users\\Sneha Navale\\eclipse-workspace\\SikuliTool\\Cell.png");
		scr.type(cell, "Sneha");
}
}