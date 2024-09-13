package innlevering;
import static javax.swing.JOptionPane.showInputDialog;

public class O3 {

	public static void main(String[] args) {
		
		String nTxt = showInputDialog("Skriv positive heltall:");
		
		int n = Integer.parseInt(nTxt);
		int f = 1;
		
		while(n <= 0) {
			System.out.println("bare positive heltall!");
		}
		
		for(int i = 1; i<=n; i++) {
			
			f = f*i;
		}
		System.out.println(n + "! = " + f);
		}
	}


