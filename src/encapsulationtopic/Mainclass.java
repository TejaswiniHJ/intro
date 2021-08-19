package encapsulationtopic;
class Trolleybag
{
	private int pwd=4567;

	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
}
public class Mainclass {
public static void main(String[] args) {
	Trolleybag t1=new Trolleybag();
	System.out.println(t1.getPwd());
	t1.setPwd(1101);
	System.out.println(t1.getPwd());
}
}
