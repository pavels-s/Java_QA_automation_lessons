package lecture8.Task1_CarTest.Pages;

import org.assertj.core.api.AssertionsForClassTypes;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsPagePom extends BasePage {

    public String baseUrl = "https://www.ss.com/lv/transport/cars/";
    private final By priceMin = By.id("f_o_8_min");
    private final By priceMax = By.id("f_o_8_max");
    private final By yearMin = By.id("f_o_18_min");
    private final By maxEngine = By.id("f_o_15_max");
    private final By carColor = By.id("f_o_17");
    String carColorValue;


    public void validateUrl() {
        String currentUrl = driver.getCurrentUrl();
        assertThat(currentUrl).isEqualTo(baseUrl);
    }

    public void setPrice(String min, String max) {
        driver.findElement(priceMin).sendKeys(min);
        driver.findElement(priceMax).sendKeys(max);
    }

    public void validatePrice(String min, String max) {
        assertThat(driver.findElement(priceMin).getAttribute("value")).isEqualTo(min);
        assertThat(driver.findElement(priceMax).getAttribute("value")).isEqualTo(max);
    }

    public void setYear(String year) {
        Select minYear = new Select(driver.findElement(yearMin));
        minYear.selectByValue(year);
    }

    public void validateYear(String year) {
        String minYearValue = driver.findElement(yearMin).getAttribute("value");
        assertThat(minYearValue).isEqualTo(year);
    }

    public void setEngineMax(String engine) {
        Select maxEngineSelect = new Select(driver.findElement(maxEngine));
        maxEngineSelect.selectByValue(engine);
    }

    public void setColor(int colorIndex) {
        Select carColorSelect = new Select(driver.findElement(carColor));
        carColorSelect.selectByIndex(colorIndex);
    }

    public void checkColor(String color) {
        carColorValue = driver.findElement(carColor).getAttribute("value");
        AssertionsForClassTypes.assertThat(carColorValue).isEqualTo(color);
    }

    public void submit() {
        driver.findElement(By.xpath("//input[@class='b s12']"));
    }
}
