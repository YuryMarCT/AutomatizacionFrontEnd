package com.siigo.gastaging.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.siigo.gastaging.userinterfaces.Dashboard.TXT_TITULO_PAGINA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacioPaginaDashboard implements Question<Boolean> {

    public static ValidacioPaginaDashboard valida() {
        return new ValidacioPaginaDashboard();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_TITULO_PAGINA, isVisible()).forNoMoreThan(20).seconds()
        );
        return TXT_TITULO_PAGINA.resolveFor(actor).isDisplayed();
    }
}