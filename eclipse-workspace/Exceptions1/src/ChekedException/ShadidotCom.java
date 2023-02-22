package ChekedException;

class MarrageException extends Exception {
	String msg;

	MarrageException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}

public class ShadidotCom {
	static void submit() throws MarrageException {
		int age = 20;
		if (age >= 21)
			System.out.println("Happy Life");
		else
			throw new MarrageException("Invalid age");
	}

	public static void main(String[] args) {
		try {
			submit();
		} catch (MarrageException e) {
			System.out.println(e.getMessage());
		}
	}
}
