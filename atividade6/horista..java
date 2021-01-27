	public class Horista extends Diarista {
		
		public double calculaSalario() {
			return super.calculaSalario()/24;
		}

		public Horista(double salarioi) {
			super(salarioi);
		
	}
}
