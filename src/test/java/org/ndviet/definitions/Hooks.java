package org.ndviet.definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.ndviet.library.TakeScreenshot;
import org.ndviet.library.WebUI;

public class Hooks {
    @Before
    public static void setUp() {
    }

    @After
    public static void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            TakeScreenshot.capturePageScreenshot(scenario.getName());
        }
        WebUI.closeBrowser();
    }
}