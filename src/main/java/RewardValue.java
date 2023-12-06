public class RewardValue {
    private final double cash;
    RewardValue(double cash){
        this.cash = cash;
    }

    RewardValue(int miles){
        this.cash = convertToCash(miles);
    }
    private static int convertToMiles(double cash) {
        return (int) (cash / .0035);
    }
    private static double convertToCash(int miles) {
        return miles * .0035;
    }
    public double getCashValue(){
        return cash;
    }
    public int getMilesValue(){
        return convertToMiles(this.cash);
    }
}
