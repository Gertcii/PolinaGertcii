package com.epam.training.center.hw8;

import com.google.gson.Gson;
import homework8.entities.dto.DataForText;
import homework8.entities.dto.DataForTexts;
import org.testng.annotations.DataProvider;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SpellCheckDataProvider {

    private Object[][] dataProviderArray;
    private FileReader fr;
    private Gson gson;
    private String filePath;
    private DataForText[] textDataArr;
    private DataForTexts[] dataForTexts;

    @DataProvider
    public Object[][] jsonDataForText() {

        gson = new Gson();
        filePath = "src/test/resources/homework08/checkTextData.json";

        try {
            fr = new FileReader(filePath);
            textDataArr = gson.fromJson(fr, DataForText[].class);
            dataProviderArray = new Object[textDataArr.length][1];
            for (int j = 0; j < textDataArr.length; j++) {
                dataProviderArray[j][0] = textDataArr[j];
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dataProviderArray;
    }

    @DataProvider
    public Object[][] jsonDataForTexts() {

        gson = new Gson();
        filePath = "src/test/resources/homework08/checkTextsData.json";

        try {
            fr = new FileReader(filePath);
            dataForTexts = gson.fromJson(fr, DataForTexts[].class);
            dataProviderArray = new Object[dataForTexts.length][1];
            for (int j = 0; j < dataForTexts.length; j++) {
                dataProviderArray[j][0] = dataForTexts[j];
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dataProviderArray;
    }
}
