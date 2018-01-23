package com.service;

import com.bean.Country;
import org.springframework.beans.factory.annotation.Autowired;
import utility.Countries;

import java.util.List;

public class CountryService
{

    Countries countries = new Countries();

    public List<Country> getAllCountries()
    {
        List<Country> listOfCountries = countries.createCountryList();
        return listOfCountries;
    }

    public Country getCountryById(int id)
    {
        List<Country> listOfCountries = countries.createCountryList();
        for(Country country:listOfCountries)
        {
            if(country.getId()==id)
                return country;
        }
        return null;
    }
}
