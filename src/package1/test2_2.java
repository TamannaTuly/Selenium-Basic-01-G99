package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\doctor strange\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://jsbin.com/usidix/1";
        String alertMsg = "";

        driver.get(baseUrl);
        driver.findElement(By.xpath("/html/body/input")).click();
        alertMsg = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(alertMsg);
        driver.close();

    }
}
