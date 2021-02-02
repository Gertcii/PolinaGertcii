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
    private DataForTexts[] dataForTexts;
    private DataForText[] textDataArr;
    private static final String filePathToTextData = "src/test/resources/homework08/checkTextData.json";
    private static final String filePathToTextsData = "src/test/resources/homework08/checkTextsData.json";

    public Object[][] fillDataProv(String path){

        gson = new Gson();
            try {
                fr = new FileReader(path);
                if (path.equals(filePathToTextData)) {
                    textDataArr = gson.fromJson(fr, DataForText[].class);
                    dataProviderArray = new Object[textDataArr.length][1];
                    for (int j = 0; j < textDataArr.length; j++) {
                        dataProviderArray[j][0] = textDataArr[j];
                    }
                }
                if (path.equals(filePathToTextsData)) {
                    dataForTexts = gson.fromJson(fr, DataForTexts[].class);
                    dataProviderArray = new Object[dataForTexts.length][1];
                    for (int j = 0; j < dataForTexts.length; j++) {
                        dataProviderArray[j][0] = dataForTexts[j];
                    }
                }
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return dataProviderArray;
    }

    @DataProvider
    public Object[][] jsonDataForText() {

        dataProviderArray = fillDataProv(filePathToTextData);
        return dataProviderArray;
    }

    @DataProvider
    public Object[][] jsonDataForTexts() {

        dataProviderArray = fillDataProv(filePathToTextsData);
        return dataProviderArray;
    }
}
