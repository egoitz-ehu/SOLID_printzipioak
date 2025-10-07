package ocp;

public class AppleService implements IService {

	@Override
	public boolean signIn(String log, String pass) {
		// use Apple API
		return true;
	}

}
