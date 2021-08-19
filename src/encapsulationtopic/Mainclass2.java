package encapsulationtopic;
class Internetbanking
{
	private String pwd="AABBCC";

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
public class Mainclass2 {
public static void main(String[] args) {
	Internetbanking I1=new Internetbanking();
	System.out.println(I1.getPwd());
	I1.setPwd("Teju@18");
	System.out.println(I1.getPwd());
}
}
