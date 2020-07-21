package main.java.com.lahuta.builder;

import main.java.com.lahuta.builder.proceduralDoc.ProcedularDocsBuilder;
import main.java.com.lahuta.builder.proceduralDoc.ProceduralDoc;

public class Clerk {
    private ProcedularDocsBuilder procedularDocsBuilder;

    public void setProcedularDocsBuilder(ProcedularDocsBuilder pdb) {
        procedularDocsBuilder = pdb;
    }

    public ProceduralDoc getProceduralDoc() {
        return procedularDocsBuilder.getProceduralDoc();
    }

    public void setShowNewProceduralDoc() {
        procedularDocsBuilder.showNewProceduralDoc();
        procedularDocsBuilder.buildName();
        procedularDocsBuilder.buildNumber();
        procedularDocsBuilder.buildData();
        procedularDocsBuilder.buildAgetn();
    }
}