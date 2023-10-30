package generatetoken;

import java.security.SecureRandom;
import java.util.Base64;

public class Example2 {
	private static final SecureRandom secureRandom = new SecureRandom();
	private static final Base64.Encoder base64Encoder = Base64.getUrlEncoder();

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(getToken());
		}
	}

	public static String getToken() {
		byte[] randomBytes = new byte[32];
		secureRandom.nextBytes(randomBytes);
		return base64Encoder.encodeToString(randomBytes);
	}
}
