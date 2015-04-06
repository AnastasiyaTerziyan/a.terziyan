package ru.kpfu.itis.group11408.arhiveprogram;

public class Main {

	public static void main(String[] args) {
		Archiver zip = new Archiver();
		zip.unarchive("Start.zip");
		zip.archive("End.zip", new String[] { "Anastasiya.txt", "Kseniya.txt",
				"Egor.txt", "Mariya.txt", "Sergey.txt" });
	}

}
