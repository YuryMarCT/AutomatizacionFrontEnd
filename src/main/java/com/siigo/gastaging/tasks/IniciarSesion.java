package com.siigo.gastaging.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.*;

import static com.siigo.gastaging.userinterfaces.PaginaInicio.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IniciarSesion implements Task {

    private String correo;
    private String clave;

    public IniciarSesion(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    public static IniciarSesion con(String correo, String clave) {
        return Tasks.instrumented(IniciarSesion.class, correo, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_CORREO, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(correo).into(TXT_CORREO),
                Enter.theValue(clave).into(TXT_CLAVE),
                Click.on(BTN_CONTINUAR));
    }
}