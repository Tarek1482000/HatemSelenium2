import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class createCourse extends TestBase {

    @BeforeTest
    public void setUp() {
        LoginPageTest.ValidLoginTC();
    }

    @Test
    public void CreateCourseTC()
    {
        coursePage.ClickingOnCourse();
        coursePage.ClickingOnAddCourse();
        coursePage.FillCourseData(courseName);

        coursePage.ClickingOnCourse();
        coursePage.SearchOnCourse(courseName);
        assertTrue(PageBase.getContent(coursePage.courseTitle).contains(courseName));
    }
    @AfterTest
    public void CloseHome()
    {
//        driver.quit();
    }
}
