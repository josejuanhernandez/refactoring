package insurance;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class InsuranceQuote_ {


    @Test
    public void should_get_a_premium_of_60_per_100_when_motorist_is_less_than_25() throws Exception {
        InsuranceQuote insuranceQuote = new InsuranceQuote(new Motorist(24, 3));
        assertThat(insuranceQuote.calculatePremium(300.0), is(180.0));
    }

    @Test
    public void should_get_a_premium_of_60_per_100_when_motorist_has_3_points() throws Exception {
        InsuranceQuote insuranceQuote = new InsuranceQuote(new Motorist(24, 3));
        assertThat(insuranceQuote.calculatePremium(300.0), is(180.0));
    }

    @Test
    public void should_get_a_premium_of_40_per_100_when_motorist_has_4_points() throws Exception {
        InsuranceQuote insuranceQuote = new InsuranceQuote(new Motorist(30, 4));
        assertThat(insuranceQuote.calculatePremium(300.0), is(120.0));
    }

}
