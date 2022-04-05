package Lecture8.Task_2_ForumCinema_Login;

import org.openqa.selenium.chrome.ChromeDriver;

public class CinemaBasePage {

    public static ChromeDriver driver = new ChromeDriver();

    public void openChromeUrl(String url) {
        String driverPath = "C:\\JavaGuru\\Projects\\QA_automation\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeChrome() {driver.quit();}
}
