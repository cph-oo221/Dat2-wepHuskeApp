package com.example.dat2wephuskeapp.Model;

import com.example.dat2wephuskeapp.Entitet.Person;

import java.util.Map;

public class Facade
{
    public static Map<String, Person> getAllperson()
    {
        return PersonMapper.getAllPerson();
    }
}
