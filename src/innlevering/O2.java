package innlevering;
import static javax.swing.JOptionPane.showInputDialog;

public class O2 {

	public static void main(String[] args) {
		
		String inntektTxt = showInputDialog("inntekt i 2024;");
		
		int inntekt = Integer.parseInt(inntektTxt);
		
		int minInntekt = 208050;
		
		if (inntekt <= minInntekt) {
			System.out.println("du trenger ikke betale trinn skatt!");
			System.out.println("inntekten din er " + inntekt + " kr");
		}else {
			
			Trinn(inntekt,208051, 292850, 1.7);
			Trinn(inntekt,292851, 670000, 4.0);
			Trinn(inntekt,670001, 937900, 13.6);
			Trinn(inntekt,937901, 1350000, 16.6);
			Trinn5(inntekt);
		}
		
			
	}
	
	public static void Trinn(int inntekt, int min, int maks, double prosent) {
		
		double betale = (prosent * inntekt) /100;
		
		double i = inntekt - betale;
		
		if (inntekt >= min && inntekt <= maks ) {
			
			System.out.println("bruttoinntekten din er " + inntekt + " kr");
			System.out.println("du må betale " + betale + " kr i trinnskatt");
			System.out.println("du har " + i + " kr igjen");
		}
		
	}
	
	
	public static void Trinn5(int inntekt) {
		
		int min = 1350001;
		
		double betale = (17.6 * inntekt) /100;
		
		double i = inntekt - betale;
		
		if (inntekt >= min) {
			
			System.out.println("bruttoinntekten din er " + inntekt + " kr");
			System.out.println("du må betale " + betale + " kr i trinnskatt");
			System.out.println("du har " + i + " kr igjen");
		}
		
	}
}
