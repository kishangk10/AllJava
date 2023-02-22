package ChekedException;

import java.util.Scanner;

public class JobSkill {
	static void skils(String str) throws SkilNotMatchingException {
		// String str = "sql";
		if (str.equals("java"))

			System.out.println("you are able to apply this job");
		else
			throw new SkilNotMatchingException("you should know java to apply");
	}

	public static void main(String[] args) throws SkilNotMatchingException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your skill");
		String str = sc.nextLine();
		try {
			// skils();
			skils(str);
		} catch (SkilNotMatchingException e) {
			System.out.println(e.getMessage());
		}

	}
}

class SkilNotMatchingException extends Exception {
	String msg;

	SkilNotMatchingException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}
