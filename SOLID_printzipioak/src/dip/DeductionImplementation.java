package dip;

public class DeductionImplementation implements DeductionCalculator {

	@Override
	public float calcDeduction(float billAmount, float deductionPercentage) {
		if (billAmount >50000)
			 return (billAmount * deductionPercentage +5) / 100;
		else return (billAmount * deductionPercentage) / 100;
	}

}
