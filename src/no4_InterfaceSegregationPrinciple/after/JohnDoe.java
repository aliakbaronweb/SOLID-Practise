package no4_InterfaceSegregationPrinciple.after;

public class JohnDoe implements SwimmingAthlete {
    @Override
    public void compete() {
        System.out.println("John Doe started competing");
    }

    @Override
    public void swim() {
        System.out.println("John Doe started swimming");
    }
}