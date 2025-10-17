package dip;

public class VATImplementation implements VATCalculator {
	private double percentage = 0.16;
	@Override
	public float calcVAT(float billAmount) {
		return (float) (billAmount*percentage);	
	}

}
