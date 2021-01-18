package com.epam.training.center.hw6;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import homework6.entity.JsonData;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JsonTestDataProvider {
    private static FileInputStream fis;
    private static ObjectMapper mapper;
    private static JsonData jsonData;
    private static String filePath = "src\\test\\resources\\homework06\\JDI_ex8_metalsColorsDataSet.json";

    @DataProvider
    public Object[][] jsonData() {

        try {
            mapper = new ObjectMapper();
            fis = new FileInputStream(filePath);
            jsonData = mapper.readValue(fis, JsonData.class);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Object[][]{
                {jsonData.getData1()},
                {jsonData.getData2()},
                {jsonData.getData3()},
                {jsonData.getData4()},
                {jsonData.getData5()}
        };

    }
}
