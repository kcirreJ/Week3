package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
		while (true) {
			String digits = readLine("Enter a numeric string: ");
			if (digits.length() == 0) break;
			println(addCommasToNumericString(digits));
		}
	}

	private String addCommasToNumericString(String digits) {
	
		if(digits.length() < 4) {
			
			return digits;
			
			}else{
				
			return addCommasToNumericString
					(digits.substring(0, digits.length() - 3)) + "," +
					(digits.substring(digits.length() - 3, digits.length()));
			
		}
	}
}