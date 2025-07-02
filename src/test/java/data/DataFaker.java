package data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataFaker {
    Faker faker = new Faker(new Locale("de"));

    public String userName = faker.name().username();
    public String userEmail = faker.internet().emailAddress();

    public String streetAddress = faker.address().streetAddress();

    public String permanentAddress = faker.address().fullAddress();







    //for checks
    public String titleModal = "Thanks for submitting the form";





}
