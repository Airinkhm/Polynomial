import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("ok");
		System.out.println("Enter Polynomials:");
		Scanner myScanner = new Scanner(System.in);
		String inputString1 = myScanner.nextLine();
		String inputString2 = myScanner.nextLine();
		

		String[] inputArray1 = inputString1.split(" ");
		String[] inputArray2 = inputString2.split(" ");
		
		Sentence[] polynomial1 = new Sentence[inputArray1.length];
		Sentence[] polynomial2 = new Sentence[inputArray2.length];
		
		for (int i = 0; i < inputArray1.length; i++) {
			Sentence s = new Sentence();
			s.extract(inputArray1[i]);
			polynomial1[i] = s;
		}
		
		for (int i = 0; i < inputArray2.length; i++) {
			Sentence s = new Sentence();
			s.extract(inputArray2[i]);
			polynomial2[i] = s;
		}
		
		printPolynomial(polynomial1);
//
//		Sentence polynomial1 = new Sentence();
//		polynomial1.extractPolynomial();

	}
	
	private static void printPolynomial(Sentence[] polynomial){
		String result = "";
		for (int i = 0; i < polynomial.length; i++) {
			Sentence s = polynomial[i];
			if(s.coefficient > 0 && i > 0){
				result += "+";
			}
			result += s.toString() + " ";
		}
		System.out.println(result);
	}
}
