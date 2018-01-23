package com.service;

import com.model.Country;
import com.repository.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService
{
    @Autowired
    ICountryRepository countryRepository;
public List<Country> getAllCountries()
{
    List<Country> listOfCountries = countryRepository.findAll();
    return listOfCountries;
}

public Country getCountryById(int id)
{
    //Country listOfCountries = new ArrayList<Country>();
     Country country = countryRepository.findOne(id);
    return country;


}
}
