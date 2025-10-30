package srp;

public class VATService {
	private double percentage = 0.16;
	public float calculateVAT(float amount, String code) {
		if(!code.equals("0")) {
			return (float) (amount*percentage);	
		} else {
			return 0;
		}
	}
}
