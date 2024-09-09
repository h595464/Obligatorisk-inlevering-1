package no.hvl.dat100;
import javax.swing.JOptionPane;

public class O3 {
	//bare for moro skyll x
	public static void main(String[]x)	{
		int z = 1;
		int n = Integer.parseInt(JOptionPane.showInputDialog("skriv inn et tall"));
		for (int i = 1; i<=n; i++)	{
			z*= i;
		}
		System.out.println(z);
	}
}
