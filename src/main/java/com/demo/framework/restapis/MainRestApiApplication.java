package com.demo.framework.restapis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Created by Krishan Shukla on 19/07/2018.
 */

@SpringBootApplication
public class MainRestApiApplication {

    @Value("${location.application.property}")
    private String LOCATION_APPLICATION_PROPERTIES;

    public static void main(String[] args) {
        SpringApplication.run(MainRestApiApplication.class, args);
    }


}
