package com.bean;
public class Country
{
    int id;
    String countryName;

    public Country(int id, String countryName)
    {
        this.id = id;
        this.countryName = countryName;
    }

    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }





}