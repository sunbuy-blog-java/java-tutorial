package generatetoken;

import java.sql.Timestamp;
import java.util.UUID;

public class Example3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(getToken());
		}
	}

	public static String getToken() {
		StringBuilder token = new StringBuilder();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		long currentTimeInMilisecond = timestamp.getTime();
		return token.append(currentTimeInMilisecond).append("-").append(UUID.randomUUID().toString()).toString();
	}
}
