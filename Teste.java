package PortoSeguro;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner entrada = new Scanner(System.in);
		  System.out.println("Digite uma letra entre a e d:");
		  String letra = entrada.nextLine();
		  switch (letra) {
		    case "a":
		      System.out.println("Abacate");
		      break;
		    case "b":
		      System.out.println("Buriti");
		      break;
		    case "c":
		      System.out.println("Caju");
		      break;
		    case "d":
		      System.out.println("Damasco");
		      break;
		    default:
		      System.out.println("Letra inválida");
		  }
	}

}
