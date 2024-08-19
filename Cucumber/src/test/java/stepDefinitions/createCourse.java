package stepDefinitions;

import DefinitionsClasses.PageBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class createCourse extends TestBase {

    @Given("The user is on the home page")
    public void the_user_is_on_the_home_page() {
        LoginPageTest.the_user_enters_valid_credentials();
    }


    @When("The user navigates to the courses section")
    public void the_user_navigates_to_the_courses_section() {
        homePage.ClickingOnCourse();
    }

    @When("The user clicks on the Add Course button")
    public void the_user_clicks_on_the_add_course_button() {
        homePage.ClickingOnAddCourse();
    }

    @When("The user fills all mandatory fields")
    public void the_user_fills_all_mandatory_fields() {
        homePage.FillCourseData(courseName);
    }

    @When("The user clicks on the create button")
    public void the_user_clicks_on_the_create_button() {
        homePage.CreateCourseBtn();
    }

    @Then("The user should be navigated to the created course page")
    public void the_user_should_be_navigated_to_the_created_course_page() {
    }

    @When("The user enters the created course name in the search field")
    public void the_user_enters_the_created_course_name_in_the_search_field() {
        homePage.SearchOnCourse(courseName);
    }

    @When("The user presses enter")
    public void the_user_presses_enter() {
        homePage.CourseSearchEnterBtn();
    }

    @Then("The last created course with this name should display at the top")
    public void the_last_created_course_with_this_name_should_display_at_the_top() {
        String content = PageBase.getContent(homePage.courseTitle);
        assertTrue(content.contains(courseName), "The course was not found in the search results.");
    }

}
