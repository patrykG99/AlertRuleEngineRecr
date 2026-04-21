package rules;

public class DivisibilityRule implements RuleInterface {

    private final int divisor;
    private final String alert;

    public DivisibilityRule(int divisor, String alert){
        if(divisor == 0){
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        this.divisor = divisor;
        this.alert = alert;
    }

    @Override
    public boolean match(int n) {

        return n % divisor == 0;
    }

    @Override
    public String getAlert() {
        return alert;
    }
}
