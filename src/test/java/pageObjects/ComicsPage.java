package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComicsPage extends BasePage{
    By txtTituloPagina =(By.className("page-title"));
    String tituloPaginaString = "Category: comics";

    public ComicsPage(WebDriver driver) {
        super(driver);
    }


    public By getTxtTituloPagina() {
        return txtTituloPagina;
    }

    public String getTituloPaginaString() {
        return tituloPaginaString;
    }

    public boolean validacion() throws Exception {
        return    this.isDisplayed(txtTituloPagina) && this.getTest(txtTituloPagina).equals(tituloPaginaString);
    }

}
