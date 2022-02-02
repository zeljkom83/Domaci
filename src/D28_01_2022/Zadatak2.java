package D28_01_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;



public class Zadatak2 {

	public static void main(String[] args) {
//		Napisati program koji vrsi dodavanje 5 reda u tabelu. 
//		Maksimizirati prozor
//		Ucitati stranicu https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php
//		Dodati red podataka - jedan red u jednoj iteraciji 
//		Kliknite na dugme Add New
//		Unesite name,departmant i phone (mogu da budu uvek iste vrednost)
//		Kliknite na zeleno Add dugme
//		Na kraju programa ugasite pretrazivac.


		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");

		for(int i=0; i<100; i++) {
			
		driver.findElement(By.xpath("//*[contains(@class,'btn')]")).click();
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Zeljko");
		driver.findElement(By.xpath("//*[@id='department']")).sendKeys("QA");
		driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("0653389440");
		driver.findElement(By.xpath("//a[@class='add'][contains(@style,'inline')]")).click();


		}

		driver.close();
		
	}

}
