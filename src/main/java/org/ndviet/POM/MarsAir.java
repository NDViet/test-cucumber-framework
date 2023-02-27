package org.ndviet.POM;

import org.ndviet.library.WebUI;

import static org.ndviet.library.TestObject.ObjectRepository.findTestObject;

public class MarsAir {
    public void clickOnLogo() throws Exception {
        WebUI.click(findTestObject("MarsAir.Logo"));
    }
}
