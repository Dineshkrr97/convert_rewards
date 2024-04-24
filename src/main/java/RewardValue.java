
public class RewardValue {
	private double cashValue;
	private int milesValue;

	public RewardValue(double cash) {
		cashValue=cash;
		milesValue=cashToMiles(cashValue);
	}
	public RewardValue(int miles) {
		milesValue=miles;
		cashValue=cashToMiles(cashValue);
	}

	public double getCashValue() {
		return cashValue;
	}


	public int getMilesValue() {
		return milesValue;
	}

	public static double milesToCash(int miles) {
		return miles *  0.0035;
		
	}
	public static int cashToMiles(double cash) {
		return (int) (cash / 0.0035);
		
	}

}
