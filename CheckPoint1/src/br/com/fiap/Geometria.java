// Marco Antonio L. Martinez Filho - 1 TDSVJ - Manhã


package br.com.fiap;

public class Geometria {

	private float lado;
	private float altura;
	private double raio;
	
	
	
	
		
		public void calcularAreaQuadrado (float lado) {		
		}
	
			
		public float getLado() {
				return lado;
		}

		public void setBase(float lado) {

			
	try {
		
		System.out.println("O resultado do Quadrado é: " + lado * altura);

		
		if (lado >= 0 && lado <= 100) {
			this.lado = lado;
		} else {
			throw new Exception ("Base fora da faixa permitida (0 a 100)");
		}
		
	} 
	
	catch (Exception e) {
		System.out.println(e.getMessage());         }
	}

	

		
		//___________________________________________________________________________________________________
	
		
		
		
		
		public void calcularAreaRetangulo (float lado, float altura) {
			
		}
			
			public float getLado() {
				return lado;
			}

			public void setLado(float lado) {
				
			}
			
			public float getAltura() {
				return altura;
			}

			public void setAltura(float altura) {
			
	try {
		System.out.println("O resultado do Retângulo é: " + lado * altura);

		if (lado >= 0 && lado <= 100 && altura >= 0 && altura <= 100) {
			this.lado = lado;
		} else {
			throw new Exception ("Base fora da faixa permitida (0 a 100)");
		}
				} catch (Exception e) {
				System.out.println(e.getMessage());         }
		}
	

		
		
		//___________________________________________________________________________________________________
		
		
		
		
		
		public void calcularAreaTriangulo (float lado, float altura) {
		}
		
		public float getlado() {
			return lado;
		}

		public void setlado(float lado) {
			
		}
		
		public float getaltura() {
			return altura;
		}

		public void setaltura(float altura) {
		
			
	try {
		System.out.println("O resultado do Triângulo é: " + (lado * altura) /2);

		if (lado >= 0 && lado <= 100 && altura >= 0 && altura <= 100) {
			this.lado = lado;
			this.altura = altura;
		} else {
			throw new Exception ("Base fora da faixa permitida (0 a 100)");
		}
						
				} catch (Exception e) {
						System.out.println(e.getMessage());         }
				}	
		

		
		
		//___________________________________________________________________________________________________
		
		
		
		
		
		public void calcularAreaCirculo (double lado) {	
		}
		
		public double getlado() {
			return lado;
		}

		public void setlado(double lado) {
		
			
		try {
			
			final double PI = 3.14;

			System.out.println("O resultado do Raio é: " + PI * raio * raio);

			if (raio >= 0 && raio <= 100) {
				this.raio = raio;
		} else {
				throw new Exception ("Base fora da faixa permitida (0 a 100)");
		}
								
				} catch (Exception e) {
								System.out.println(e.getMessage());         }
							
						

		
		
		
		//___________________________________________________________________________________________________
		
		
		
		
						

		}
	}

