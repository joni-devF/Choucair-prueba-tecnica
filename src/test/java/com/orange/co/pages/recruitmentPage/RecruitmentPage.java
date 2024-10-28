package com.orange.co.pages.recruitmentPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RecruitmentPage extends PageObject {

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    protected WebElementFacade btn_add;

    @FindBy(xpath = "//input[@name='firstName']")
    protected WebElementFacade lbl_nombre;

    @FindBy(xpath = "//input[@name='lastName']")
    protected WebElementFacade lbl_apellido;

    @FindBy(xpath = "//div/i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    protected WebElementFacade list_vacante;
}
