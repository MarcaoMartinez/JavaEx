package br.com.fiap;

public class RadioEncapsulada {
		
		private int volume;
		private float estacao;
		
		public void aumentarVolume() {
			if (volume < 100) {
				volume++;
			}	
		}
	
		public void diminuirVolume()  {
			if (volume > 0) {
				volume--;	
			}
		}
		
		// método GET pega o dado para o atributo Volume
		
		public int getVolume() {
			return volume;
		}
		
		// método SET para definir o valor que eu quero para o atributo Estacao

		public void setVolume(int volume) {
			try {
				if (volume >= 0 && volume<= 100) {
					this.volume = volume;
				} else {
					throw new Exception("Volume fora da faixa permitida (0 a 100)");

				}
			} catch (Exception e) {
				System.out.println(e.getMessage());			}
		}

		// método GET do atributo estacao
		
		public float getEstacao() {
			return estacao;
		}
		
		
		// método SET do atributo estacao

		
		public void setEstacao(float estacao) {
			try {
				if (estacao >= 80.0f && estacao <= 105.0f) {
					this.estacao = estacao;
					
				} else {
					throw new Exception("Estação fora da faixa permitida (80.0 a 105.0)");
				}
			
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		// método mostrar 
		
		public void mostrar() {
			System.out.println("Volume: " + getVolume() + "\nEstação: " + getEstacao ());
		}
		
}
