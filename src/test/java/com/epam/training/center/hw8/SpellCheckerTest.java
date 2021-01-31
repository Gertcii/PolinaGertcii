package com.epam.training.center.hw8;

import com.epam.training.center.hw8.dto.CheckTextDto;
import com.epam.training.center.hw8.service.AssertionService;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;


public class SpellCheckerTest {

    private AssertionService assertionService;


    @Test(dataProvider = "jsonDataForText", dataProviderClass = SpellCheckDataProvider.class)
    public void checkTextTest(CheckTextDto ctd) throws IOException {

        assertionService = new AssertionService();

        assertionService.checkResult(ctd);

    }



}
