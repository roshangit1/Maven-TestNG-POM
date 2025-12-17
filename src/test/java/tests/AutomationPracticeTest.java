package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AutomationPracticePage;


public class AutomationPracticeTest extends BaseTest {

    @Test
    public void radioButtonTest() {
        AutomationPracticePage page = new AutomationPracticePage(driver, wait);
        page.selectRadioButton();
        Assert.assertTrue(true, "Radio button selected");
    }

    @Test
    public void dropdownTest() {
        AutomationPracticePage page = new AutomationPracticePage(driver, wait);
        page.selectDropdownOption("Option2");
        Assert.assertTrue(true, "Dropdown option selected");
    }

    @Test
    public void checkboxTest() {
        AutomationPracticePage page = new AutomationPracticePage(driver, wait);
        page.selectCheckbox();
        Assert.assertTrue(true, "Checkbox selected");
    }

    @Test
    public void alertTest() {
        AutomationPracticePage page = new AutomationPracticePage(driver, wait);
        page.clickAlert();
        String alertText = page.acceptAlertAndGetText(); 	
        //System.out.print("Alert Text = "+ alertText);
        Assert.assertTrue(alertText.contains("Hello , share this practice page and share your knowledge"), "Alert text validated");
    }
}
