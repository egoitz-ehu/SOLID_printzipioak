package srp;

public class VATService {
	public float calculateVAT(float amount, String code) {
		if(code.equals("0")) {
			return (float) (amount*0.16);	
		} else {
			return 0;
		}
	}
}
