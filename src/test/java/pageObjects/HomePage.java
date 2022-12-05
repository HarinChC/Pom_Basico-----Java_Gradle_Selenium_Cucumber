package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    //Localizadores o variables para la pagina
    String txtTituloPagina ="Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    By btnComics = (By.xpath("//a[normalize-space()='The Little Tester comics']"));

    //Getter
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public By getBtnComics() {
        return btnComics;
    }
    public String getTxtTituloPagina() {
        return txtTituloPagina;
    }

    //Acciones o Funciones

    public boolean HomePageIsDisplayed() throws Exception {
        return this.getTitle().contains(getTxtTituloPagina());
    }
    public void clickEnTituloComics() throws Exception {
        this.click(btnComics);
    }

}
