package ocp;

public class AuthService {
	private IService service;
	
	public AuthService(IService service) {
		this.service=service;
	}
	
	public boolean signIn(String log, String pass) {
		return service.signIn(log, pass);
	}
}