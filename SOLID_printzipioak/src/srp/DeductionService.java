package srp;

public class DeductionService {
	private int deductionPercentage=5; // Edozein
	public float calculateDeduction(float billAmount) {
		if (billAmount >50000)
			 return (billAmount * deductionPercentage +5) / 100;
		else return (billAmount * deductionPercentage) / 100;
	}
}
