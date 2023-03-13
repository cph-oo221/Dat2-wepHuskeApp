package com.example.dat2wephuskeapp.Model;

import com.example.dat2wephuskeapp.Controller.AppStart;
import com.example.dat2wephuskeapp.Entitet.Person;

import java.util.Map;

public class PersonMapper
{
    protected static Map<String, Person> getAllPerson()
    {
        return AppStart.getPersonMap();
    }
}
