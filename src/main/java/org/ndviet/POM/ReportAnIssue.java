package org.ndviet.POM;

import org.ndviet.library.WebUI;

import static org.ndviet.library.TestObject.ObjectRepository.findTestObject;

public class ReportAnIssue {
    public void verifyFormTitlePresent() throws Exception {
        WebUI.verifyElementVisible(findTestObject("Report An Issue.Title"));
    }
}
