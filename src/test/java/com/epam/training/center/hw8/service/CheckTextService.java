package com.epam.training.center.hw8.service;

import com.epam.training.center.hw8.dto.CheckTextDto;

import java.io.IOException;

public class CheckTextService extends CommonService{

    private static final String textUri = "/checkText%s";

    public CheckTextService() throws IOException {
    }

    public CheckTextDto[] getResultByWord(String word) throws IOException {
        return  new CommonService()
                .postNoParams(String.format(textUri, word))
                .getBody().as(CheckTextDto[].class);
    }


}
