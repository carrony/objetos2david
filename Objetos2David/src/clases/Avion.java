package clases;

public class Avion {
	
	// estado
	private String fabricante;
	private int numMotores;
	
	public Avion() {
		setFabricante("");
		setNumMotores(0);
	}
	
	public Avion ( String fabricante, int numMotores) {
		setFabricante(fabricante);
		setNumMotores(numMotores);
	}
	
	public Avion(Avion copia) {
		this.setFabricante(copia.fabricante);
		this.setNumMotores(copia.numMotores);
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}
	
	public void imprimirFabricante() {
		System.out.println("Fabricante: "+this.fabricante);
	}
	
	public void cambiarFabricante(Avion a) {
		this.setFabricante(a.getFabricante());
	}
	
	

}
