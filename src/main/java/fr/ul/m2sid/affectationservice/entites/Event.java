package fr.ul.m2sid.affectationservice.entites;

public class Event {

    private Integer identifiant;
    private String idClient;
    private boolean criticte;

    public Event() {
    }

    public Event(Integer identifiant, String client, boolean criticte) {
        this.identifiant = identifiant;
        this.idClient = client;
        this.criticte = criticte;
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

    public boolean isCriticte() {
        return criticte;
    }

    public void setCriticte(boolean criticte) {
        this.criticte = criticte;
    }

    @Override
    public String toString() {
        return "Event{" +
                "identifiant=" + identifiant +
                ", idClient='" + idClient + '\'' +
                ", criticte=" + criticte +
                '}';
    }
}
