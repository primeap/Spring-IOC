package lab1;

public class A {
	private int a;
	private String msg;

	public A() {

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void showA(){
		System.out.println("A.showA()");
		System.out.println(a);
		System.out.println(msg);
	}
}
