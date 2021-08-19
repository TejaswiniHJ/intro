package exceptionhandlingtopic;
class MarriageException extends Exception{
	String msg;
	MarriageException(String msg)
	{
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
	}
public class Mainclass2 {
	static void submit()throws MarriageException
	{
		int age=14;
		if(age>=18){
			System.out.println("happy life");
		}
		else{
			throw new MarriageException("invalid age");
		}
	}
	public static void main(String[] args) {
		try{
			submit();
		}
		catch(MarriageException e)
		{
			System.out.println(e.getmsg());
			
		}
	}
}


