package com.bean;

import java.util.ArrayList;

public class Country
   {
       ArrayList<Country> ls = new ArrayList<Country>();
       String countryName;
       int id;

       public Country(int id,String countryName)
       {
           this.countryName = countryName;
           this.id = id;
       }

       public void setCountryName(String countryName)
       {
           this.countryName = countryName;
       }

       public void setId(int id)
       {
           this.id = id;
       }

       public String getCountryName()
       {
           return countryName;
       }

       public int getId()
       {
           return id;
       }


   }