package com.siigo.gastaging.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPage {

    public static final Target TXT_NOMBRES = Target.the("Campo donde se diligencia el Nombre")
            .locatedBy("input.mdc-text-field__input.input-name");

    public static final Target TXT_APELLIDOS = Target.the("Campo donde se diligencia el Apellido")
            .located(By.cssSelector("input.mdc-text-field__input.input-lastname"));

    public static final Target IDENTIFICACION = Target.the("Campo donde se ingresa la identificación")
            .located(By.cssSelector("input.mdc-text-field__input.input-identification"));

    public static final Target CIUDAD = Target.the("Campo ciudad")
            .located(By.id("inputAutocompletecity"));

    public static final Target OPCION_CIUDAD = Target.the("Opción de ciudad en la lista")
            .locatedBy("//div[starts-with(@id,'divTDAutocompletecity') and text()='{0}']");
}