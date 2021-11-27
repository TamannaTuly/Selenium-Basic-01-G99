package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
    public static void main(String[] args){
        System.setProperty("Webdriver.chrome.driver","E:\\doctor strange\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
    }
}
