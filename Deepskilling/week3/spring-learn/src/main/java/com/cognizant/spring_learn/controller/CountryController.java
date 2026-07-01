package com.cognizant.spring_learn.controller;


import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;


import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.beans.Country;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CountryController {
    private static final Logger logger = LoggerFactory.getLogger(CountryController.class);
    private  final ApplicationContext  context;
    
    

    public CountryController(ApplicationContext context) {
        this.context = context;
    }



    @GetMapping("/country")
    public Country getCountryIndia() {

        Country country = (Country) context.getBean("country");
        logger.debug("Country : {}", country.toString());

        return country;
    }
    

    
}
