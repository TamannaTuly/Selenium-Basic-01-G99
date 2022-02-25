package package2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test01_Alert_Popup_Window_Handling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\doctor strange\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseURL = "http://demo.guru99.com/test/delete_customer.php";

        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.findElement(By.name("cusid")).sendKeys("15450");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(1500);
        Alert alert = driver.switchTo().alert();

        String alertMessage = alert.getText();

        System.out.println(alertMessage);

        Thread.sleep(1500);
        alert.accept();

//        Alert alertscs = driver.switchTo().alert();//no need to initialize another alert
        String alersMsg = alert.getText();
        System.out.println(alersMsg);
        Thread.sleep(3000);
        alert.accept();
        driver.quit();
    }
}
