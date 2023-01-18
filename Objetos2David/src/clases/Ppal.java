package clases;

public class Ppal {

	public static void main(String[] args) {
		
		Avion a1 =  new Avion("Airbus", 4);
		
		Avion a2 = new Avion();
		a2.setFabricante("Lookheed");
		a2.setNumMotores(4);
		
		System.out.println("El avion a1 es: ");
		a1.imprimirFabricante();
		System.out.println("Numero de motores: "+a1.getNumMotores());
		
		System.out.println("El avion a2 es: ");
		a2.imprimirFabricante();
		System.out.println("Numero de motores: "+a2.getNumMotores());
		
		a1.setFabricante("Apache");
		System.out.println("El avion a1 es: ");
		a1.imprimirFabricante();
		System.out.println("Numero de motores: "+a1.getNumMotores());
		
		a1.cambiarFabricante(a2);
		System.out.println("El avion a1 es: ");
		a1.imprimirFabricante();
		System.out.println("Numero de motores: "+a1.getNumMotores());
		
		
		Avion a3 = new Avion(a1);
		System.out.println("El avion a3 es: ");
		a3.imprimirFabricante();
		System.out.println("Numero de motores: "+a3.getNumMotores());
		
		a3.setFabricante("Atheneo");
		a3.imprimirFabricante();
		a1.imprimirFabricante();
		
		Avion a4 = a1;
		a4.setFabricante("Otro");
		System.out.println("Fabricante a4 ");
		a4.imprimirFabricante();
		System.out.println("Fabricante a1 ");
		a1.imprimirFabricante();
		
	}

}
