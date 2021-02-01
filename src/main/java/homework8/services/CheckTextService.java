package homework8.services;

import homework8.entities.dto.CheckTextDto;
import homework8.entities.dto.DataForText;
import homework8.entities.dto.DataForTexts;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CheckTextService extends CommonService {

    private static final String TEXT_URI = "/checkText";
    private static final String TEXTs_URI = "/checkTexts";

    public CheckTextService() throws IOException {
    }

    public Response createResponseForTextByParam(DataForText dataForText)
            throws IOException {

        Map<String, Object> map = new HashMap<>();
        map.put("text", dataForText.getText());
        map.put("lang", dataForText.getLang());
        map.put("options", dataForText.getOptions());

        return new CommonService().getWithParams(TEXT_URI, map);
    }

    public Response createResponseForTextsByParam(DataForTexts dataForTexts)
            throws IOException {

        Map<String, Object> map = new HashMap<>();
        map.put("text", dataForTexts.getText());
        map.put("lang", dataForTexts.getLang());
        map.put("options", dataForTexts.getOptions());

        return new CommonService().getWithParams(TEXTs_URI, map);
    }

    public CheckTextDto[] postForText(Response response) {

        return response
                .then()
                .extract()
                .body()
                .as(CheckTextDto[].class);

    }

    public CheckTextDto[][] postForTexts(Response response) {

        return response
                .then()
                .extract()
                .body()
                .as(CheckTextDto[][].class);

    }


}
