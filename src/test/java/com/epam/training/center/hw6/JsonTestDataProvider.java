package com.epam.training.center.hw6;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import homework6.entity.MetalAndColor;
import org.testng.annotations.DataProvider;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonTestDataProvider {

    private static FileInputStream fis;
    private static ObjectMapper mapper;
    private static String filePath = "src\\test\\resources\\homework06\\JDI_ex8_metalsColorsDataSet.json";
    Object[][] dataProviderArray;

    @DataProvider
    public Object[][] jsonData() {

        try {
            mapper = new ObjectMapper();
            fis = new FileInputStream(filePath);
            HashMap<String, MetalAndColor> map = mapper.readValue(fis,
                    new TypeReference<HashMap<String, MetalAndColor>>() {
                    });
            int i = 0;
            dataProviderArray = new Object[map.size()][1];
            for (Map.Entry<String, MetalAndColor> entry : map.entrySet()) {
                dataProviderArray[i][0] = entry.getValue();
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataProviderArray;

    }
}
