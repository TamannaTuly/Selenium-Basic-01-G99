package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test02_01_nested_tables {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\doctor strange\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/accessing-nested-table.html";

        driver.get(baseUrl);
        Thread.sleep(2000);

        String innetext = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]")).getText();
        System.out.println(innetext);

        driver.quit();



    }
}
