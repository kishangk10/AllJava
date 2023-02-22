package ChekedException;

class CartoverflowException extends Exception
{
	String msg;
	CartoverflowException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}
}
public class Amazoncart 
{
	static void cart() throws CartoverflowException
	{
		int cart = 19;
		if(cart <= 20)
			System.out.println("add to cart");
		else
			throw new CartoverflowException("remove one item and add");
		
	}
	public static void main(String[] args) throws CartoverflowException 
	{
		try{
		cart();
		}catch(CartoverflowException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
