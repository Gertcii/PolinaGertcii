package homework8.services;

import homework8.entities.dto.CheckTextDto;
import homework8.entities.dto.DataForText;
import homework8.entities.dto.DataForTexts;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AssertionService {

    public AssertionService() throws IOException {

    }

    // assertion for check Text
    public void checkCodeNumberForText(CheckTextDto[] response, DataForText dataForText) {
        assertEquals(response[0].getCode(),
                dataForText.getCode(),
                "Code number is empty or isn't right");
    }

    public void checkRightWordArrayContainsExpectedText
            (CheckTextDto[] response, DataForText dataForText) {
        List<String> list = Arrays.asList(response[0].getS());
        assertTrue(list.contains(dataForText.getS()),
                "There is not eny match in right word list");
    }

    public void onlyWordWithMistakeInResult
            (CheckTextDto[] response, DataForText dataForText) {
        assertEquals(response[0].getWord(),
                dataForText.getWord(),
                "No one or incorrect word in result");
    }

    // assertion for check Texts
    public void numberOfResultFilesIsRight
    (CheckTextDto[][] response, DataForTexts dataForTexts) {
        assertEquals(response[0].length,
                dataForTexts.getText().length,
                "Incorrect number of results");
    }

    public void resultContainsRightWord
            (CheckTextDto[][] response, DataForTexts dataForTexts) {
        if (response[0].length > 0) {
            for (int i = 0; i < response[0].length; i++) {
                List<CheckTextDto[]> listDtoArr = Arrays.asList(response);
                List<String> list = Arrays.asList(listDtoArr.get(0)[i].getS());
                String expectedRightWord = dataForTexts.getS()[i];
                //this is checking the contents of the array
                System.out.println(list.toString());
                System.out.println(expectedRightWord);
                assertTrue(list.contains(expectedRightWord), "There is not eny match in right word list");

            }
        }
    }

}
