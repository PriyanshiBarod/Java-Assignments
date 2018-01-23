package com.controller;


import com.bean.Country;
import com.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@EnableAutoConfiguration
@RestController
@RequestMapping(value = "/countries")

public class CountryController
{

    CountryService countryService = new CountryService();

    @GetMapping(produces = "Application/json")
    public List<Country> getCountries()
    {
        return countryService.getAllCountries();
    }

    @GetMapping(value = "/{id}", produces = "Application/json")
    public Country getCountryById(@PathVariable int id)
    {
        return countryService.getCountryById(id);
    }


}