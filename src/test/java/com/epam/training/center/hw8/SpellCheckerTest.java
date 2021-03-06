package com.epam.training.center.hw8;


import homework8.entities.dto.CheckTextDto;
import homework8.entities.dto.DataForText;
import homework8.entities.dto.DataForTexts;
import homework8.services.AssertionService;
import homework8.services.CheckTextService;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SpellCheckerTest {

    private AssertionService assertionService;
    private CheckTextService checkTextService;

    @BeforeClass
    public void SetUp() {
        assertionService = new AssertionService();
        checkTextService = new CheckTextService();

    }

    @Test(dataProvider = "jsonDataForText", dataProviderClass = SpellCheckDataProvider.class)
    public void checkTextTest(DataForText testData) {

        Response response = checkTextService.createResponseForTextByParam(testData);
        CheckTextDto[] actualResult = checkTextService.parseResponseForText(response);
        assertionService
                .checkCodeNumberForText(actualResult, testData)
                .checkRightWordArrayContainsExpectedText(actualResult, testData)
                .onlyWordWithMistakeInResult(actualResult, testData);
    }

    @Test(dataProvider = "jsonDataForTexts", dataProviderClass = SpellCheckDataProvider.class)
    public void checkTextsServiceTest(DataForTexts testData) {

        Response response = checkTextService.createResponseForTextsByParam(testData);
        CheckTextDto[][] actualResult = checkTextService.parseResponseForTexts(response);

        assertionService.
                numberOfResultFilesIsRight(actualResult, testData)
                .resultContainsRightWord(actualResult,testData);
    }

}
