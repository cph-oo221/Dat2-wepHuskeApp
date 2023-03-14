package com.example.dat2wephuskeapp.Entitet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person
{
    private List<String> stringArrayList;
    private String navn;
    private String kode;

    // when you write String... it means that it is an array of strings
    public Person(String navn, String kode, String... s)
    {
        this.navn = navn;
        this.kode = kode;
        this.stringArrayList = Arrays.asList(s);

        // If you dont use String... you can use this
        // NB: Vhange parameter to String s
        // String [] strings = s.split(",");
        // this.stringArrayList = new ArrayList<>(Arrays.asList(strings));
    }

    public Person(String navn, String kode, List<String> stringArrayList)
    {
        this.navn = navn;
        this.kode = kode;
        this.stringArrayList = new ArrayList<>(stringArrayList);
    }

    public List<String> getStringArrayList()
    {
        return stringArrayList;
    }

    public void setStringArrayList(List<String> stringArrayList)
    {
        this.stringArrayList = stringArrayList;
    }

    public String getNavn()
    {
        return navn;
    }

    public void setNavn(String navn)
    {
        this.navn = navn;
    }

    public String getKode()
    {
        return kode;
    }

    public void setKode(String kode)
    {
        this.kode = kode;
    }

    @Override
    public String toString()
    {
        return "Person: " +
                "navn: " + navn +
                "| kode: " + kode + " | stringArrayList: "
                + stringArrayList + " |";
    }
}
