package com.orange.co.steps.recruitmentStep;

import com.orange.co.pages.recruitmentPage.RecruitmentPage;
import net.thucydides.core.annotations.Step;

public class RecruitmentStep extends RecruitmentPage {

    @Step("Dar clic en boton Add")
    public void clicBotonAdd(){
        btn_add.click();

    }

    @Step("Ingresar nombre del postulado")
    public void ingresarNombre(String nombre){
        lbl_nombre.sendKeys(nombre);
    }

    @Step("Ingresar apellido del postulado")
    public void ingresarApellido(String apellido){
        lbl_apellido.sendKeys(apellido);
    }

    @Step("Desplegar lista de vacantes")
    public void clicListaVacantes(){
        list_vacante.click();
    }
}
