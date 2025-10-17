package isp;

public class GmailAccount implements Emailable {
	String name, emailAddress;

	@Override
	public String getAddress() {
		return this.emailAddress;
	}

}
