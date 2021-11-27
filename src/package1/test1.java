package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","E:\\doctor strange\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury ToursFailed";
        String actualTitle = "";

//        running the driver
        driver.get(baseUrl);

        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println(actualTitle);
            System.out.println("Passed");
        }
        else {
            System.out.println(actualTitle);
            System.out.println("Failed");
        }
        driver.close();
    }
}
