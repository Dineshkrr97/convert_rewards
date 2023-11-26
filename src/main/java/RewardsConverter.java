import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}

class RewardValue {
    double reward_cashvalue;
    double reward_milesValue;
    
    public RewardValue(double cashValue){
        reward_cashvalue = cashValue;
    }


    public RewardValue(float milesValue){ 
        reward_milesValue = milesValue; 
    }

    public double getCashValue(){
        return reward_cashvalue;
    }
    public double getMilesValue(){
        return reward_cashvalue*0.0035;
    }
}