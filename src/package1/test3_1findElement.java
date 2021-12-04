package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3_1findElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\doctor strange\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();

//        Thread.sleep(Long.parseLong("3000"));

        String baseUrl="http://demo.guru99.com/test/ajax.html";

        driver.get(baseUrl);
        Thread.sleep(Long.parseLong("3000"));
        System.out.println("url triggered");
        driver.findElement(By.id("no")).click();//radio button NO
        System.out.println("id pressed");
        Thread.sleep(Long.parseLong("3000"));
        driver.findElement(By.xpath("/html/body/div[2]/form/p[2]/input[1]")).click();
        System.out.println("reset pressed");
    }
}

