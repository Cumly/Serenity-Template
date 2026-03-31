package org.example.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import org.example.pages.ExamplePage;

public class ExampleSteps {
    @Steps
    ExamplePage loginPage;

    @Given("que el usuario está en la página de Google")
    public void abrirGoogle() {
        loginPage.openPage();
    }

    @When("busca la palabra {string}")
    public void buscarTermino(String palabra) {
        loginPage.ingresarTerminoBusqueda(palabra);
    }

    @Then("debería ver resultados relacionados")
    public Boolean ResultadosRelacionados() {
        return true;
    }

}


