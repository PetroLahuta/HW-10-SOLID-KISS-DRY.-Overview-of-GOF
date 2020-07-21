package main.java.com.lahuta.builder.proceduralDoc;

import main.java.com.lahuta.builder.enums.Agent;
import main.java.com.lahuta.builder.enums.DocName;

public class ProceduralDoc {
    private DocName name;
    private String number;
    private String data;
    private Agent agent;

    public void setName(DocName name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    @Override
    public String toString() {
        return "ProceduralDoc{" +
                "name: " + name +
                ", number: '" + number + '\'' +
                ", data: '" + data + '\'' +
                ", agent: " + agent +
                '}';
    }
}