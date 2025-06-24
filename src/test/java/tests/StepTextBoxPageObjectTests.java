package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static io.qameta.allure.Allure.step;


public class StepTextBoxPageObjectTests extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void successfulSignUp() {
        textBoxPage
                .openTextBoxPage()
                .setUserName("Masha Smith")
                .setEmail("masha@gmail.com")
                .setCurrentAddress("Some street 1")
                .setPermanentAddress("Some street 2")
                .scrollDownTextBoxPage()
                .clickSubmitButton()
                .checkOutputName("Masha Smith")
                .checkOutputEmail("masha@gmail.com")
                .checkOutputCurrentAddress("Some street 1")
                .checkOutputPermanentAddress("Some street 2");

    }


        @Test
        void successfulSignUpWithSteps() {
            step("Открываем страницу формы", () -> {
                textBoxPage.openTextBoxPage();
            });

            step("Вводим имя пользователя", () -> {
                textBoxPage.setUserName("Masha Smith");
            });

            step("Вводим имейл", () -> {
                textBoxPage.setEmail("masha@gmail.com");
            });

            step("Вводим имейл", () -> {
                textBoxPage.setEmail("masha@gmail.com");
            });


        }






    @Test
    void minimalDataSignUp() {
        textBoxPage
                .openTextBoxPage()
                .setUserName("Jane Ostin")
                .setEmail("janeOstin@mail.com")
                .scrollDownTextBoxPage()
                .clickSubmitButton()
                .checkOutputName("Jane Ostin")
                .checkOutputEmail("janeOstin@mail.com");

}


@Test
void emptyFields() {
    textBoxPage
            .openTextBoxPage()
            .scrollDownTextBoxPage()
            .clickSubmitButton()
            .checkOutputNameNotExist()
            .checkOutputEmailNotExist()
            .checkOutputCurrentAddressNotExist()
            .checkOutputPermanentAddressNotExist();



}
}



