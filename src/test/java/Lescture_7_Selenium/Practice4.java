package Lescture_7_Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {

    @Test
    public void aliexpressTattoo() {
        String driverPath = "C:\\JavaGuru\\Projects\\QA_automation\\src\\test\\resources\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();

//        Go to https://www.aliexpress.com/
        driver.get("https://www.aliexpress.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("btn-close")).click();
        driver.findElement(By.className("_24EHh")).click();

//        In search write: tattoo
        driver.findElement(By.id("search-key")).sendKeys("tattoo");

//        Press search
        driver.findElement(By.className("search-button")).click();

//        Set min price 10
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/span[1]/span[2]/input")).sendKeys("10");

//        Set max price 20
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/span[1]/span[3]/input")).sendKeys("20");

//        Press ok
        driver.findElement(By.className("search-button")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
