package main.java.com.lahuta.builder.proceduralDoc;

import main.java.com.lahuta.builder.enums.Agent;
import main.java.com.lahuta.builder.enums.DocName;

public class FourthDoc extends ProcedularDocsBuilder {
    @Override
    public void buildName() {
        proceduralDoc.setName(DocName.DECISION_ON_CONSIDERATION_OF_CASE);
    }

    @Override
    public void buildNumber() {
        proceduralDoc.setNumber("03/1469");
    }

    @Override
    public void buildData() {
        proceduralDoc.setData("10.04.2020");
    }

    @Override
    public void buildAgetn() {
        proceduralDoc.setAgent(Agent.KHROMAEV);
    }
}
