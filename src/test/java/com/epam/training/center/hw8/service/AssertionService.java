package com.epam.training.center.hw8.service;

import com.epam.training.center.hw8.dto.CheckTextDto;

import java.io.IOException;

import static org.testng.Assert.assertEquals;


public class AssertionService {

    private CheckTextDto text;
    private CheckTextService checkTextService = new CheckTextService();

    public AssertionService() throws IOException {

    }

    public void checkResult(CheckTextDto response) throws IOException {
        CheckTextDto[] result = checkTextService.getResultByWord(response.getResponse());
        //assertEquals(result.length, 1, "Incorrect array length");
        assertEquals(result[0], text);
    }

}
