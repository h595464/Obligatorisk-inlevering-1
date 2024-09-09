package no.hvl.dat100;
import javax.swing.JOptionPane;

public class O1 {
	public static void main(String[] args) {
		int skatt = Integer.parseInt(JOptionPane.showInputDialog("skriv inn et tall"));
		if (skatt >= 208050 && skatt <= 292850) {
			double skatt2 =skatt*0.017;
			int trunc = (int)skatt2;
			System.out.println("Skatt som må betales: " + trunc);
		}
		else if (skatt >= 292851 && skatt <= 670000) {
			double skatt2 =skatt*0.04;
			int trunc = (int)skatt2;
			System.out.println("Skatt som må betales: " + trunc);
		}
		else if (skatt >= 670001 && skatt <= 937900) {
			double skatt2 =skatt*0.136;
			int trunc = (int)skatt2;
			System.out.println("Skatt som må betales: " + trunc);
		}
		else if (skatt >= 937901 && skatt <=1350000) {
			double skatt2 =skatt*0.166;
			int trunc = (int)skatt2;
			System.out.println("Skatt som må betales: " + trunc);
		}
		else if (skatt >=1350001)	{
			double skatt2 =skatt*0.176;
			int trunc = (int)skatt2;
			System.out.println("Skatt som må betales: " + trunc);
		}
	}
}