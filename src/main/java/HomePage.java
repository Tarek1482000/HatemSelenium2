import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    By loggedSuccess = By.id("lblTenantDisplayName");
    WebElement successLogin;

    By CourseBtn = By.xpath("//*[@id=\"btnMyCoursesList\"]");
    WebElement CourseBtnElement;

    By AddCourseBtn = By.xpath("//*[@id=\"btnListAddCourse\"]");
    WebElement AddCourseBtnElement;


    By CourseName = By.xpath("//*[@id=\"txtCourseName\"]");
    WebElement CourseNameElement;

    By CourseSubjectBtn = By.xpath("//*[@id=\"courseSubject\"]");
    WebElement CourseSubjectBtnElement;


    By CourseSubject = By.xpath("//*[@id=\"courseSubject\"]/option[8]");
    WebElement CourseSubjectElement;


    By SelectGrade_YearBtn = By.xpath("//*[@id=\"courseGrade\"]");
    WebElement SelectGrade_YearBtnElement;

    By SelectGrade_Year = By.xpath("//*[@id=\"courseGrade\"]/option[6]");
    WebElement SelectGrade_YearElement;


    By SelectCourseTeache = By.xpath("//*[@id=\"lblGetSelectedSubjectTeachers\"]/i");
    WebElement SelectCourseTeacheElement;

    By SelectCourseTeacherBtn = By.xpath("//*[@id=\"teacherOnBehalf\"]");
    WebElement SelectCourseTeacherBtnElement;

    By SelectCourseTeacher = By.xpath("//*[@id=\"ui-select-choices-row-0-0\"]/span");

    WebElement SelectCourseTeacherElement;

    By CourseCompletionCriteria = By.xpath("//*[@id=\"divCompletionCriteria\"]/div[4]/label/span[1]");
    WebElement CourseCompletionCriteriaElement;


    By CreateCourseBtn = By.xpath("//*[@id=\"btnSaveAsDraftCourse\"]");
    WebElement CreateCourseBtnElement;


    By SearchOnCourse = By.xpath("//*[@id=\"txtCourseSearch\"]");
    WebElement SearchOnCourseElement;

    By SearchBtn = By.xpath("//*[@id=\"btnCourseSearch\"]");
    WebElement SearchBtnElement;


     By courseTitle = By.cssSelector("#lnkListCourseSelcted");

    public WebElement getSuccessLogin() {
        successLogin = driver.findElement(loggedSuccess);
        return successLogin;
    }

    public void ClickingOnCourse() {
         CourseBtnElement = driver.findElement(CourseBtn);
        Clicking(CourseBtnElement);

    }

    public void ClickingOnAddCourse() {
        AddCourseBtnElement = driver.findElement(AddCourseBtn);
        Clicking(AddCourseBtnElement);
    }


    public void FillCourseData( String CourseName) {
        SetCourseName(CourseName);
        SetCourseSubject();
        SetGradeYear();
        SetShowOnlyTeachers();
        SetCourseTeacher();
        SetCourseCompletionCriteria();
        CreateCourse();
    }

    public void SetCourseName(String Name)
    {
        CourseNameElement = driver.findElement(CourseName);
        SendText(CourseNameElement,Name);
    }

    public void SetCourseSubject()
    {
        CourseSubjectBtnElement = driver.findElement(CourseSubjectBtn);
        Clicking(CourseSubjectBtnElement);

        CourseSubjectElement = driver.findElement(CourseSubject);
        Clicking(CourseSubjectElement);

    }

    public void SetGradeYear()
    {
        SelectGrade_YearBtnElement = driver.findElement(SelectGrade_YearBtn);
        Clicking(SelectGrade_YearBtnElement);

        SelectGrade_YearElement = driver.findElement(SelectGrade_Year);
        Clicking(SelectGrade_YearElement);

    }

    public void SetShowOnlyTeachers()
    {
        SelectCourseTeacheElement = driver.findElement(SelectCourseTeache);
        Clicking(SelectCourseTeacheElement);
    }

    public void SetCourseTeacher()
    {
        SelectCourseTeacherBtnElement = driver.findElement(SelectCourseTeacherBtn);
        Clicking(SelectCourseTeacherBtnElement);

        SelectCourseTeacherElement = driver.findElement(SelectCourseTeacher);
        Clicking(SelectCourseTeacherElement);

    }

    public void SetCourseCompletionCriteria()
    {
        CourseCompletionCriteriaElement = driver.findElement(CourseCompletionCriteria);
        Clicking(CourseCompletionCriteriaElement);
    }

    public void CreateCourse()
    {
        CreateCourseBtnElement = driver.findElement(CreateCourseBtn);
        Clicking(CreateCourseBtnElement);
    }

    public void SearchOnCourse(String CourseName)
    {
        SearchOnCourseElement = driver.findElement(SearchOnCourse);
        SendText(SearchOnCourseElement,CourseName);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        SearchBtnElement = driver.findElement(SearchBtn);
        Clicking(SearchBtnElement);
    }





}

