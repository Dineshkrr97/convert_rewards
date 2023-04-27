public class RewardValue {

    private double cashValue;
    private int milesValue;




    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public void convertMilesToCash() {
        this.cashValue = this.milesValue*0.0035;
    }
}
