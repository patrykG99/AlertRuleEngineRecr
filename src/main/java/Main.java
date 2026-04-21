import rules.DivisibilityRule;
import rules.RuleInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        DivisibilityRule divisibleByThree = new DivisibilityRule(3,"LOW");
        DivisibilityRule divisibleByFive = new DivisibilityRule(5,"ADVISORY");
        DivisibilityRule divisibleBySeven = new DivisibilityRule(7, "WARN");

        List<RuleInterface> rules = new ArrayList<>();
        rules.add(divisibleByThree);
        rules.add(divisibleByFive);
        rules.add(divisibleBySeven);

        for(int i = 1; i <= 105; i++){
            int finalI = i;
            String alerts = rules.stream().filter(rule -> rule.match(finalI)).map(RuleInterface::getAlert).collect(Collectors.joining());
            if (alerts.isEmpty()) {
                stringBuilder.append(finalI);
            } else {
                stringBuilder.append(alerts);
            }
            stringBuilder.append("\n");

        }
        System.out.println(stringBuilder);
    }
}
