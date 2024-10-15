package innlevering;
import static javax.swing.JOptionPane.showInputDialog;

public class O1c {

	public static void main(String[] args) {
		
		for(int i = 0; i <2; i++) {
		
		String poengTxt = showInputDialog("poeng du fikk på prøven: ");
		
		int poeng = Integer.parseInt(poengTxt);
		
			
			if(poeng < 0 || poeng > 100) {
				i = i -1;
				System.out.println("error, prøv igjen");
			}else if (poeng <=39 && poeng >= 0) {
				System.out.println("du fikk en karakter F");
			}else if (poeng <= 49 && poeng >= 40) {
				System.out.println("du fikk en karakter E");
			}else if (poeng <= 59 && poeng >= 50) {
				System.out.println("du fikk en karakter D");
			}else if (poeng <= 79 && poeng >= 60) {
				System.out.println("du fikk en karakter C");
			}else if (poeng <= 89 && poeng >= 80) {
				System.out.println("du fikk en karakter B");
			}else if (poeng <= 100 && poeng >= 90) {
				System.out.println("du fikk en karakter A");
			}
		}
	}

}