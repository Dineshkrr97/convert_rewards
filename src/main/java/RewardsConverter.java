import java.util.Scanner;

public class RewardsConverter {
    public static class RewardValue {
        private double cash;
        private double miles;
        public RewardValue(int cash){
            this.cash = cash;
            this.miles = cash/0.0035;
        }
        public RewardValue(double milesValue){
            this.miles = milesValue;
            this.cash = milesValue*0.0035;

        }
        public double getCashValue(){
            return cash;
        }
        public double getMilesValue(){
            return miles;
        }
    
        
    }
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