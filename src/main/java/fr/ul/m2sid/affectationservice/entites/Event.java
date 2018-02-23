package fr.ul.m2sid.affectationservice.entites;

public class Event {

    private Integer identifiant;
    private String emplacement;
    private String heure_enregistrement;
    private String image_name;
    private String client;

    public Event() {
    }

    public Event(Integer identifiant, String emplacement, String heure_enregistrement, String image_name, String client) {
        this.identifiant = identifiant;
        this.emplacement = emplacement;
        this.heure_enregistrement = heure_enregistrement;
        this.image_name = image_name;
        this.client = client;
    }

    public Integer getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(Integer identifiant) {
        this.identifiant = identifiant;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public String getHeure_enregistrement() {
        return heure_enregistrement;
    }

    public void setHeure_enregistrement(String heure_enregistrement) {
        this.heure_enregistrement = heure_enregistrement;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Event{" +
                "identifiant=" + identifiant +
                ", emplacement='" + emplacement + '\'' +
                ", heure_enregistrement='" + heure_enregistrement + '\'' +
                ", image_name='" + image_name + '\'' +
                ", client='" + client + '\'' +
                '}';
    }
}
