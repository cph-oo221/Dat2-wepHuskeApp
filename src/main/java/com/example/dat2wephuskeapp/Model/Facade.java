package com.example.dat2wephuskeapp.Model;

import com.example.dat2wephuskeapp.Entitet.Person;

import java.util.Map;

public class Facade
{
    public static Map<String, Person> getAllperson()
    {
        return PersonMapper.getAllPerson();
    }

    public static Person getPerson(String navn)
    {
        return PersonMapper.getPerson(navn);
    }

    public static Person addPerson(Person person)
    {
        return PersonMapper.addPerson(person);
    }

    public static void removePerson(String navn)
    {
        PersonMapper.removePerson(navn);
    }

    public static void updatePerson(Person person)
    {
        PersonMapper.updatePerson(person); // todo make a update person method in PersonMapper
    }

    public static String savePerson(Person person)
    {
        return PersonMapper.savePerson(person);
    }
}
