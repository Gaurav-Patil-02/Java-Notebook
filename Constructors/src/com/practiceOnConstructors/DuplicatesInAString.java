package com.practiceOnConstructors;

public class DuplicatesInAString {

	public DuplicatesInAString() {
		String str = "ahfbdafh";
		boolean isOccured[] = new boolean[str.length()];

		for (int i = 0; i < str.length(); i++) {
			
			if (isOccured[i])
				continue;
			
			char currentChar = str.charAt(i);
			int count = 0;
			
			for (int j = i + 1; j < str.length(); j++) {

				if (currentChar == str.charAt(j)) {
					
					count++;
					isOccured[j] = true;
				}
			}
			if (count > 0) {
				System.out.println(currentChar + " is an duplicate character");
			}

		}
	}
}
