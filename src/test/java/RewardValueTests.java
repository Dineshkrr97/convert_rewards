import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
    	 double cashValue=1;
         int miles=285;
         RewardValue rewardValue = new RewardValue(cashValue);
         assertEquals(miles, rewardValue.cashToMiles(cashValue)); 
    }

    @Test
    void convert_from_miles_to_cash() {
    	 double cashValue=0.035;
         int miles=10;
         RewardValue rewardValue = new RewardValue(miles);
         assertEquals(cashValue, rewardValue.milesToCash(miles));
    }
}
