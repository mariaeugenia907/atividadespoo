public class ProdutoPerecivel extends Produto {

		LocalDate Validade;
		
		ProdutoPerecivel(int codigo, 
				String descricao, 
				double valor, 
				int quantidade, 
				LocalDate Validade) {
			super(codigo, descricao, valor, quantidade);
			this.Validade = Validade;
		}
		
		boolean Valido() {
			
			if (Validade.isAfter(LocalDate.now())) {
				return true;
			} else {
				return false;
			}
			
		
			
		}
		

	}