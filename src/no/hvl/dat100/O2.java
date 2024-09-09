package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			int karakter = Integer.parseInt(JOptionPane.showInputDialog("skriv inn et tall"));
			if (karakter <= 100 && karakter >= 90) {
				System.out.println("Karakteren din er A");
			} else if (karakter <= 89 && karakter >= 80) {
				System.out.println("Karakteren din er B");
			} else if (karakter <= 79 && karakter >= 60) {
				System.out.println("Karakteren din er C");
			} else if (karakter <= 59 && karakter >= 50) {
				System.out.println("Karakteren din er D");
			} else if (karakter <= 49 && karakter >= 40) {
				System.out.println("Karakteren din er E");
			} else if (karakter <= 39 && karakter >= 0) {
				System.out.println("Karakteren din er F");
			} else {
				System.out.print("Du skrev ikke et tall mellom 100 og 0");
				i = i - 1;
			}
		}

	}
}
