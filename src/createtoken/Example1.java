package generatetoken;

import java.time.Instant;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example1 {
	public static void main(String[] args) {

		Supplier<String> tokenSupplier = () -> {
			StringBuilder token = new StringBuilder();
			long currentTimeInMilisecond = Instant.now().toEpochMilli();
			return token.append(currentTimeInMilisecond).append("-").append(UUID.randomUUID().toString()).toString();
		};
		Stream.generate(tokenSupplier).limit(5).forEach(System.out::println);
	}
}
