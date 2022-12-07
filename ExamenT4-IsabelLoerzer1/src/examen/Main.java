package examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
				int tirada1, tirada2; //Variables que guardan el resultado de cada tirada.
				String nomJ1;
				String nomJ2; //Variables que guardan el nombre de cada jugador.
				String tecla;
				
				//Creamos un escaner para poder leer la información que introduzcan los/as jugadores/as.
				
				Scanner sc=new Scanner(System.in);
				
				//Creamos un objeto de la clase funciones para poder llamar a las funciones y variables.
				
				Funciones objeto= new Funciones ();
				
				//Se guarda la información en la variable correspondiente.
				
				System.out.println("Bienvenidos/as al juego de la Oca. "
						+ "Para empezar, debéis introducir el mínimo y el máximo de caras que tiene "
						+ "vuestro dado.");
				
				System.out.println("Mínimo: ");
				Funciones.minDado=sc.nextInt();
				
				System.out.println("Máximo: ");
				Funciones.maxDado=sc.nextInt();
				
				System.out.println("Jugador1, introduzca su nombre: ");
				nomJ1=sc.next();
				
				System.out.println("Jugador2, introduzca su nombre: ");
				nomJ2= sc.next();
				
				//Establecemos un bucle que impida que los nombres se repitan.
				while (nomJ1.equals(nomJ2)) {
					
					System.out.println("Cuidado, los nombre no pueden ser iguales.");
					System.out.println("Jugador2, introduzca un nombre distinto a Jugador1: ");
					nomJ2=sc.next();
				}
				
				System.out.println("¡Genial! Vamos a empezar");
				
				//Se imprime el tablero por primera vez.
				Funciones.pintaPista();
				
				while (objeto.esGanador(nomJ1, nomJ2).equals("ganador")) {
					
					System.out.println("Pulsa cualquier tecla para empezar la ronda: ");
					tecla=sc.next();
					
					System.out.println("Turno del jugador 1 "+nomJ1);
					
					//Se empieza con las tiradas del jugador1.
					tirada1=Funciones.tiraDados();
					System.out.println("En la primera tirada ha sacado "+tirada1);
					
					tirada2=Funciones.tiraDados();
					System.out.println("En la segunda tirada ha sacado "+tirada2);
					
					
					//Si la suma de las tiradas es igual que un número primo, se acepta como válida.
					if (Funciones.sumaDeNumerosPrimos(tirada1, tirada2)==true) {
						
						Funciones.fichaJ1=tirada1+tirada2;
						
						System.out.println("La tirada es válida, J1 avanza tantas casillas como la suma de las tiradas.");
						
					} else {
						
						System.out.println("La tirada no es válida, J1 no avanza.");
					}
					
					//Se imprime el tablero.
					Funciones.pintaPista();
					
					//Se imprime el quien va ganando.
					objeto.imprimeComoVaLaCarrera(nomJ1, nomJ2);
					
					//Repetimos lo anterior con el jugador 2.
					System.out.println("Turno del jugador 2 "+nomJ2);
					
					//Se imprimen las tiradas del jugador 2.
					tirada1=Funciones.tiraDados();
					System.out.println("En la primera tirada ha sacado "+tirada1);
					
					tirada2=Funciones.tiraDados();
					System.out.println("En la segunda tirada ha sacado "+tirada2);
					
					
					//Si la suma de las tiradas es igual que un número primo, se acepta como válida.
					if (Funciones.sumaDeNumerosPrimos(tirada1, tirada2)==true) {
						
						Funciones.fichaJ2=tirada1+tirada2;
						
						System.out.println("La tirada es válida, J2 avanza tantas casillas como la suma de las tiradas");
						
					} else {
						
						System.out.println("La tirada no es válida, J2 no avanza.");
					}
					
					//Se imprime el tablero.
					Funciones.pintaPista();
					
					//Se imprime el quien va ganando.
					objeto.imprimeComoVaLaCarrera(nomJ1, nomJ2);
						
				}
				
				//Se imprime el ganador.
				if (objeto.esGanador(nomJ1, nomJ2).equals(nomJ1)) {
					
					System.out.println("!Enhorabuena "+nomJ1+ ", has ganado!");
				
				} else if (objeto.esGanador(nomJ1, nomJ2).equals(nomJ2)) {
					
					System.out.println("!Enhorabuena "+nomJ2+ ", has ganado!");
					
				}
				
				//Cerramos el escáner.
				sc.close();		

	}

}
