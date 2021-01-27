public class Postagem {
	int id;
	String texto;
	int curtidas;
	String textoq;
	int qntcurtidas;
	
	void curtir() {
		curtidas++;
		qntcurtidas++;
	}
	
	public String toString() {
		return "Texto: "+ texto + "curtidas: " +curtidas;
		return "Texto "+ textoq + "qntcurtidas " + qntcurtidas;
	}
}