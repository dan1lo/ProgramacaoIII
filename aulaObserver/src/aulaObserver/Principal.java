package aulaObserver;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programador p = new Programador();
		Gerente g = new Gerente(p);
		RH rh = new RH(p);
		
		System.out.println("vamos colocar presen�a no programador");
		p.setPresenca("p");
		System.out.println("vamos colocar falta no programador");
		p.setPresenca("f");
	}

}
