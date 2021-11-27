package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\doctor strange\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl="http://demo.guru99.com/selenium/deprecated.html";

        driver.get(baseUrl);
        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("/html/body/div[4]/ul/li[5]/a")).click();
        driver.close();
    }
}
