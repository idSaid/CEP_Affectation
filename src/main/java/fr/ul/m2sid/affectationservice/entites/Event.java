package fr.ul.m2sid.affectationservice.entites;

public class Event {

    private Integer identifiant;
    private String idClient;

    public Event() {
    }

    public Event(Integer identifiant, String emplacement, String heure_enregistrement, String image_name, String client) {
        this.identifiant = identifiant;

        this.idClient = client;
    }

    public Integer getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(Integer identifiant) {
        this.identifiant = identifiant;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    @Override
    public String toString() {
        return "Event{" +
                "identifiant=" + identifiant +
                ", idClient='" + idClient + '\'' +
                '}';
    }
}
