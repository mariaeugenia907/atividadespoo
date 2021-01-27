	public class TestaEmpregado {
		
		public static void main(String[] args) 
		{
			Empregado a = new Empregado(1600);
			System.out.println(a.calculaSalario());
			
			Diarista b = new Diarista(1600);
			System.out.println(b.calculaSalario());
			
			Horista c = new Horista(1600);
			System.out.println(c.calculaSalario());		
		}
	}
