package com.orange.co.utilities;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class WebOrange {

    @Steps(shared = true)
    PageObject orange;


    public void navegarA(String url){
        orange.setDefaultBaseUrl(url);
        orange.open();
    }

}
