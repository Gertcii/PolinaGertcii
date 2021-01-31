package com.epam.training.center.hw8.service;

import com.epam.training.center.hw8.ConfigurationProperties;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;


import java.io.IOException;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CommonService {

    private RequestSpecification requestSpecification;

    public CommonService() throws IOException {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails(); //a??
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(ConfigurationProperties.getProperty("url")).build();
    }
    public Response postNoParams(String uri) {
        Response response = given(requestSpecification).post(uri);
        response.then()
                .statusCode(Matchers.lessThan(300))
                .statusCode(Matchers.greaterThanOrEqualTo(200));
        return response;
    }
    public Response getWithParams(String uri, Map<String, Object> params) {
        RequestSpecification specification = given(requestSpecification);

        for (Map.Entry<String, Object> param : params.entrySet())
            specification.param(param.getKey(), param.getValue());

        return specification.get(uri);
    }
}
