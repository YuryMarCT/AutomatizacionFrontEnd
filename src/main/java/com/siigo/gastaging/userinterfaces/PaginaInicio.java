package com.siigo.gastaging.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicio {
    public static final Target TXT_CORREO = Target.the("Campo Ingresar Correo Electrónico").
            located(By.id("siigoSignInName"));
    public static final Target TXT_CLAVE = Target.the("Campo Ingresar Contraseña del Usuario").
            located(By.id("siigoPassword"));
    public static final Target BTN_CONTINUAR = Target.the("Botón para Continuar con el Inicio de Sesión").
            located(By.id("siigoNext"));
}