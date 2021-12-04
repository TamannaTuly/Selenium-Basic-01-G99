package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test3_2findElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\doctor strange\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/ajax.html";

        driver.get(baseUrl);
        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("WebElement size :"+elements.size());

        for (int i=0;i<elements.size();i++){
            System.out.println("radio button : "+elements.get(i).getAttribute("value"));
        }


    }
}
