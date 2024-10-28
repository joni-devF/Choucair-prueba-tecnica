package com.orange.co.pages.inicioPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InicioPage extends PageObject {

    @FindBy(xpath = "//div/ul/li/a[contains(@class, 'oxd-main-menu-item')]/span[text()='Recruitment']")
    protected WebElementFacade btn_recruitment;
}
