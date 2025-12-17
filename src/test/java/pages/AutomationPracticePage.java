package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPracticePage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By radioButton1 = By.cssSelector("input[value='radio1']");
    private By dropdown = By.id("dropdown-class-example");
    private By checkboxOption1 = By.id("checkBoxOption1");
    private By alertBtn = By.id("alertbtn");
    private By confirmBtn = By.id("confirmbtn");

    public AutomationPracticePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    // Actions
    public void selectRadioButton() {
        wait.until(ExpectedConditions.elementToBeClickable(radioButton1)).click();
    }

    public void selectDropdownOption(String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown))
            .sendKeys(value);
    }

    public void selectCheckbox() {
        wait.until(ExpectedConditions.elementToBeClickable(checkboxOption1)).click();
    }

    public void clickAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(alertBtn)).click();
    }

    public String acceptAlertAndGetText() {
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return alertText;
    }

    public void clickConfirm() {
        wait.until(ExpectedConditions.elementToBeClickable(confirmBtn)).click();
    }
}
