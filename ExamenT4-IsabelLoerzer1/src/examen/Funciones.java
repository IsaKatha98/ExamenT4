package examen;

public class Funciones {
	
	//Declaramos las variables.
	static final int TAMCIRCUITO= 11; //Variable constante que especifica el tamaño del tablero.
	static int fichaJ1=0, fichaJ2=0;//Variables globales estáticas que indican la ficha de cada jugador.
	static int minDado, maxDado; //Variable globales estáticas que indican el número de caras del dado.
	
	//Función que tira los dados.
	public static int tiraDados () {
		
		int numRandom=0;
		
		//Generamos un número aleatorio cuyo máximo será maxDado y cuyo mínimo será minDado.
		numRandom= (int) (Math.random()*(maxDado-minDado)+minDado);
		
		//Devolvemos el resultado.
		return numRandom;
		
	}
	
	//Función que imprime el tablero.
	public static void pintaPista () {
		
		for (int i=1; i<=TAMCIRCUITO; i++) {
			
			System.out.print("\t"+i);
			
		}
		System.out.println("");
		
		//Hago un bucle for para el espacio.
		for (int space=0; space<=fichaJ1-1; space++) {
			System.out.print("\t");
		}
		System.out.println ("J1");
		
		//Hago un bucle for para el espacio.
		for (int space=0; space<=fichaJ2-1; space++) {
			System.out.print("\t");
		}
		System.out.println ("J2");
		
	}
	
	//Función que suma las tiradas.
	public static boolean sumaDeNumerosPrimos (int n1, int n2) {
		
		int suma;
		
		//Sumamos las tiradas.
		suma= n1+n2;
		
		//Comprobamos que son primos.
		boolean esPrimo=true;
		
		for (int i=2; i<=suma/2; i++) {
			
			if (suma%i==0) {
					
				esPrimo=false;
				break;
			}
		
		}
		
		//Devolvemos el resultado.
		return esPrimo;
	}
	
	//Función que imprime cómo va la carrera.
	public void imprimeComoVaLaCarrera (String nomJ1, String nomJ2) {
		
		//En caso de que el jugador 1 vaya ganando.
		if (fichaJ1>fichaJ2) {
			
			System.out.println("Va ganando el jugador 1 "+nomJ1);
		
		//En caso de que el jugador 2 vaya ganando.
		} else if (fichaJ2<fichaJ1) {
			
			System.out.println("Va ganando el jugador 2 "+ nomJ2);
		
		//En caso de empate.
		} else if (fichaJ1==fichaJ2) {
			
			System.out.println("Empate.");
		}
	}
	
	//Función que declara el ganador.
	public String esGanador (String nomJ1, String nomJ2) {
		
		String ganador="ganador";
		
		//En caso de que gane el jugador 1.
		if (fichaJ1>=TAMCIRCUITO) {
			
			ganador=nomJ1;
		
		//En caso de que gane el jugador 2.
		} else if (fichaJ2>=TAMCIRCUITO) {
			
			ganador=nomJ2;
		
		} 
		
		//Devolvemos el resultado.
		return ganador;
	}


}
