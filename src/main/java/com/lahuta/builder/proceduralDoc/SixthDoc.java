package main.java.com.lahuta.builder.proceduralDoc;

import main.java.com.lahuta.builder.enums.Agent;
import main.java.com.lahuta.builder.enums.DocName;

public class SixthDoc extends ProcedularDocsBuilder {
    @Override
    public void buildName() {
        proceduralDoc.setName(DocName.DECISION_ON_CLOSURE);
    }

    @Override
    public void buildNumber() {
        proceduralDoc.setNumber("14/01/14523");
    }

    @Override
    public void buildData() {
        proceduralDoc.setData("28.04.2020");
    }

    @Override
    public void buildAgetn() {
        proceduralDoc.setAgent(Agent.TARABAKIN);
    }
}