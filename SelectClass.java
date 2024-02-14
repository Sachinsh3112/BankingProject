package SomeScenarioScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main(String[] args) throws InterruptedException {
//Open The browser
	WebDriver driver=new ChromeDriver();
//Maximize the Browser
	driver.manage().window().maximize();
//Enter the URL
	driver.get("https://omayo.blogspot.com/");
//find the Element And Store it in a One Conatainer
	WebElement se = driver.findElement(By.id("multiselect1"));
//Create a Select Object and Pass The WebElement
	Select s=new Select(se);
//Select with Index,VisibleText
	Thread.sleep(2000);
	s.selectByIndex(0);
	Thread.sleep(2000);
	s.selectByVisibleText("Swift");
	Thread.sleep(2000);
	s.selectByIndex(3);
//print first Selected Option
	System.out.println(s.getFirstSelectedOption().getText());
//print allSelected Option
	List<WebElement> all = s.getAllSelectedOptions();
	for(WebElement wh:all) {
		String sa = wh.getText();
		System.out.println(sa);
	}
//deselected using index,VisibleText
	Thread.sleep(2000);
	s.deselectByIndex(0);
	Thread.sleep(2000);
	s.deselectByVisibleText("Swift");
	Thread.sleep(2000);
	s.deselectByIndex(3);
//Close The Browser
	driver.close();
}
}
