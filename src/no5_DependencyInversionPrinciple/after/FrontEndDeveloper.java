package no5_DependencyInversionPrinciple.after;

public class FrontEndDeveloper implements Developer {
    @Override
    public void develop() {
        writeJavascript();
    }

    public void writeJavascript() {
    }
}
