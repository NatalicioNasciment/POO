package acoplamento;

public class A extends B{
	public int incrementa(B b){
		b.setX(b.getX() + 1);
		
		return getX();
	}
}
