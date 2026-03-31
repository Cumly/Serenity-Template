package org.example.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;

public class ExamplePage extends PageObject {

    public void openPage() {
        openUrl("https://www.google.com");
    }

    @FindBy(name = "q")
    private WebElementFacade cajaBusqueda;

    @FindBy(name = "btnK")
    private WebElementFacade botonBuscar;

    public void ingresarTerminoBusqueda(String texto) {
        cajaBusqueda.type(texto);
    }

    public void realizarBusqueda() {
        // .waitUntilClickable() asegura que el botón esté listo
        botonBuscar.waitUntilClickable().click();
    }
}