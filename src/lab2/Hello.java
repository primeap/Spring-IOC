package lab2;

public class Hello {
	private A aObject;
	private B bObject;

	public Hello(B b) {
		this.bObject = b;
	}

	public A getaObject() {
		return aObject;
	}

	public void setaObject(A aObject) {
		this.aObject = aObject;
	}

	public B getbObject() {
		return bObject;
	}

	public void setbObject(B bObject) {
		this.bObject = bObject;
	}

	public void show() {
		System.out.println("Hello.show()");
		aObject.showA();
		bObject.showB();
	}
}
