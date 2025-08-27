package com.siigo.gastaging.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ClickCliente implements Task {

    private final PageObject page;

    public ClickCliente(PageObject page) {
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = net.serenitybdd.core.Serenity.getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        String script =
                "const host = document.querySelector('.data-siigo-five9.hydrated');" +
                        "if (!host) return 'host_null';" +
                        "const link = host.shadowRoot.querySelector('a[data-value=\"Clientes\"]');" +
                        "if (!link) return 'link_null';" +
                        "if (link.offsetParent === null) return 'link_not_visible';" +
                        "link.click();" +
                        "return 'click_ok';";

        Object result = js.executeScript(script);

        if (!"click_ok".equals(result)) {
            throw new RuntimeException("No se pudo hacer clic en el enlace 'Clientes': " + result);
        }
    }

    public static ClickCliente using(PageObject page) {
        return Tasks.instrumented(ClickCliente.class, page);
    }
}
