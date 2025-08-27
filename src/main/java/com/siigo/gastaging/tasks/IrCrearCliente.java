package com.siigo.gastaging.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.siigo.gastaging.userinterfaces.Dashboard.TXT_TITULO_PAGINA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrCrearCliente implements Task {
    public static IrCrearCliente ir() {
        return Tasks.instrumented(IrCrearCliente.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(WaitUntil.the(TXT_TITULO_PAGINA, isVisible()).forNoMoreThan(20).seconds(),

                ClickCrear.using(new PageObject() {
                }));
        System.out.println("El usuario ha hecho clic en el botón 'Crear' dentro del shadow DOM");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                ClickCliente.using(new PageObject() {
                }));
        System.out.println("El usuario ha hecho clic en el botón  Cliente dentro del shadow DOM");

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}