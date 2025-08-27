package com.siigo.gastaging.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ClickCrear implements Task {
    private final PageObject page;

    public ClickCrear(PageObject page) {
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = net.serenitybdd.core.Serenity.getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        String script =
                "const host1 = document.querySelector('.data-siigo-five9.hydrated');" +
                        "if(!host1) return 'host1_null';" +
                        "const host2 = host1.shadowRoot.querySelector('siigo-button-atom[data-id=\"header-create-button\"]');" +
                        "if(!host2) return 'host2_null';" +
                        "const btn = host2.shadowRoot.querySelector('.btn-element.size-m');" +
                        "if(!btn) return 'btn_null';" +
                        "if(btn.disabled) return 'btn_disabled';" +
                        "if(btn.offsetParent === null) return 'btn_not_visible';" +
                        "btn.click();" +
                        "return 'click_ok';";

        Object result = js.executeScript(script);
        if (!"click_ok".equals(result)) {
            throw new RuntimeException("No se pudo hacer clic en el botón 'Crear': " + result);
        }
    }

    public static ClickCrear using(PageObject page) {
        return Tasks.instrumented(ClickCrear.class, page);
    }
}