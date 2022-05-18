package org.stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.DateUtil;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {
	 public static WebDriver driver;
	
		public static  void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();	
	}

	public static WebElement findelemnetId(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	public WebElement xpathm(String path) {
		WebElement findElement = driver.findElement(By.xpath(path));
		return findElement;
	}
	public WebElement name(String name) {
		
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
	}
public WebElement className(String name) {
		
		WebElement findElement = driver.findElement(By.className(name));
		return findElement;
	}
	
	public void sendvalues(WebElement element,String data)
	{
		element.sendKeys(data);
	}
	public void button(WebElement element) {
		//WebElement findElement = driver.findElement(By.id(id));
		element.click();	
	}
	public void printtext(WebElement f) {
		//WebElement findElement = driver.findElement(By.id(text1));
		String text = f.getText();
		System.out.println(text);
	}
	 public String printattribute(WebElement element) {
		 //WebElement findElement = driver.findElement(By.id(id));
		 String att=element.getAttribute("value");
			return att;
	}
	 public void mousemethod(WebElement target) {
		 Actions act=new Actions(driver);
		 act.moveToElement(target).perform();
			}
	 public void drag(WebElement source,WebElement target) {
		 Actions act=new Actions(driver);
		 act.dragAndDrop(source, target).perform();;
			}
	 public void rightClick(WebElement target) {
		 Actions act=new Actions(driver);
		act.contextClick(target).perform();
	}
	 public void doubleclick(WebElement target) {
		// Robot r= new Robot();
		 Actions act=new Actions(driver);
		act.doubleClick(target).perform();
			}
	 public void alertok() {
		 Alert a=driver.switchTo().alert();
		 a.accept(); 
			}
	 public void alertcancel() {
		 Alert a=driver.switchTo().alert();
		 a.dismiss();
		 String name;
	 }
		public void alertok(String name)
		 {
			 Alert a1=driver.switchTo().alert();
			 a1.sendKeys(name);
			 a1.accept(); 
				}
		public void navi(String element) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.navigate().to(element);
		}
		public void navifor() {
			driver.navigate().forward();
		}
		public void navback() {
			driver.navigate().back();
			
					}
		public void navrefresh() {
			driver.navigate().refresh();
		}
		public void keyboard(WebElement element,int input) throws AWTException {
			Robot r= new Robot();
			r.keyPress(input);
			r.keyRelease(input);

		}
		public void keyboardact(String value,Keys a) {
			Actions act=new Actions(driver);
			act.keyDown(a).sendKeys(value).keyUp(a);

		}
		 
	
	 
	public void javascriptset(String e,String name) {
		
		JavascriptExecutor execute=(JavascriptExecutor)driver;
		WebElement txtuser =driver.findElement(By.id(e));
		execute.executeScript("arguments[0].setAttribute('value',name)", txtuser);
		Object name1=execute.executeScript("return arguments[0].getAttribute('value')",txtuser);
		//System.out.println(name);
				
	}
	public void javascriptclick() {
		JavascriptExecutor execute=(JavascriptExecutor)driver;
		WebElement btnLogin=driver.findElement(By.name("login"));
		execute.executeScript("arguments[0].click()",btnLogin);
		
	}
	public void javascriptget(WebElement txtuser) {
		
		JavascriptExecutor execute=(JavascriptExecutor)driver;
		Object name1=execute.executeScript("return arguments[0].getAttribute('value')",txtuser);
	}
	public void screenshot(String path) throws IOException {
		TakesScreenshot sc=(TakesScreenshot)driver;
		File s=sc.getScreenshotAs(OutputType.FILE);
		File d=new File(path);
		FileUtils.copyFile(s, d);
	}
	public void scrolldown(WebElement txtd) {
		JavascriptExecutor execute=(JavascriptExecutor)driver;
		execute.executeScript("arguments[0].scrollIntoview(true)", txtd);
	}
	public void scrollUP(WebElement txtup) {
		JavascriptExecutor execute=(JavascriptExecutor)driver;
		execute.executeScript("arguments[0].scrollIntoview(false)", txtup);
	}
	
	public void getoptions(WebElement dnskills) {
		Select select=new Select(dnskills);
		List<WebElement>l=select.getOptions();
for(int i=0;i<l.size();i++)
{
	WebElement e=l.get(i);String txt=e.getText();
	System.out.println(txt);
}
	}
	
