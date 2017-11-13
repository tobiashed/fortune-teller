/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

import java.util.ArrayList;

/**
 *
 * @author rafael
 */
public class Translator {

    private ArrayList<String> arrayOfAdjectives = new ArrayList<String>();
    private ArrayList<String> arrayOfSubstantives = new ArrayList<String>();
    private ArrayList<String> arrayOfVerbs = new ArrayList<String>();

    public Translator() {
        populateArrayOfAdjectives();
        populateArrayOfSubstantives();
        populateArrayOfVerbs();

    }

    public void populateArrayOfAdjectives() {
        this.arrayOfAdjectives.add("stor");
        this.arrayOfAdjectives.add("liten");
        this.arrayOfAdjectives.add("stark");
        this.arrayOfAdjectives.add("svag");
        this.arrayOfAdjectives.add("mjuk");
        this.arrayOfAdjectives.add("hård");
        this.arrayOfAdjectives.add("snabb");
        this.arrayOfAdjectives.add("vacker");
        this.arrayOfAdjectives.add("ljus");
        this.arrayOfAdjectives.add("mörk");
    }

    public void populateArrayOfSubstantives() {
        this.arrayOfSubstantives.add("en lönehöjning");
        this.arrayOfSubstantives.add("en lönesänkning");
        this.arrayOfSubstantives.add("en fotboja");
        this.arrayOfSubstantives.add("en katt");
        this.arrayOfSubstantives.add("en hund");
        this.arrayOfSubstantives.add("ett hus");
        this.arrayOfSubstantives.add("ett barn");
        this.arrayOfSubstantives.add("ett elstängsel");
        this.arrayOfSubstantives.add("en dator");
        this.arrayOfSubstantives.add("ett golv");
    }

    public void populateArrayOfVerbs() {
        this.arrayOfVerbs.add("springa");
        this.arrayOfVerbs.add("ljuga");
        this.arrayOfVerbs.add("flyga");
        this.arrayOfVerbs.add("se");
        this.arrayOfVerbs.add("vara");
        this.arrayOfVerbs.add("äta");
        this.arrayOfVerbs.add("mäta");
        this.arrayOfVerbs.add("gå");
        this.arrayOfVerbs.add("röra");
        this.arrayOfVerbs.add("resa");

    }

    public String returnSubstantive(int numberOnTheTable) {
        String result = this.arrayOfSubstantives.get(numberOnTheTable);
        return result;
    }

    public String returnAdjective(int numberOnTheTable) {
        String result = this.arrayOfAdjectives.get(numberOnTheTable);
        return result;
    }

    public String returnVerb(int numberOnTheTable) {
        String result = this.arrayOfVerbs.get(numberOnTheTable);
        return result;
    }
}
