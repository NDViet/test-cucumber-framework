## Introduction

Test repository with test case is created and executed in Cucumber Framework.<br>

## List dependency repositories

1. [test-parent-pom](../../../test-parent-pom)
2. [test-automation-fwk](../../../test-automation-fwk)

## Source code usage

1. Clone repository "test-parent-pom" (**mandatory**)

```shell
git clone git@github.com:vietnd96/test-parent-pom.git
```

2. Clone this test repository to the same directory

```shell
git clone git@github.com:vietnd96/test-cucumber-framework.git
```

3. Build source code in each repository following the order

- test-parent-pom
- test-cucumber-framework

4. Run test cases in test repository

```shell
cd test-cucumber-framework
```

```shell
mvn clean verify -D"cucumber.filter.tags=@SearchFlights" -D"selenium.browser.type=chrome"
```

## Reference

A sample project with entire repositories together for the test execution.<br>

* [test-automation-project](../../../test-automation-project)
