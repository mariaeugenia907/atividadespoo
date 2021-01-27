public class Veiculo {
	public class Carro extends Veiculo{
		String model;
		
	public Carro(String placa, int anop, String model) {
		super(placa , anop);
		this.model=model;
	}
	}
}