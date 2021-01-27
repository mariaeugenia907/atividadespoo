
public class Produto {
	int codigo1;
	String desc;
	double valor;
	int quant;
	

	Produto(int codigo, String descricao, double valor, int quantidade) 
	{
		this.codigo1 = codigo;
		this.desc = descricao;
		this.valor = valor;
		this.quant = quantidade;
}

	void baixar(int quantidade) 
	{
		this.quant -= quantidade;

	}

	void repor(int quantidade) 
	{
		this.quant += quantidade;
	}

	
	public boolean equals(Object produto) {

		boolean resultado = false;

		if (produto instanceof Produto)
			resultado = this.codigo1 == ((Produto) produto).codigo1;
		
		return resultado;
	}
}