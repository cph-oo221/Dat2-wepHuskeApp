package com.example.dat2wephuskeapp.Entitet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person
{
    private List<String> stringArrayList;
    private String navn;
    private String kode;

    public Person(String navn, String kode, String... s)
    {
        this.navn = navn;
        this.kode = kode;

        this.stringArrayList = Arrays.asList(s);
        // String [] strings = s.split(",");
        // this.stringArrayList = new ArrayList<>(Arrays.asList(strings));
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
}
