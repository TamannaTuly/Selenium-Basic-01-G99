package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test9_Upload_Download_File {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\doctor strange\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseURL = "http://demo.guru99.com/test/upload/";

        driver.get(baseURL);

        Thread.sleep(1000);
        driver.findElement(By.name("uploadfile_0")).sendKeys("E:\\Screenshot_20200416-191621.png");
        Thread.sleep(1000);
        driver.findElement(By.id("terms")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("submitbutton")).click();
        Thread.sleep(1000);
        driver.close();


    }
}
