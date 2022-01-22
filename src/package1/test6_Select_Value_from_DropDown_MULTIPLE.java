package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test6_Select_Value_from_DropDown_MULTIPLE {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\doctor strange\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://output.jsbin.com/osebed/2";

        driver.get(baseUrl);
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        if(fruits.isMultiple()){
            fruits.selectByVisibleText("Banana");
            fruits.selectByVisibleText("Apple");
            System.out.println("DONE");
        }

        else {
            System.out.println("Sorry it can't select multiple");
        }
//        fruits.selectByVisibleText("Banana");
//        fruits.selectByVisibleText("Apple");

        Thread.sleep(3000);
        fruits.deselectAll();

    }
}
