package org.ndviet.POM;

import org.ndviet.library.WebUI;

import java.util.Collections;

import static org.ndviet.library.TestObject.ObjectRepository.findTestObject;

public class SearchForm {
    public SearchForm() {

    }

    public void verifyFormTitlePresent() throws Exception {
        WebUI.verifyElementVisible(findTestObject("Search Form.Title"));
    }

    public void selectDepartureDate(String index) throws Exception {
        WebUI.click(findTestObject("Search Form.Departure.ComboBox"));
        WebUI.click(findTestObject("Search Form.Departure.Select Index", Collections.singletonMap("index", index)));
    }

    public void selectReturnDate(String index) throws Exception {
        WebUI.click(findTestObject("Search Form.Return.ComboBox"));
        WebUI.click(findTestObject("Search Form.Return.Select Index", Collections.singletonMap("index", index)));
    }

    public void enterPromotionalCode(String code) throws Exception {
        WebUI.setText(findTestObject("Search Form.Promotional Code.Textbox"), code);
    }

    public void clickOnSearchButton() throws Exception {
        WebUI.click(findTestObject("Search Form.Button.Search"));
    }

    public void navigateToReportAnIssue() throws Exception {
        WebUI.click(findTestObject("MarsAir.Navigation.Report an issue"));
    }

}
