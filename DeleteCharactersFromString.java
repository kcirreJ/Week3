package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	public String str;

	public void run() {
		
		while (true) {
			this.str = readLine("Decrypt: ");
			println(removeAllOccurrences(str));	
		}
	}

	public String removeAllOccurrences(String str) {
		str = this.str;
		str = str.replace("Q" , "");
		return str;
	}


		
}