package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class test8_Mouse_Click_Keyboard_Event_Action_Class {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\doctor strange\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseURL ="http://demo.guru99.com/test/newtours/";

        driver.get(baseURL);
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver
                .findElement(By
                        .xpath("//html/body/div"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr"));

        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();

        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);
        mouseOverHome.perform();
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        driver.close();


    }
}
