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

    protected static Person getPerson(String navn)
    {
        return AppStart.getPersonMap().get(navn);
    }

    protected static void addPerson(Person person)
    {
        AppStart.getPersonMap().put(person.getNavn(), person);
    }

    protected static void removePerson(String navn)
    {
        AppStart.getPersonMap().remove(navn);
    }

    protected static void updatePerson(Person person)
    {
        // todo make a update person method
    }
}
