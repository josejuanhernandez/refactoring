package insurance;

public class InsuranceQuote {

    private final Motorist motorist;

    public InsuranceQuote(Motorist motorist) {
        this.motorist = motorist;
    }

    public RiskFactor calculateRiskFactor() {
        if (motorist.getPointsOnLicense() <= 3 || motorist.getAge() < 25) return RiskFactor.High;
        if (motorist.getPointsOnLicense() <= 6) return RiskFactor.Moderate;
        return RiskFactor.Low;
    }

    public double calculatePremium(double insuranceValue) {
        RiskFactor riskFactor = calculateRiskFactor();
        switch (riskFactor) {
            case High:
                return insuranceValue * 0.6;
            case Moderate:
                return insuranceValue * 0.4;
            case Low:
            default:
                return insuranceValue * 0.2;
        }

    }
}
