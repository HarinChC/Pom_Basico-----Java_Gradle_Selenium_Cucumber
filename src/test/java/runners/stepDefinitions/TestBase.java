package runners.stepDefinitions;

import org.openqa.selenium.WebDriver;
import pageObjects.ComicsPage;
import pageObjects.HomePage;

public class TestBase {
    protected WebDriver driver = Hooks.getDriver();
    protected HomePage homePage = new HomePage(driver);
    protected ComicsPage comicsPage = new ComicsPage(driver);
}
