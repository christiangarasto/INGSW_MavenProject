package randomStringGeneratorMaven;

import java.util.Random;

public class RandomStringGenerator {

	public String[] randomStrings() {
		RandomString rs = new RandomString();
		
		String[] randomStrings = new String[10];
			for(int i = 0; i < 10; i++) {
				randomStrings[i] = rs.randomString(new Random().nextInt(10));
			}
	return randomStrings;
	}
	
}
