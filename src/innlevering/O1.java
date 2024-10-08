package innlevering;
import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

	public static void main(String[] args) {
		
		String poengTxt = showInputDialog("poeng du fikk på prøven: ");
		
		int poeng = Integer.parseInt(poengTxt);
		
		if(poeng < 0 || poeng > 100) {
			System.out.println("error");
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