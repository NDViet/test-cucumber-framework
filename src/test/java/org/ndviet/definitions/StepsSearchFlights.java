package org.ndviet.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ndviet.POM.MarsAir;
import org.ndviet.POM.ReportAnIssue;
import org.ndviet.POM.SearchForm;
import org.ndviet.POM.SearchResults;
import org.ndviet.library.BrowserManagement;
import org.ndviet.library.configuration.ConfigurationFactory;

public class StepsSearchFlights {
    SearchForm searchForm = new SearchForm();
    SearchResults searchResults = new SearchResults();
    ReportAnIssue reportAnIssue = new ReportAnIssue();
    MarsAir marsAir = new MarsAir();

    @Given("User is on book ticket page")
    public void userIsOnBookTicketPage() {
        BrowserManagement.getInstance().openBrowser(ConfigurationFactory.getInstance().getValue("basedUrl"));
    }

    @When("User performs to select Departure date as {string}")
    public void userPerformsToSelectDepartureDateAs(String arg0) throws Exception {
        searchForm.selectDepartureDate(arg0);
    }

    @And("User performs to select Return date as {string}")
    public void userPerformsToSelectReturnDateAs(String arg0) throws Exception {
        searchForm.selectReturnDate(arg0);
    }

    @And("User clicks on Search button")
    public void userClicksOnSearchButton() throws Exception {
        searchForm.clickOnSearchButton();
    }

    @Then("User should be able to see Search Result as {string}")
    public void userShouldBeAbleToSeeSearchResultAs(String arg0) throws Exception {
        searchResults.verifyResultPresent(arg0);
    }

    @And("User should able to see the Back button")
    public void userShouldAbleToSeeTheBackButton() throws Exception {
        searchResults.verifyBackButtonPresent();
    }

    @When("User clicks on Back button")
    public void userClicksOnBackButton() throws Exception {
        searchResults.clickOnBackButton();
    }

    @Then("User is able to see the search form is navigated back")
    public void userIsAbleToSeeTheSearchFormIsNavigatedBack() throws Exception {
        searchForm.verifyFormTitlePresent();
    }

    @And("User enters the promotional code as {string}")
    public void userEntersThePromotionalCodeAs(String arg0) throws Exception {
        searchForm.enterPromotionalCode(arg0);
    }

    @And("User should able to see Promotional Code status as {string}")
    public void userShouldAbleToSeePromotionalCodeStatusAs(String arg0) throws Exception {
        searchResults.verifyPromotionalCode(arg0);
    }

    @And("User should not be able to see Promotional Code status")
    public void userShouldNotBeAbleToSeePromotionalCodeStatus() throws Exception {
        searchResults.verifyPromotionalCodeNotPresent();
    }

    @Then("User navigate to Report an issue page")
    public void userNavigateToReportAnIssuePage() throws Exception {
        searchForm.navigateToReportAnIssue();
    }

    @And("User is able to see the Report issue screen")
    public void userIsAbleToSeeTheReportIssueScreen() throws Exception {
        reportAnIssue.verifyFormTitlePresent();
    }

    @When("User clicks on MarsAir logo")
    public void userClicksOnMarsAirLogo() throws Exception {
        marsAir.clickOnLogo();
    }

    @And("It take the user to Home page")
    public void itTakeTheUserToHomePage() throws Exception {
        searchForm.verifyFormTitlePresent();
    }
}
