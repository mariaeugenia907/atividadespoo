	public class Diarista extends Empregado 
	{

				public double calculaSalario() {
			return super.calculaSalario()/30;
		}
		
		public Diarista(double salarioi) {
			super(salarioi);
		
		}
		
	}