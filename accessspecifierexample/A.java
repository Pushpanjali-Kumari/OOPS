package accessspecifierexample;

public class A {
private int a;
private int b;
private int c;
private int d;
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
public int getC() {
	return c;
}
public void setC(int c) {
	this.c = c;
}
public int getD() {
	return d;
}
public void setD(int d) {
	this.d = d;
}
public void methodOne() {
	System.out.println("in private method..");
}
	public void methodTwo() {
		System.out.println("in private method..");
	
}

}
