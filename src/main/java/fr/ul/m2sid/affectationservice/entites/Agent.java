package fr.ul.m2sid.affectationservice.entites;

public class Agent implements Comparable<Agent>{

    private int id;
    private double score;
    private double hourlyWage;
    private boolean isAgent;
    private int capacite_events;

    public Agent() {
    }

    public Agent(int id, double score, double hourlyWage, boolean isAgent, int capacite_events) {
        this.id = id;
        this.score = score;
        this.hourlyWage = hourlyWage;
        this.isAgent = isAgent;
        this.capacite_events = capacite_events;
    }

    public int getCapacite_events() {
        return capacite_events;
    }

    public void setCapacite_events(int capacite_events) {
        this.capacite_events = capacite_events;
    }

    public Agent(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public boolean isAgent() {
        return isAgent;
    }

    public void setAgent(boolean agent) {
        isAgent = agent;
    }

    @Override
    public int compareTo(Agent agent) {
        if(this.score < agent.getScore())
            return 1;
        else if(this.score > agent.getScore())
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", score=" + score +
                ", hourlyWage=" + hourlyWage +
                ", isAgent=" + isAgent +
                ", capacite_events=" + capacite_events +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Agent)) return false;
        Agent agent = (Agent) o;
        return id == agent.id &&
                Double.compare(agent.score, score) == 0 &&
                Double.compare(agent.hourlyWage, hourlyWage) == 0 ;
    }

}
