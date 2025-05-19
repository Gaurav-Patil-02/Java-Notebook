package com.throwskeyword;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {
	public void readFile() throws IOException {
		FileInputStream fs = new FileInputStream("d://text.txt");

	}
	public static void main(String[] args) {
		FileReader fl = new FileReader();
		try {
			fl.readFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
