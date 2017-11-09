import java.util.Random;

public class RandomString {

	private char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	
	/**
	 * Build a random string
	 * @param l: length of the random String
	 * @return a random String of a given length
	 */
	
	public String random(int l) {
		String random = "";
		for(int i = 0; i < l; i++) {
			random += chars[new Random().nextInt(25)];
		}
	return random;
	}
	
}
