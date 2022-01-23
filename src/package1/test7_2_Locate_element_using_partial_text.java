package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test7_2_Locate_element_using_partial_text {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\doctor strange\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseURL = "https://demo.guru99.com/test/block.html";
        driver.get(baseURL);
        driver.findElement(By.partialLinkText("Inside")).click();
        System.out.println("Inside URL is : "+ driver.getTitle());
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Outside")).click();
        Thread.sleep(3000);
        System.out.println("Outside URL is : "+ driver.getTitle());
        driver.quit();
    }
}
