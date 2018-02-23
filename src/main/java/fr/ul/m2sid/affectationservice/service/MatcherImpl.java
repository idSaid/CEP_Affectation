package fr.ul.m2sid.affectationservice.service;

import fr.ul.m2sid.affectationservice.dao.AgentDao;
import fr.ul.m2sid.affectationservice.entites.Agent;
import fr.ul.m2sid.affectationservice.entites.Event;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MatcherImpl implements Matcher {

    @Autowired
    AgentDao agentDao;


    @Override
    public Pair<Integer,Integer> mapEventToCallCenter(Event event) {
        /*Map<Integer, Integer> solution = new HashMap<>();
        Integer idRandomCallCenter = callCenters.iterator().next().getId();
        for (Event event: events) {
            solution.put(event.getIdentifiant(),idRandomCallCenter);
        }
        return solution;*/
        return null;
    }


    @Override
    public Pair<Integer, Integer> mapEventToAgent(Event event) {
        Pair<Integer,Integer> eventAgent = null;
        Agent bestAgent = new TreeSet<>(agentDao.getFreeAgents()).first();
        TreeSet<Agent> sortedAgents = new TreeSet<>(agentDao.getFreeAgents());
        List<Agent> callCenters = new ArrayList<>(agentDao.getCallCenters());
        // Affection du meilleur agent disponible à l'evt reçu
        if (bestAgent!=null){
            eventAgent = new Pair<>(event.getIdentifiant(),sortedAgents.pollFirst().getId());
        }
        // Affection du d'un centre d'appel à l'evt reçu
        else{
            eventAgent = new Pair<>(event.getIdentifiant(),callCenters.get(0).getId());
        }
        return eventAgent;
    }

}
