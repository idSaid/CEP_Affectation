package fr.ul.m2sid.affectationservice.dao;

import fr.ul.m2sid.affectationservice.entites.Agent;

import java.util.Set;
import java.util.TreeSet;

public interface AgentDao {

    TreeSet<Agent> getFreeAgents(); // a modifier par la suite

    Set<Agent> getCallCenters();

}
