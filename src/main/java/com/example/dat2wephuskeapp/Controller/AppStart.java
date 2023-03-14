package com.example.dat2wephuskeapp.Controller;

import com.example.dat2wephuskeapp.Entitet.Person;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.*;

public class AppStart implements ServletContextListener
{
    private static Map<String, Person> personMap;

    @Override
    public void contextInitialized(ServletContextEvent sce)
    {
        //  ServletContextListener.super.contextInitialized(sce);
        List<Person> personList = new ArrayList<>();

        Person person = new Person("Oskar", "123", "bamse", "is", "pude");
        Person person1 = new Person("Lars", "1234", "tun", "øl", "gaffatape");
        Person person2 = new Person("Peter", "12345", "pløkker", "vodka");
        Person person3 = new Person("Bob", "123456", "Vand", "gril");

        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        personMap = new TreeMap<>();

        for (Person element : personList)
        {
            personMap.put(element.getNavn(), element);
        }
        // sce.getServletContext().setAttribute("personer", personMap);
    }

    public static Map<String, Person> getPersonMap()
    {
        return personMap;
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce)
    {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
