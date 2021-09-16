import java.util.ArrayList;

public class Decode {
	public void stringToMorse(String s) {
		
		s = s.toLowerCase();
		
		char [] array = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			array[i] = s.charAt(i);
		} 
		
		String [] array2 = new String[s.length()];
		for(int i = 0; i < s.length(); i++) {
			array2[i] = Character.toString(array[i]);
		} 
		
		String [] array3 = new String[s.length()];
		for(int i = 0; i < s.length(); i++) {
			array3[i] = letters(array2[i]);
		} 
		
		for(int i = 0; i < s.length(); i++) {
			System.out.print(array3[i] + " ");
		} 
	}
	
	public void morseToString(String m) {
		String string = "";
		ArrayList<String> array = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		
		String temp = "";
		int next = 0;
		for(int i = 0; i < m.length(); i++) {
			if(m.charAt(i) == '.' || m.charAt(i) == '-' || m.charAt(i) == '/' ) {
				temp = temp + m.charAt(i);
			}
			if(m.charAt(i) == ' ' || i+1 == m.length()) {
				array.add(temp);
				next++;
				temp = "";
			}
		}
		
		for(int i = 0; i < array.size(); i++) {
			array2.add(morse(array.get(i)));
		}
		
		for(int i = 0; i < array.size(); i++) {
			System.out.print(array2.get(i));
		}
		
	}
	
	public String morse(String c) {
		String m = "";
		if(c.equals(".-")) {
			m = "a";
		}
		else if(c.equals("-...")) {
			m = "b";
		}
		else if(c.equals("-.-.")) {
			m = "c";
		}
		else if(c.equals("-..")) {
			m = "d";
		}
		else if(c.equals(".")) {
			m = "e";
		}
		else if(c.equals("..-.")) {
			m = "f";
		}
		else if(c.equals("--.")) {
			m = "g";
		}
		else if(c.equals("....")) {
			m = "h";
		}
		else if(c.equals("..")) {
			m = "i";
		}
		else if(c.equals(".---")) {
			m = "j";
		}
		else if(c.equals("-.-")) {
			m = "k";
		}
		else if(c.equals(".-..")) {
			m = "l";
		}
		else if(c.equals("--")) {
			m = "m";
		}
		else if(c.equals("-.")) {
			m = "n";
		}
		else if(c.equals("---")) {
			m = "o";
		}
		else if(c.equals(".--.")) {
			m = "p";
		}
		else if(c.equals("--.-")) {
			m = "q";
		}	
		else if(c.equals(".-.")) {
			m = "r";
		}
		else if(c.equals("...")) {
			m = "s";
		}
		else if(c.equals("-")) {
			m = "t";
		}
		else if(c.equals("..-")) {
			m = "u";
		}
		else if(c.equals("...-")) {
			m = "v";
		}
		else if(c.equals(".--")) {
			m = "w";
		}
		else if(c.equals("-..-")) {
			m = "x";
		}
		else if(c.equals("-.--")) {
			m = "y";
		}
		else if(c.equals("--..")) {
			m = "z";
		}
		
		else if(c.equals(".----")) {
			m = "1";
		}
		else if(c.equals("..---")) {
			m = "2";
		}
		else if(c.equals("...--")) {
			m = "3";
		}
		else if(c.equals("....-")) {
			m = "4";
		}
		else if(c.equals(".....")) {
			m = "5";
		}
		else if(c.equals("-....")) {
			m = "6";
		}
		else if(c.equals("--...")) {
			m = "7";
		}
		else if(c.equals("---..")) {
			m = "8";
		}
		else if(c.equals("----.")) {
			m = "9";
		}
		else if(c.equals("-----")) {
			m = "0";
		}
		else if(c.equals("/")) {
			m = " ";
		}
		return m;
	}
	
	public String letters(String c) {
		String m ="";
		if(c.equals("a")) {
			m = ".-";
		}
		else if(c.equals("b")) {
			m = "-...";
		}
		else if(c.equals("c")) {
			m = "-.-.";
		}
		else if(c.equals("d")) {
			m = "-..";
		}
		else if(c.equals("e")) {
			m = ".";
		}
		else if(c.equals("f")) {
			m = "..-.";
		}
		else if(c.equals("g")) {
			m = "--.";
		}
		else if(c.equals("h")) {
			m = "....";
		}
		else if(c.equals("i")) {
			m = "..";
		}
		else if(c.equals("j")) {
			m = ".---";
		}
		else if(c.equals("k")) {
			m = "-.-";
		}
		else if(c.equals("l")) {
			m = ".-..";
		}
		else if(c.equals("m")) {
			m = "--";
		}
		else if(c.equals("n")) {
			m = "-.";
		}
		else if(c.equals("o")) {
			m = "---";
		}
		else if(c.equals("p")) {
			m = ".--.";
		}
		else if(c.equals("q")) {
			m = "--.-";
		}	
		else if(c.equals("r")) {
			m = ".-.";
		}
		else if(c.equals("s")) {
			m = "...";
		}
		else if(c.equals("t")) {
			m = "-";
		}
		else if(c.equals("u")) {
			m = "..-";
		}
		else if(c.equals("v")) {
			m = "...-";
		}
		else if(c.equals("w")) {
			m = ".--";
		}
		else if(c.equals("x")) {
			m = "-..-";
		}
		else if(c.equals("y")) {
			m = "-.--";
		}
		else if(c.equals("z")) {
			m = "--..";
		}
		
		else if(c.equals("1")) {
			m = ".----";
		}
		else if(c.equals("2")) {
			m = "..---";
		}
		else if(c.equals("3")) {
			m = "...--";
		}
		else if(c.equals("4")) {
			m = "....-";
		}
		else if(c.equals("5")) {
			m = ".....";
		}
		else if(c.equals("6")) {
			m = "-....";
		}
		else if(c.equals("7")) {
			m = "--...";
		}
		else if(c.equals("8")) {
			m = "---..";
		}
		else if(c.equals("9")) {
			m = "----.";
		}
		else if(c.equals("0")) {
			m = "-----";
		}
		else if(c.equals(" ")) {
			m = "/";
		}
		else {
			m = "";
		}
		return m;
	}
}


