package com.siigo.gastaging.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/IniciarSesion.feature",
        glue = "com.siigo.gastaging.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class IniciarSesion_Runner {
}