package DefinitionsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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


     public By courseTitle = By.cssSelector("#lnkListCourseSelcted");

    public WebElement getSuccessLogin() {
        successLogin = PageBase.driver.findElement(loggedSuccess);
        return successLogin;
    }

    public void ClickingOnCourse() {
         CourseBtnElement = PageBase.driver.findElement(CourseBtn);
        PageBase.Clicking(CourseBtnElement);

    }

    public void ClickingOnAddCourse() {
        AddCourseBtnElement = PageBase.driver.findElement(AddCourseBtn);
        PageBase.Clicking(AddCourseBtnElement);
    }


    public void FillCourseData( String CourseName) {
        SetCourseName(CourseName);
        SetCourseSubject();
        SetGradeYear();
        SetShowOnlyTeachers();
        SetCourseTeacher();
        SetCourseCompletionCriteria();
    }

    public void CreateCourseBtn() {
        CreateCourse();
    }

    public void SetCourseName(String Name)
    {
        CourseNameElement = PageBase.driver.findElement(CourseName);
        PageBase.SendText(CourseNameElement,Name);
    }

    public void SetCourseSubject()
    {
        CourseSubjectBtnElement = PageBase.driver.findElement(CourseSubjectBtn);
        PageBase.Clicking(CourseSubjectBtnElement);

        CourseSubjectElement = PageBase.driver.findElement(CourseSubject);
        PageBase.Clicking(CourseSubjectElement);

    }

    public void SetGradeYear()
    {
        SelectGrade_YearBtnElement = PageBase.driver.findElement(SelectGrade_YearBtn);
        PageBase.Clicking(SelectGrade_YearBtnElement);

        SelectGrade_YearElement = PageBase.driver.findElement(SelectGrade_Year);
        PageBase.Clicking(SelectGrade_YearElement);

    }

    public void SetShowOnlyTeachers()
    {
        SelectCourseTeacheElement = PageBase.driver.findElement(SelectCourseTeache);
        PageBase.Clicking(SelectCourseTeacheElement);
    }

    public void SetCourseTeacher()
    {
        SelectCourseTeacherBtnElement = PageBase.driver.findElement(SelectCourseTeacherBtn);
        PageBase.Clicking(SelectCourseTeacherBtnElement);

        SelectCourseTeacherElement = PageBase.driver.findElement(SelectCourseTeacher);
        PageBase.Clicking(SelectCourseTeacherElement);

    }

    public void SetCourseCompletionCriteria()
    {
        CourseCompletionCriteriaElement = PageBase.driver.findElement(CourseCompletionCriteria);
        PageBase.Clicking(CourseCompletionCriteriaElement);
    }

    public void CreateCourse()
    {
        CreateCourseBtnElement = PageBase.driver.findElement(CreateCourseBtn);
        PageBase.Clicking(CreateCourseBtnElement);
    }

    public void SearchOnCourse(String CourseName)
    {
        SearchOnCourseElement = PageBase.driver.findElement(SearchOnCourse);
        PageBase.SendText(SearchOnCourseElement,CourseName);
    }

    public void CourseSearchEnterBtn()
    {
        SearchOnCourseElement.sendKeys(Keys.ENTER);
    }

}

