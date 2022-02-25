package tests;

import org.junit.jupiter.api.Test;

import pages.StudentRegistrationFormPage;

public class StudentRegistrationFormTests extends BaseTest {
    StudentRegistrationFormPage studentRegistrationFormPage = new StudentRegistrationFormPage();

    @Test
    void successfulFillFormPage() {
        studentRegistrationFormPage
                .openPage()
                .fillForm()
                .checkData();
    }
}
