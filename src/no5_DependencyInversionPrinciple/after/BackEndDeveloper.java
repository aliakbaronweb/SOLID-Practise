package no5_DependencyInversionPrinciple.after;

public class BackEndDeveloper implements Developer {
    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava() {
    }
}
