package org.ndviet.POM;

import org.ndviet.library.WebUI;

import java.util.Collections;

import static org.ndviet.library.TestObject.ObjectRepository.findTestObject;

public class SearchResults {
    public void verifyResultPresent(String message) throws Exception {
        WebUI.verifyElementVisible(findTestObject("Search Result.Message", Collections.singletonMap("value", message)));
    }

    public void verifyPromotionalCode(String message) throws Exception {
        WebUI.verifyElementVisible(findTestObject("Search Result.Promo Code Status"));
        String actualText = WebUI.getText(findTestObject("Search Result.Promo Code Status"));
        assert (actualText.contains(message));
    }

    public void verifyPromotionalCodeNotPresent() throws Exception {
        WebUI.verifyElementNotVisible(findTestObject("Search Result.Promo Code Status"));
    }

    public void verifyBackButtonPresent() throws Exception {
        WebUI.verifyElementVisible(findTestObject("Search Result.Button.Back"));
    }

    public void clickOnBackButton() throws Exception {
        WebUI.click(findTestObject("Search Result.Button.Back"));
    }
}
