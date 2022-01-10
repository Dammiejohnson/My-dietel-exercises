package chapterFive;

public class ModifiedAutoPolicyDriver {
    public static void main(String[] args) {
        ModifiedAutoPolicy policy = new ModifiedAutoPolicy(12345, "Mercedes", "NJ");
        policy.setState("CT");
        System.out.println("State " + policy.getState() + " is " + policy.isNoFaultState()  + " as a no-fault state");
    }
}
