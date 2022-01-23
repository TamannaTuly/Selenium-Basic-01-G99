package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class test8_1_Building_Series_Multiple_Actions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\doctor strange\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseURL = "http://www.facebook.com/";

        driver.get(baseURL);
        WebElement txtUsername = driver.findElement(By.id("email"));

        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(txtUsername)
                .click()
                .keyDown(txtUsername, Keys.SHIFT)
                .sendKeys(txtUsername, "hello")
                .keyUp(txtUsername, Keys.SHIFT)
                .doubleClick(txtUsername)
                .contextClick().sendKeys("ctrl+c")
                .build();

        seriesOfActions.perform() ;
    }
}
