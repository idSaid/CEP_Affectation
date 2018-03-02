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

    TreeSet<Agent> agents;

    private void setAgents(){
        this.agents = new TreeSet<>(agentDao.getFreeAgents());
    }

    @Override
    public Pair<Integer, Integer> mapEventToAgent(Event event) {
        Pair<Integer,Integer> eventAgent = null;
        setAgents();

        // Si on a des agents disponibles
        if (agents!=null){
            if(event.isCriticte()) // Si l'evenement est critique on prend le meilleur agent disponible
                eventAgent = new Pair<>(event.getIdentifiant(),agents.first().getId());
            else // Sinon on prend un autre agent
                eventAgent = new Pair<>(event.getIdentifiant(),agents.last().getId());
        }

        // Sinon Affection d'un centre d'appel à l'evt reçu
        else{
            List<Agent> callCenters = new ArrayList<>(agentDao.getCallCenters());
            eventAgent = new Pair<>(event.getIdentifiant(),callCenters.get(0).getId());
        }

        return eventAgent;
    }

}
