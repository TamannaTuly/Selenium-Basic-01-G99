package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class test4_1ImageClicks {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\doctor strange\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0";
        String expectedUrl = "https://www.facebook.com/";

        driver.get(baseUrl);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#content > div > div._9ol3 > div > div:nth-child(1) > div > div.j83agx80.i1fnvgqd.k4urcfbm.n7fi1qx3.j9ispegn.kr520xx4.pmk7jnqg.ehxjyohh > div.l9j0dhe7.buofh1pr.j83agx80.bp9cbjyn")).click();//to capture selector, go to the baseURL and press ctrl+shift+I and then select the element and then copy the selector option
        Thread.sleep(3000);
        String actualUrl= driver.getCurrentUrl();
        if(actualUrl.equals(expectedUrl)){
            System.out.println("Congratulations You are on Facebook page");
        }
        else {
            driver.getTitle();
            System.out.println("Try again");
        }
        driver.close();
    }
}
