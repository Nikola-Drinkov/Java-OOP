package _04_FoodShortage;

import java.util.Map;

public class FoodShortageHandler extends CommandHandler {
    private Map<String, Buyer> buyingPeople;

    public FoodShortageHandler(Map<String, Buyer> buyingPeople, String endCommand) {
        super(endCommand);
        this.buyingPeople = buyingPeople;
    }

    @Override
    protected void processNonEndCommand(String name) {
        Buyer targetPerson = findBuyingPerson(name);

        if (targetPerson != null) {
            targetPerson.buyFood();
        }
    }

    private Buyer findBuyingPerson(String name) {
        return buyingPeople.get(name);
    }
}
