package com.siigo.gastaging.tasks;

import com.siigo.gastaging.models.Formulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.siigo.gastaging.userinterfaces.FormularioPage.TXT_NOMBRES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FormularioCliente implements Task {

    private final Formulario dataCliente;

    public FormularioCliente(Formulario dataCliente) {
        this.dataCliente = dataCliente;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.the(TXT_NOMBRES, isVisible()).forNoMoreThan(10).seconds();
    }

    public static FormularioCliente formulario(Formulario dataCliente) {
        return Tasks.instrumented(FormularioCliente.class, dataCliente);
    }
}