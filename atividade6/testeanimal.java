public class Testeanimal {
	

		public static void main(String[] args) {
			Animal b = new Bovino();
			((Bovino) b).setLeite(5);
			System.out.println(((Bovino) b).getLeite());

			Animal[] animais = new Animal[8];
			animais[0] = new Animal(); 	animais[1] = new Animal();
			animais[2] = new Bovino(); animais[3] = new Bovino(); animais[4] = new Bovino();
			animais[5] = new Peixe(); animais[6] = new Peixe(); animais[7] = new Peixe();

			for (int i = 0; i < animais.length; i++) {
				if (animais[i] instanceof Animal) {
					System.out.println("Animal");
				} 
								if (animais[i] instanceof Bovino) {
					System.out.println("Bovino");
				} 
				
				if (animais[i] instanceof Peixe) {
					System.out.println("Peixe");
				}	
			}
		}
	}