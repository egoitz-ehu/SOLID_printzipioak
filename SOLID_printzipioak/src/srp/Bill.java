package srp;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public float vat;
	
	
	public void totalCalc() {
		DeductionService deductionService = new DeductionService();
		VATService vatService = new VATService();
		billDeduction = deductionService.calculateDeduction(billAmount);
		vat = vatService.calculateVAT(billAmount,code);
		billTotal = (billAmount-billDeduction)+VAT;
	}
}
