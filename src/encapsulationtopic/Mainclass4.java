package encapsulationtopic;
class ESS
{
	private String pwd="18-02-94";

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
public class Mainclass4 {
public static void main(String[] args) {
	ESS e1=new ESS();
	System.out.println(e1.getPwd());
	e1.setPwd("18-07-94");
	System.out.println(e1.getPwd());
}
}
