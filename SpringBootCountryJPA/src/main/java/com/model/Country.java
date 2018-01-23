
package com.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Country")
public class Country
{
@Id
int id;
String name;

    public Country()
    {
    }

    public Country(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }



}