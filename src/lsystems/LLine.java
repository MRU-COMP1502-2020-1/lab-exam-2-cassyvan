package lsystems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LLine {
	
	char line[];
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		ArrayList<Character> list = new ArrayList<Character>();
		if(line.length == 0) {
			throw new LSystemLengthException("No list to process");
		}
		for(char currC : line) {
			addFromArray(currC, list);
		}
		this.line = listToArray(list);
	}
	
	private void addFromArray(char currC, List<Character> list) throws LSystemSymbolException {
		boolean matchFound = false;
		for(LRule currRule : rules) {
			if(currC == currRule.getMatch()) {
				matchFound = true;
				char body[] = currRule.getBody();
				for(char c : body) {
					list.add(c);
				}
			}
		}
		if(!matchFound) {
			throw new LSystemSymbolException();
		}
	}
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
