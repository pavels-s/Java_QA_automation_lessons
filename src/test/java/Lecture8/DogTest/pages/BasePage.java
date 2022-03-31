package Lecture8.DogTest.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static ChromeDriver driver = new ChromeDriver();;

    public void openChromeByUrl(String url) {
        String driverPath = "C:\\JavaGuru\\Projects\\QA_automation\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        //driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeChrome(){
        driver.quit();
    }

}
