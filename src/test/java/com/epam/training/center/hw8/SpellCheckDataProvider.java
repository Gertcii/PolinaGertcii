package com.epam.training.center.hw8;

import com.epam.training.center.hw8.dto.CheckTextDto;
import com.google.gson.Gson;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SpellCheckDataProvider {

    private Object[][] dataProviderArray;
    private FileReader fr;
    private Gson gson;
    private String filePath = "src/test/java/com/epam/training/center/hw8/testDataSource/checkTextData.json";
    private CheckTextDto[] dataArr;

    @DataProvider
    public Object[][] jsonDataForText(){

        gson = new Gson();

        try{
            fr = new FileReader(filePath);
            dataArr = gson.fromJson(fr, CheckTextDto[].class);
            int i = 0;
            dataProviderArray = new Object[dataArr.length][1];
            for (CheckTextDto ctd: dataArr
                 ) {
                dataProviderArray[i][0] = ctd;
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dataProviderArray;

    }
}
