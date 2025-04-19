package org.projects;

public class Agent {
    private String name;
    private long generatedFund;

    // Constructor
    public Agent(String name, long generatedFund) {
        this.name = name;
        this.generatedFund = generatedFund;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getGeneratedFund() {
        return generatedFund;
    }

    public void setGeneratedFund(long generatedFund) {
        this.generatedFund = generatedFund;
    }
}
