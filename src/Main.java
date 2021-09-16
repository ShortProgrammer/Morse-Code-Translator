
public class Main {

	public static void main(String[] args) {
		Decode decode = new Decode();
		//for now single words
		String test = "It's a me Mario";
		String test2 = ".. - .----. ... / .- / -- . / -- .- .-. .. ---";
		//decode.stringToMorse(test);
		System.out.println(".... . .-.. .-.. --- / - .... . .-. .");
		System.out.println();
		decode.morseToString(test2);
	}

}
