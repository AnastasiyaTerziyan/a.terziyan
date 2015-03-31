package ru.kpfu.itis.group11408.terziyan.encodings;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) {

		Charset vinCharset = Charset.forName("windows-1251");

		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("out.txt"), vinCharset))) {
			String text = "Good bye, Anastasiya!";
			writer.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream("out.txt")))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
