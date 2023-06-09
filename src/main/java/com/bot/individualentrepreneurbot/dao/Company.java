package com.bot.individualentrepreneurbot.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String requisites;
    private int counter;

    public int getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public String getRequisites() {
        return requisites;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
