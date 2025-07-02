package tests;

import data.DataFaker;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import pages.TextBoxPage;
import io.qameta.allure.*;


import static io.qameta.allure.Allure.step;


@Epic("DemoQA")
@Feature("Text Box form")
@Owner("Tetiana Laricheva")
@Tag("demoqa")
public class StepTextBoxPageObjectTests extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();
    DataFaker data = new DataFaker();

        @Test
        @Story("Full Sign Up with valid data ")
        @Severity(SeverityLevel.CRITICAL)
        @DisplayName("Successful Sign Up with all filled fields")
        @Tag("positive")
        void successfulSignUpWithSteps() {
            step("Open Text Box page", () -> {
                textBoxPage.openTextBoxPage();
            });

            step("Enter User Name", () -> {
                textBoxPage.setUserName(data.userName);
            });

            step("Enter Email address", () -> {
                textBoxPage.setEmail(data.userEmail);
            });

            step("Enter Current Address", () -> {
                textBoxPage.setCurrentAddress(data.streetAddress);
            });

            step("Enter Permanent Address", () -> {
                        textBoxPage.setPermanentAddress(data.permanentAddress);
            });

            step("Scroll down Text Box page", () -> {
                        textBoxPage.scrollDownTextBoxPage();
            });

            step("Click Submit button", () -> {
                    textBoxPage.clickSubmitButton();
            });

            step("Check name output", () -> {
                textBoxPage.checkOutputName(data.userName);
            });

            step("Check Email output", () -> {
                textBoxPage.checkOutputEmail(data.userEmail);
            });

            step("Check Current Address output", () -> {
                textBoxPage.checkOutputCurrentAddress(data.streetAddress);
            });

            step("Check Permanent Address output", () -> {
                textBoxPage.checkOutputPermanentAddress(data.permanentAddress);
            });


    }



    @Test
    @Story("Sign Up only with required fields")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Minimum Sign Up only Name and email")
    @Tag("positive")
    void minimalDataSignUpWithSteps() {
        step("Open Text Box page", () -> {
            textBoxPage.openTextBoxPage();
        });

        step("Enter User Name", () -> {
            textBoxPage.setUserName(data.userName);
        });

        step("Enter Email address", () -> {
            textBoxPage.setEmail(data.userEmail);
        });

        step("Scroll down Text Box page", () -> {
            textBoxPage.scrollDownTextBoxPage();
        });

        step("Click Submit button", () -> {
            textBoxPage.clickSubmitButton();
        });

        step("Check name output", () -> {
            textBoxPage.checkOutputName(data.userName);
        });

        step("Check Email output", () -> {
            textBoxPage.checkOutputEmail(data.userEmail);
        });



    }

@Test
@Story("Checking up submitting an empty form ")
@Severity(SeverityLevel.MINOR)
@DisplayName("Submitting a form without filling in fields")
@Tag("negative")
void emptyFieldsWithSteps() {
    step("Open Text Box page", () -> {
        textBoxPage.openTextBoxPage();
    });

    step("Scroll down Text Box page", () -> {
        textBoxPage.scrollDownTextBoxPage();
    });

    step("Click Submit button", () -> {
        textBoxPage.clickSubmitButton();
    });

    step("Check Name doesn't output", () -> {
        textBoxPage.checkOutputNameNotExist();
    });

    step("Check Email doesn't output", () -> {
        textBoxPage.checkOutputEmailNotExist();
    });

    step("Check Current Address doesn't exist ", () -> {
        textBoxPage.checkOutputCurrentAddressNotExist();
    });

    step("Check Permanent Address doesn't exist", () -> {
        textBoxPage.checkOutputPermanentAddressNotExist();
    });



    }

}




