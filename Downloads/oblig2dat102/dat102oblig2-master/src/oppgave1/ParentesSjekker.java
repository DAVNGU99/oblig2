package oppgave1;

import java.util.Set;

public class ParentesSjekker {
	
	private static final Set<Character> STARTPARENTESER = Set.of('{', '(', '[', '<');
	private static final Set<Character> SLUTTPARENTESER = Set.of('}', ')', ']', '>');
	private static final Set<String>    PARENTESPAR = Set.of("{}", "()", "[]", "<>");
	
	public static boolean sjekkParenteser(String s) {
		
		StabelADT<Character> stabel = new TabellStabel<>();
		char currentChar = ' ';
		
		for(int index = 0; index < s.length(); index++) {
			currentChar = s.charAt(index);
			if (erStartParentes(currentChar)) {
				stabel.push(currentChar);
			}
			if (erSluttParentes(currentChar)) {
				if (!stabel.isEmpty() && erParentesPar(stabel.peek(),currentChar)) {
					stabel.pop();
				} else {
					return false; // ikkje sortert
				}
			}
		}	
		return stabel.isEmpty();
	}

	private static boolean erStartParentes(char c) {
		if(STARTPARENTESER.contains(c)) {
			return true;
		}
		return false;
	}
	
	private static boolean erSluttParentes(char c) {
		if(SLUTTPARENTESER.contains(c)) {
			return true;
		}
		return false;
	}
	
	private static boolean erParentesPar(char start, char slutt) {
		String parentespar = "" + start + slutt;
		if(PARENTESPAR.contains(parentespar)) {
			return true;
		}
		return false;
	}
}
