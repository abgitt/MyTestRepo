import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) throws IOException,InvalidFormatException {
		fExcelReader();
		/*System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://www.apsrtconline.in/oprs-web/");
		dr.findElement(By.id("fromPlaceName")).sendKeys("NELLORE");
		/*List<String> cityNames = new ArrayList<String>();
		cityNames.add(dr.findElements(By.id("ui-id-1")).toString());
		System.out.println(cityNames.get(0));
		
		WebElement countryUL= dr.findElement(By.id("ui-id-1"));
		System.out.println(countryUL.getText());
		List<WebElement> countriesList=countryUL.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		System.out.println(countriesList.size());
		for (WebElement li : countriesList) {
		if (li.getText().equals("India (+91")) {
		     li.click();
		   }
		}*/
	}
	
	public static void fExcelReader() throws IOException,InvalidFormatException 
	{
		 FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\ABI\\Documents\\Book1.xls"));
		 Workbook workbook;
		 workbook = new XSSFWorkbook(inputStream);
		 /*Sheet sh = workbook.getSheetAt(0); 
		 System.out.println(sh.getRow(0).getPhysicalNumberOfCells());*/
	}

}
