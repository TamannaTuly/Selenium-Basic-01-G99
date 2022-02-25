package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test02_handle_web_table {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\doctor strange\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl ="http://demo.guru99.com/test/write-xpath-table.html";
        driver.get(baseUrl);

        Thread.sleep(2000);

        String text = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td[1]")).getText();

        System.out.println(text);
        driver.quit();

    }
}
