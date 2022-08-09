package lecture7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

    @Test
    public void facebookLogin() {

        String driverPath = "C:\\JavaGuru\\Projects\\QA_automation\\src\\test\\resources\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();

//        Go to https://www.facebook.com/ or any other social network
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("u_0_m_IS")).click();

//        Login with your credentials
        driver.findElement(By.id("email")).sendKeys("example@email.com");
        driver.findElement(By.id("pass")).sendKeys("example@email.com");

//        Press Login
        driver.findElement(By.id("u_0_d_Zi")).click();



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
                e.printStackTrace();
        }

        driver.quit();
    }
}
