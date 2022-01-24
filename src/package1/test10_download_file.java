package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class test10_download_file {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\doctor strange\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseURL = "http://demo.guru99.com/test/yahoo.html";

        driver.get(baseURL);
        WebElement downloadBtn = driver.findElement(By.xpath("//*[@id=\"messenger-download\"]"));
        String urlDown = downloadBtn.getAttribute("href");
        String wget_command = "cmd /c C:\\Wget\\wget.exe -P E: --no-check-certificate " + urlDown;

        try {
            Process exec = Runtime.getRuntime().exec(wget_command);
            int exitValue = exec.waitFor();
            System.out.println(exitValue);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread.sleep(1000);
    }
}
