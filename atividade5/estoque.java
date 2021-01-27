public class Estoque {
		private ArrayList<Produto> produtos;
		
		public Estoque() {
			produtos = new ArrayList<Produto>();
		}
		
		void inserir(Produto prod) {
			if (consultar(prod) == null && consultarPorNome(prod) == null) {
				produtos.add(prod);
			} else {
				System.out.println("existe.");
			}
		}
		
		Produto consultar(Produto produto) {
			Produto resultado = null;
			if (produtos.contains(produto)) {
				resultado = produtos.get(produtos.indexOf(produto));
			} 

			return resultado;
		}
		
		private Produto Produto (int codigo1) {
			return consultar(new Produto(codigo1, null, 00,00));
		}
		
		Produto consultarPorNome(Produto produto) {
			Produto resultado = null;
			for (Produto p: produtos) {
				if (p.desc.equals(produto.desc)) {
					resultado = p;
					break;
				}
			}
			
			return resultado;
		}
}