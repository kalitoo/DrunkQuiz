package com.example.blauoderschlau.model;

import java.io.Serializable;
import java.util.Date;

public class Game implements Serializable {

    // time stamp when game was finished
    private Date datePlayed;
    // the higher, the better (the less drunk)
    private double perMill;

    public Game(double perMill) {
        this.perMill = perMill;
        this.datePlayed = new Date();
    }

    public double getPerMill() {
        return perMill;
    }

    public Date getDate() {
        return datePlayed;
    }
}
