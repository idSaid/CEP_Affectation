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
            PreparedStatement pstmt = PostgresConnection.getDbCon().conn.prepareStatement(
                    "INSERT INTO event_assistance (" +
                            "heure_enregistrement, " +
                            "image_name) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");



            pstmt.setDate(2, Converter.convertDateToSQLFormat(event.getHeure_enregistrement()));
            pstmt.setString(13, event.getImage_name());
            pstmt.execute();

        }
        catch (Exception e) {
            System.err.println("Erreur a l'enregistrement de l'evenement ! ");
            e.printStackTrace();
        }
    }


}
