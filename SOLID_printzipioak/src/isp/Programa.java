package isp;

public class Programa {

	public static void main(String[] args) {
		GmailAccount gA = new GmailAccount();
		EmailSender.sendEmail(gA, "Mezua");
		
		// Errorea ematen du:
		// The method sendSMS(SMSable, String) in the type SMSSender is not applicable for the arguments (GmailAccount, String)
		// SMSSender.sendSMS(gA, "mezua");
	}

}
