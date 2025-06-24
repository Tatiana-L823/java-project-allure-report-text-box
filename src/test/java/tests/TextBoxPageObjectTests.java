package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static io.qameta.allure.Allure.step;


public class  TextBoxPageObjectTests extends TestBase {

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



