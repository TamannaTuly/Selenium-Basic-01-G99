package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2_0 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\doctor strange\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.facebook.com/";
        String tagName = "";
        String tagName2 = "";

        driver.get(baseUrl);

        tagName = driver.findElement(By.id("email")).getTagName();
        tagName2 = driver.findElement(By.id("pass")).getTagName();

        System.out.println(tagName);
        System.out.println(tagName2);
//        driver.close();
//        System.exit(0);
        driver.quit();


    }
}
