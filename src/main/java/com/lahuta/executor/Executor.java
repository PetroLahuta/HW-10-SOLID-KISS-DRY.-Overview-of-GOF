package main.java.com.lahuta.executor;

import main.java.com.lahuta.builder.Clerk;
import main.java.com.lahuta.builder.proceduralDoc.FirstDoc;
import main.java.com.lahuta.builder.proceduralDoc.ProcedularDocsBuilder;
import main.java.com.lahuta.builder.proceduralDoc.ProceduralDoc;
import main.java.com.lahuta.singleton.Gitar;

public class Executor {
    public static void start() {
        startBuildDoc();
        startSingletonGitar();
    }

    private static void startBuildDoc() {
        Clerk clerk = new Clerk();
        ProcedularDocsBuilder firstDoc = new FirstDoc();
        clerk.setProcedularDocsBuilder(firstDoc);
        clerk.setShowNewProceduralDoc();

        ProceduralDoc proceduralDoc = clerk.getProceduralDoc();
        System.out.println(proceduralDoc);
    }

    private static void startSingletonGitar() {
        Gitar.getInstance("Gibson Les Paul");
        System.out.println("Gitar: " + Gitar.name);
        Gitar.getInstance("Trembita");
        System.out.println("Gitar: " + Gitar.name);
    }
}