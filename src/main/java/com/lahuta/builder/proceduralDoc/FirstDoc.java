package main.java.com.lahuta.builder.proceduralDoc;

import main.java.com.lahuta.builder.enums.Agent;
import main.java.com.lahuta.builder.enums.DocName;

public class FirstDoc extends ProcedularDocsBuilder {
    @Override
    public void buildName() {
        proceduralDoc.setName(DocName.FORM_ON_VIOLATIONS);
    }

    @Override
    public void buildNumber() {
        proceduralDoc.setNumber("13/01/132");
    }

    @Override
    public void buildData() {
        proceduralDoc.setData("12.03.2020");
    }

    @Override
    public void buildAgetn() {
        proceduralDoc.setAgent(Agent.BARAMIA);
    }
}