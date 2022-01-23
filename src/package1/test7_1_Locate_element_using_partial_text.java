package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test7_1_Locate_element_using_partial_text {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\doctor strange\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseURL = "http://demo.guru99.com/test/link.html";

        driver.get(baseURL);
        driver.findElement(By.partialLinkText("here")).click();
        System.out.println("Title is : "+ driver.getTitle());
        driver.quit();
    }
}
