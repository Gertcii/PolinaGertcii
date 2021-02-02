package homework8.services;


import homework8.ConfigurationProperties;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.Map;

public class CommonService {

    private RequestSpecification requestSpecification;

    public CommonService() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(ConfigurationProperties.getUrl()).build();
    }

    public Response getWithParams(String uri, Map<String, Object> params) {
        RequestSpecification specification = RestAssured.given(requestSpecification);
        for (Map.Entry<String, Object> param : params.entrySet())
            specification.param(param.getKey(), param.getValue());
        return specification.get(uri);
    }
}
