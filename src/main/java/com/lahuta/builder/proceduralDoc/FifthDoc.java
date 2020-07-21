package main.java.com.lahuta.builder.proceduralDoc;

import main.java.com.lahuta.builder.enums.Agent;
import main.java.com.lahuta.builder.enums.DocName;

public class FifthDoc extends ProcedularDocsBuilder {
    @Override
    public void buildName() {
        proceduralDoc.setName(DocName.DECISION_ON_SANCTION);
    }

    @Override
    public void buildNumber() {
        proceduralDoc.setNumber("14/01/1295");
    }

    @Override
    public void buildData() {
        proceduralDoc.setData("20.04.2020");
    }

    @Override
    public void buildAgetn() {
        proceduralDoc.setAgent(Agent.KHROMAEV);
    }
}
