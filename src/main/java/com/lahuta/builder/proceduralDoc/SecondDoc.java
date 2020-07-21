package main.java.com.lahuta.builder.proceduralDoc;

import main.java.com.lahuta.builder.enums.Agent;
import main.java.com.lahuta.builder.enums.DocName;

public class SecondDoc extends ProcedularDocsBuilder {
    @Override
    public void buildName() {
        proceduralDoc.setName(DocName.DECISION_ON_OFFENSE);
    }

    @Override
    public void buildNumber() {
        proceduralDoc.setNumber("14/02/1418");
    }

    @Override
    public void buildData() {
        proceduralDoc.setData("20.03.2020");
    }

    @Override
    public void buildAgetn() {
        proceduralDoc.setAgent(Agent.YAHNYCH);
    }
}