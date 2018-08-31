package no4_InterfaceSegregationPrinciple.after;

import no4_InterfaceSegregationPrinciple.after.SwimmingAthlete;

public class JumpingAthlete implements SwimmingAthlete {

    @Override
    public void compete() {
        System.out.println("John Doe started competing");
    }

    @Override
    public void swim() {
        System.out.println("John Doe started swimming");
    }
}
