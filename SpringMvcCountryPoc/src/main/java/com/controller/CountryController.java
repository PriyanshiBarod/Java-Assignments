package com.controller;
import com.bean.Country;
import com.service.CountryService;
import org.springframework.web.bind.annotation.PathVariable;
import utility.Countries;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class CountryController
{
    CountryService countryService = new CountryService();
    @RequestMapping(value = "/countries", method = RequestMethod.GET, produces ="application/json")
    public List<Country> getCountries()
    {

        return countryService.getAllCountries();
    }

    @RequestMapping(value = "/country/{id}", method = RequestMethod.GET,produces = "application/json")
    public Country getCountriesById(@PathVariable int id)
    {

                return countryService.getCountriesById(id);


    }
}
