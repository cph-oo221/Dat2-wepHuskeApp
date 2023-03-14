package com.example.dat2wephuskeapp.Model;

import com.example.dat2wephuskeapp.Controller.AppStart;
import com.example.dat2wephuskeapp.Entitet.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PersonMapper
{
    private static Map<String, Person> personMap = AppStart.getPersonMap();

    protected static Map<String, Person> getAllPerson()
    {
        return personMap;
    }

    protected static Person copyPerson(Person person)
    {
        if(person == null)
        {
            return null;
        }

        List<String> stringList = new LinkedList<>(person.getStringArrayList());

        return new Person(person.getNavn(), person.getKode(), stringList);
    }

    protected static Person getPerson(String navn)
    {
        return copyPerson(personMap.getOrDefault(navn, null));
        // return personMap.get(navn);
    }

    protected static Person addPerson(Person person)
    {
        return personMap.put(person.getNavn(), person);
    }

    protected static void removePerson(String navn)
    {
        personMap.remove(navn);
    }

    protected static void updatePerson(Person person)
    {
        // todo make a update person method
    }

    public static String savePerson(Person person)
    {
        if (personMap.containsKey(person.getNavn()))
        {
            personMap.put(person.getNavn(), person);
            return "Personen blev opdateret " + person.getNavn();
        }
        return "Personen blev gemt " + person.getNavn();
    }
}
