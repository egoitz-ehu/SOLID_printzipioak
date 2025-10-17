package dip;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VATAmount;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	
	private DeductionCalculator d;
	private VATCalculator vat;
	
	public Bill(DeductionCalculator d, VATCalculator vat) {
		this.d=d;
		this.vat=vat;
	}
	
	public float getVATAmount() {
		return VATAmount;
	}

	public int getDeductionPercentage() {
		return deductionPercentage;
	}

	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		// Dedukzioa kalkulatu
		billDeduction = d.calcDeduction(billAmount ,deductionPercentage);
		// VAT kalkulatzen dugu
		VATAmount = vat.calcVAT(billAmount);
		// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction) + VATAmount;
	}
}
