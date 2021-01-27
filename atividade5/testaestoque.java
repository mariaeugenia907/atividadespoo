public class TestaEstoque {

		public static void main(String[] args) {
			Produto p = new Produto(1, "refri", 2.00, 15);
			
			LocalDate datai = LocalDate.of(2020, 11, 10);
			ProdutoPerecivel p1 = new ProdutoPerecivel(2, "queijo", 9.00, 100, datai);
			LocalDate dataii = LocalDate.of(2020, 11, 06);
			ProdutoPerecivel p2 = new ProdutoPerecivel(3, "presunto", 4.00, 50, dataii);
			
			System.out.println(p1.Valido());
			System.out.println(p2.Valido());
			
			Estoque estoque = new Estoque();
			estoque.inserir(p); estoque.inserir(p1); estoque.inserir(p2);
			
			Produto produtoProcurado = estoque.consultar(p1);
			System.out.println(produtoProcurado.desc);
			
			estoque.excluir(p);
			Produto produtoProcurado2 = estoque.consultar(p);
			if (produtoProcurado2 == null) {
				System.out.println("não consta");
			} else {
				System.out.println("não constara?");
			}
			
			estoque.inserir(p1);
			ProdutoPerecivel p3 = new ProdutoPerecivel(0, "goiabada" , 0, 0, null);
			estoque.inserir(p3);
			
			System.out.println(p1.quant);
			estoque.repor(4, 10);
			System.out.println(p1.quant);
			
			p1.equals("no");
		}

	}