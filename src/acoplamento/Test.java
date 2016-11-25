package acoplamento;

public class Test {

	public static void main(String[] args) {
		B b = new B();
		b.setX(10);
		System.out.println("O valor de B é : " + b.getX());
		
		A a = new A();
		a.setX(b.getX() + 1);
		
		System.out.println("O valor de B é : " + a.getX());
	}

}
