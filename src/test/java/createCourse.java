import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class createCourse extends TestBase {

    @BeforeTest
    public void setUp() {
        LoginPageTest.ValidLoginTC();
    }

    @Test
    public void CreateCourseTC()
    {
        homePage.ClickingOnCourse();
        homePage.ClickingOnAddCourse();
        homePage.FillCourseData(courseName);

        homePage.ClickingOnCourse();
        homePage.SearchOnCourse(courseName);
        assertTrue(PageBase.getContent(homePage.courseTitle).contains(courseName));

    }
    @AfterTest
    public void CloseHome()
    {
//        driver.quit();
    }
}
