package fr.ul.m2sid.affectationservice.dao;

import fr.ul.m2sid.affectationservice.entites.Agent;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;
import java.util.TreeSet;

@Service
public class AgentDaoImpl implements AgentDao {

    @Override
    public TreeSet<Agent> getFreeAgents() {
        TreeSet<Agent> agents= new TreeSet<>();
        try {
            PreparedStatement pstmt = PostgresConnection.getDbCon().conn.prepareStatement(
                    "SELECT id_resource , capacite_events, score FROM teleoperateurs_informations2 " +
                            "WHERE capacite_events > 0 and is_agent = 1;"
            );
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                Agent agent = new Agent(rs.getInt("id_resource"));
                agent.setScore(rs.getDouble("score"));
                agent.setAgent(true);
                agent.setCapacite_events(rs.getInt("capacite_events"));
                agents.add(agent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return agents;
    }

    @Override
    public Set<Agent> getCallCenters() {
        Set<Agent> agents= new TreeSet<>();
        try {
            PreparedStatement pstmt = PostgresConnection.getDbCon().conn.prepareStatement(
                    "SELECT id_resource, availability ,score, is_agent FROM teleoperateurs_informations2 WHERE is_agent = 0 ;"
            );
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                Agent agent = new Agent(rs.getInt("id_resource"));
                agent.setAgent(false);
                agents.add(agent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return agents;
    }

}
