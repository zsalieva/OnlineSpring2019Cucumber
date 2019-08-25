package com.vytrack.step_definitions;

import com.vytrack.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import com.vytrack.pages.activites.CalendarEventsPage;
import java.util.List;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.concurrent.TimeUnit;

public class CalendarEventsStepDefinitions {
    Pages pages = new Pages();

    @Then("following table headers should be displayed")
    public void following_table_headers_should_be_displayed(List<String> values) {
        Assert.assertEquals(values, pages.calendarEventsPage().getTableHeaders());
    }

}