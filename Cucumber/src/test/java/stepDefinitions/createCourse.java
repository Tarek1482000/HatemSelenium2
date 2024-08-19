package stepDefinitions;

import DefinitionsClasses.PageBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import static org.testng.Assert.assertTrue;
import static stepDefinitions.TestBase.courseName;
import static stepDefinitions.TestBase.coursePage;

public class createCourse {

    @Given("The user is on the home page")
    public void the_user_is_on_the_home_page() throws IOException {
        LoginPageTest.the_user_is_on_the_login_page();
        LoginPageTest.the_user_enters_valid_credentials();
        LoginPageTest.clicks_on_the_login_button();
        LoginPageTest.the_user_should_be_logged_in_and_redirected_to_the_home_page();
    }

    @When("The user navigates to the courses section")
    public void the_user_navigates_to_the_courses_section() {
        coursePage.ClickingOnCourse();
    }

    @When("The user clicks on the Add Course button")
    public void the_user_clicks_on_the_add_course_button() {

        coursePage.ClickingOnAddCourse();
    }

    @When("The user fills all mandatory fields")
    public void the_user_fills_all_mandatory_fields() {
        coursePage.FillCourseData(courseName);
    }

    @When("The user clicks on the create button")
    public void the_user_clicks_on_the_create_button() {
        coursePage.CreateCourseBtn();
    }

    @Then("The user should be navigated to the created course page")
    public void the_user_should_be_navigated_to_the_created_course_page() {
    }

    @When("The user enters the created course name in the search field")
    public void the_user_enters_the_created_course_name_in_the_search_field() {
        coursePage.SearchOnCourse(courseName);
    }

    @When("The user presses enter")
    public void the_user_presses_enter() {
        coursePage.CourseSearchEnterBtn();
    }

    @Then("The last created course with this name should display at the top")
    public void the_last_created_course_with_this_name_should_display_at_the_top() {
        String content = PageBase.getContent(coursePage.courseTitle);
        assertTrue(content.contains(courseName), "The course was not found in the search results.");
    }

}
