package com.orange.co.steps.inicioStep;

import com.orange.co.pages.inicioPage.InicioPage;
import net.thucydides.core.annotations.Step;

public class InicioStep extends InicioPage {

    @Step("Clic en boton Recruitment")
    public void clicBotonRecruitment(){
        btn_recruitment.click();
    }
}
