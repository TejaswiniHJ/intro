package encapsulationtopic;
class Lotus
{
	private String pwd="AP123Q";

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
public class Mainclass3 {
public static void main(String[] args) {
	Lotus l1=new Lotus();
	System.out.println(l1.getPwd());
	l1.setPwd("ZZ22ZZ");
	System.out.println(l1.getPwd());
}
}
