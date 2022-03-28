package Lescture_7_Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Practice2 {

    @Test
    public void ssCarTest() {
//        Go to https://www.ss.com/lv/
        String driverPath = "C:\\JavaGuru\\Projects\\FirstGradle\\src\\test\\resources\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.ss.com/lv/");
        driver.manage().window().maximize();

//        Open cars
        driver.findElement(By.id("mtd_97")).click();

//        Check that cars page is opened
        String currentUrl = driver.getCurrentUrl();
        assertThat(currentUrl).isEqualTo("https://www.ss.com/lv/transport/cars/");

//        Enter price 6000 10000
        driver.findElement(By.id("f_o_8_min")).sendKeys("6000");
        driver.findElement(By.id("f_o_8_max")).sendKeys("10000");

//        Check if price parameter is selected
        String minValue = driver.findElement(By.id("f_o_8_min")).getAttribute("value");
        assertThat(minValue).isEqualTo("6000");
        String maxValue = driver.findElement(By.id("f_o_8_max")).getAttribute("value");
        assertThat(maxValue).isEqualTo("10000");

//        Enter year from 2001
        Select minYear = new Select(driver.findElement(By.id("f_o_18_min")));
        minYear.selectByValue("2001");

//        Check if year parameter is selected
        String minYearValue = driver.findElement(By.id("f_o_18_min")).getAttribute("value");
        assertThat(minYearValue).isEqualTo("2001");

//       Set engine max 3.0
        Select maxEngine = new Select(driver.findElement(By.id("f_o_15_max")));
        maxEngine.selectByValue("3.0");

//        Check if engine parameter is selected
        String maxEngineValue = driver.findElement(By.id("f_o_15_max")).getAttribute("value");
        assertThat(maxEngineValue).isEqualTo("3.0");

//        Set color "Balta"
        Select carColor = new Select(driver.findElement(By.id("f_o_17")));
        carColor.selectByValue("6318");

//        Check if color parameter is selected
        String carColorValue = driver.findElement(By.id("f_o_17")).getAttribute("value");
        assertThat(carColorValue).isEqualTo("6318");

//        Click submit
        driver.findElement(By.xpath("//input[@class='b s12']"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}

