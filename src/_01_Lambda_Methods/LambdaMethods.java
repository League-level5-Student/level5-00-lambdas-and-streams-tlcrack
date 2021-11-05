package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String sw = s;
			s = "";
			for(int i = 0; i < sw.length(); i++) {
				s += sw.charAt(sw.length()-i-1);
			}
			System.out.println(s);
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String f = s;
			s = "";
			for(int i = 0; i < f.length(); i++) {
				if(i%2==0) {
					String d = f.substring(i, i+1).toUpperCase();
					s += d;
				}
				else {
					String d = f.substring(i, i+1).toLowerCase();
					s += d;
				}
			}
			System.out.println(s);
		}, "Alternate capitalization");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String f = s;
			s = "";
			for(int i = 0; i < f.length(); i++) {
				s+=f.charAt(i);
				s+='.';
			}
			System.out.println(s);
		}, "Periods in between characters");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String z = s;
			s = "";
			for(int i = 0; i < z.length(); i++) {
				if(z.charAt(i)!='a'&&z.charAt(i)!='e'&&z.charAt(i)!='i'&&z.charAt(i)!='o'&&z.charAt(i)!='u'&&z.charAt(i)!='y') {
					s+=z.charAt(i);
				}
			}
			System.out.println(s);
		}, "No vowels at all. Not a single one.");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
