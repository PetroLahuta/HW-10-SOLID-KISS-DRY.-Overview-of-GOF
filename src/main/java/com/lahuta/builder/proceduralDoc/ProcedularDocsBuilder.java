package main.java.com.lahuta.builder.proceduralDoc;

public abstract class ProcedularDocsBuilder {
    protected ProceduralDoc proceduralDoc;

    public ProceduralDoc getProceduralDoc() {
        return proceduralDoc;
    }

    public void showNewProceduralDoc() {
        proceduralDoc = new ProceduralDoc();
    }

    public abstract void buildName();

    public abstract void buildNumber();

    public abstract void buildData();

    public abstract void buildAgetn();

}