public void getoptionsatt(WebElement dnskills) {
	Select select =new Select(dnskills);
	List<WebElement>l=select.getOptions();
	for (WebElement element : l) {
		String name = element.getAttribute("value");
		System.out.println(name);
	}
		}
public void selsectalloptions(WebElement dnskills) {
	Select select =new Select(dnskills);
	List<WebElement>l=select.getOptions();
	for(int i=0;i<l.size();i++)
	{
		WebElement e=l.get(i);
		String txt=e.getText();
		select.selectByVisibleText(txt);
			}
}

public void selectalloptionsatt(WebElement dnskills) {
	Select select =new Select(dnskills);
	List<WebElement>l=select.getOptions();
	for (WebElement webElement : l) {
		String txt=webElement.getAttribute("value");
		select.selectByValue(txt);
			}
	}
public void printallselectedoption(WebElement dnskills) {
		Select select =new Select(dnskills);
	List<WebElement>l=select.getOptions();
	for (WebElement webElement : l) {
		String txt=webElement.getAttribute("value");
		System.out.println(txt);
}
	}
public void printfirstselectedoption(WebElement dnskills) {
	Select select =new Select(dnskills);
	WebElement dnskills1=select.getFirstSelectedOption();
	String txt=dnskills1.getText();
	System.out.println(txt);

}
public void deselectionbyindex(List l,WebElement dnskills) {
	Select select=new Select(dnskills);
	for(int i=0;i<l.size();i++)
	{
		select.deselectByIndex(i);
	}
	
}
public void selectionbyindex(WebElement dnskills) {
	Select select=new Select(dnskills);
	List<WebElement>l=select.getOptions();
	for(int i=0;i<l.size();i++)
	{
		select.selectByIndex(i);
	}
	
}
public void deselectionbyvalue(WebElement dnskills,List<WebElement> l1) {
	Select select=new Select(dnskills);
	for (WebElement webElement : l1) {
		String txt=webElement.getAttribute("value");
		select.deselectByValue(txt);
			}
}
public void deselectionbytext(WebElement dnskills,List<WebElement> l1) {
	Select select=new Select(dnskills);
	for (WebElement webElement : l1) {
		String txt=webElement.getText();
		select.deselectByVisibleText(txt);
			}	
	}
 public void frameswitching(WebElement element,String id) {
	 driver.switchTo().frame(element);
}
 public int framecount(String id) {
	List<WebElement>elements=driver.findElements(By.tagName(id));
int size=elements.size();
return size;
}
 public void windowsswitch() {
	Set<String>allwindow=driver.getWindowHandles();
	List<String>windowlist=new ArrayList();
	windowlist.addAll(allwindow);
	String childwindow=windowlist.get(1);
	driver.switchTo().window(childwindow);
}
 public void webtable(String xpathExp) {
	WebElement table=driver.findElement(By.xpath(xpathExp));
	List<WebElement>tablerow=table.findElements(By.tagName("tr"));
	List<WebElement>cell=table.findElements(By.tagName("td"));
	for(int i=0;i<tablerow.size();i++)
	{
		String text=tablerow.get(i).getText();
		System.out.println(text);
		for(int j=0;j<cell.size();j++)
		{
			String text1=tablerow.get(j).getText();
			System.out.println(text1);
		}
	}
	}
}
// public String getdataFromExcel(String pathname,String Sheetname,int rowno,int cellno) throws IOException {
//	String data=null;
//	File file=new File(pathname);
//	FileInputStream stream=new FileInputStream(file);
//	XSSFWorkbook wk=new XSSFWorkbook(stream);
//	Sheet sheet =wk.getSheet(Sheetname);
//	Row row = sheet.getRow(rowno);
//	Cell cell = row.getCell(cellno);
//	CellType cellType=cell.getCellType();
//	if(cellType==CellType.STRING)
//	{
//		data=cell.getStringCellValue();
//	}
//if(cellType==CellType.NUMERIC)
//{
//	if(DateUtil.isCellDateFormatted(cell))
//	{
//		Date datacellvalue=cell.getDateCellValue();
//		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MMM-YYYY");
//		data=dateformat.format(datacellvalue);
//	}
//	else
//	{
//		double d = cell.getNumericCellValue();
//		long l=(long) d;
//		data=String.valueOf(l);
//			}
//	}
//return data;
//}
//}
//
