package main.java.com.lahuta.builder.proceduralDoc;

import main.java.com.lahuta.builder.enums.Agent;
import main.java.com.lahuta.builder.enums.DocName;

public class ThirdDoc extends ProcedularDocsBuilder {
    @Override
    public void buildName() {
        proceduralDoc.setName(DocName.ACT_ON_OFFENSE);
    }

    @Override
    public void buildNumber() {
        proceduralDoc.setNumber("14/01/381");
    }

    @Override
    public void buildData() {
        proceduralDoc.setData("01.04.2020");
    }

    @Override
    public void buildAgetn() {
        proceduralDoc.setAgent(Agent.YAHNYCH);
    }
}
