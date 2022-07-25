package com.fdmgroup.algo_ex_2;

public class Qn1 {

	public void encryptingDevice(String word) {
		String encoded = "";

		int i = 1;
		for (char ch : word.toCharArray()) {
			//blank space
			if (ch == ' ') {
				encoded += ch;
				// even position
			} else if (i % 2 == 0) {
				// to find the shifting for those position more than 26
				int i2 = i - (26 * Math.floorDiv(i, 26));
				// capital letter change to small letter
				if (ch > 64 && ch < 91) {
					ch += 32;
					// For capital letter :
					// account for those than goes below 97 aka before a
					if ((ch - i2) < 97) {
						encoded += ((char) (ch + 26 - i2));
					} else
						encoded += ((char) (ch - i2));
				}
				// those in position multiples of 26
				else if (i % 26 == 0) {
					encoded += ((char) (ch));
					// account for those goes below 97
				} else if ((ch - i2) < 97) {
					encoded += ((char) (ch + 26 - i2));
				}

				else {
					encoded += ((char) (ch - i));
				}
				//odd number
			} else if (i % 2 == 1) {
				int i2 = i - (26 * Math.floorDiv(i, 26));
				if (ch > 64 && ch < 91) {
					ch += 32;
					if ((ch + i2) > 122) {
						encoded += ((char) (ch - 26 + i2));
					}
					else
						encoded += ((char) (ch + i2));
				} else if ((ch + i2) > 122) {
					encoded += ((char) (ch - 26 + i2));
				} else
					encoded += ((char) (ch + i2));
			}
			i++;
		}

		System.out.println(word);
		System.out.println(encoded.toString());
	}
}
