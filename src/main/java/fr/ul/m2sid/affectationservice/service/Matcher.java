package fr.ul.m2sid.affectationservice.service;


import fr.ul.m2sid.affectationservice.entites.Event;
import javafx.util.Pair;

public interface Matcher {

    Pair<Integer,Integer> mapEventToCallCenter(Event event);
    Pair<Integer,Integer> mapEventToAgent(Event event);
}
