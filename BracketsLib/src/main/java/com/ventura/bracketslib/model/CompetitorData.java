package com.ventura.bracketslib.model;

import java.io.Serializable;

/**
 * Created by Emil on 21/10/17.
 */

public class CompetitorData implements Serializable{

    private String name;
    private String score; //Should this be int? dont want to change before presentation but something to consider

    public CompetitorData(String name, String score){ //int score?
        this.name = name;
        this.score = score;
    }

    public String getScore() { //int getScore?
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CompetitorData{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
