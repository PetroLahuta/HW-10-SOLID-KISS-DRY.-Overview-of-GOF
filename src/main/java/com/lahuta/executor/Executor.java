package main.java.com.lahuta.executor;

import main.java.com.lahuta.builder.Clerk;
import main.java.com.lahuta.builder.proceduralDoc.*;
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
        ProceduralDoc proceduralDocOne = clerk.getProceduralDoc();
        System.out.println(proceduralDocOne);

        ProcedularDocsBuilder secondDoc = new SecondDoc();
        clerk.setProcedularDocsBuilder(secondDoc);
        clerk.setShowNewProceduralDoc();
        ProceduralDoc proceduralDocTwo = clerk.getProceduralDoc();
        System.out.println(proceduralDocTwo);

        ProcedularDocsBuilder thirdDoc = new ThirdDoc();
        clerk.setProcedularDocsBuilder(thirdDoc);
        clerk.setShowNewProceduralDoc();
        ProceduralDoc proceduralDocThree = clerk.getProceduralDoc();
        System.out.println(proceduralDocThree);

        ProcedularDocsBuilder fourthDoc = new FourthDoc();
        clerk.setProcedularDocsBuilder(fourthDoc);
        clerk.setShowNewProceduralDoc();
        ProceduralDoc proceduralDocFour = clerk.getProceduralDoc();
        System.out.println(proceduralDocFour);

        ProcedularDocsBuilder fiveDoc = new FifthDoc();
        clerk.setProcedularDocsBuilder(fiveDoc);
        clerk.setShowNewProceduralDoc();
        ProceduralDoc proceduralDocFive = clerk.getProceduralDoc();
        System.out.println(proceduralDocFive);

        ProcedularDocsBuilder sixDoc = new SixthDoc();
        clerk.setProcedularDocsBuilder(sixDoc);
        clerk.setShowNewProceduralDoc();
        ProceduralDoc proceduralDocSix = clerk.getProceduralDoc();
        System.out.println(proceduralDocSix);
    }

    private static void startSingletonGitar() {
        Gitar.getInstance("Gibson Les Paul");
        System.out.println("Gitar: " + Gitar.getName());
        Gitar.getInstance("Trembita");
        System.out.println("Gitar: " + Gitar.getName());

        Gitar gitar = Gitar.getInstance(Gitar.getName());
        Gitar gitar2 = Gitar.getInstance(Gitar.getName());
        System.out.println(gitar.equals(gitar2));
    }
}