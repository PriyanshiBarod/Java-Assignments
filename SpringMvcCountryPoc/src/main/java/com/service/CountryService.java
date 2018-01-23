package com.service;

import com.bean.Country;
import org.springframework.web.bind.annotation.PathVariable;
import utility.Countries;

import java.util.List;

public class CountryService
{
    public List<Country> getAllCountries()
    {
        Countries countries = new Countries();
        List<Country> listOfCountries = countries.createCountryList();
        return listOfCountries;
    }

    public Country getCountriesById(@PathVariable int id) {
        Countries countries = new Countries();
        List<Country> listOfCountries = countries.createCountryList();
        for (Country country : listOfCountries) {
            if ((country.getId()) == id)
                return country;
        }
        return null;
    }
}
