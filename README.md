Command to run automated test

mvn clean test -D"cucumber.filter.tags=@SearchFlights" -D"selenium.browser.type=chrome"

Notes: Required Java 17 is installed