package fr.ul.m2sid.affectationservice.dao;

import fr.ul.m2sid.affectationservice.entites.Event;
import fr.ul.m2sid.affectationservice.util.Converter;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;

@Service
public final class EventDaoImpl implements EventDao {

    @Override
    public void saveEvent(Event event) {
        try {
            //TODO repair that
            PreparedStatement pstmt = PostgresConnection.getDbCon().conn.prepareStatement(
                    "INSERT INTO event_assistance () " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
            pstmt.execute();

        }
        catch (Exception e) {
            System.err.println("Erreur a l'enregistrement de l'evenement ! ");
            e.printStackTrace();
        }
    }


}
