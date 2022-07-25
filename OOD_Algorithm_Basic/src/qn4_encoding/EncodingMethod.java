package qn4_encoding;

public class EncodingMethod {

	public void encodingDevice(String word) {

		int shift = 1;
		String encoded = "";

		int i = 1;
		for (char ch : word.toCharArray()) {
			// check for whitespace
			if (ch == ' ') {
				encoded += ch;
				// check if the number is at even position
			} else if (i % 2 == 0) {

//				encoded += ((char) ('a' + (ch - 'a' - shift) % 26));
				if (ch == 'a') {
					encoded += ((char) ('z'));
				} else {
					encoded += ((char) (ch - shift));
				}
				// modulus 26 to ensure that if it is the last alphabet such as a or z, it will
				// provide a remainder of 0
				// and allow the value to be added to a to produce a
//				System.out.println(ch);
				// check if number is at odd position
			} else if (i % 2 == 1) {
//				encoded += ((char) ('a' + (ch - 'a' + shift) % 26));
				if (ch == 'z') {
					encoded += ((char) ('a'));
				} else {
					encoded += ((char) (ch + shift));
				}
			}
			i++;

		}
		System.out.println(word);
		System.out.println(encoded.toString());
	}

}
