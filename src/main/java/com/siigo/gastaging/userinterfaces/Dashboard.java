package com.siigo.gastaging.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Dashboard {
    public static final Target TXT_TITULO_PAGINA = Target.the("Titulo de la pagina para validacion").
            located(By.xpath("//div[@class='menu-tab-title-label mr-10']"));
}