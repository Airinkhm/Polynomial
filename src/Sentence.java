public class Sentence {

	int degree;
	int coefficient;

	public void extract(String input) {
		input = input.toUpperCase();
		if (input.contains("X^")) {
			String[] splited = input.split("X\\^");
			coefficient = Integer.parseInt(splited[0]);
			degree = Integer.parseInt(splited[1]);
		} else if (input.contains("X")) {
			String[] splited = input.split("X");
			coefficient = Integer.parseInt(splited[0]);
			degree = 1;
		} else {
			coefficient = Integer.parseInt(input);
			degree = 0;
		}
	}

	@Override
	public String toString() {
		if (degree > 1) {
			return coefficient + "X^" + degree;
		} else if(degree == 1){
			return coefficient + "X";
		} else{
			return String.valueOf(coefficient);
		}
	}
}
