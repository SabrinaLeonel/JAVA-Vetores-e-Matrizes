package javavetor;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int [][] matriz = new int [3][3];
		int numero, linha, i;
		int diagonalPrinc, diagonalSec;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha = 0; linha<3; linha ++) {
			
			for (i = 0; i<3; i++) {
				System.out.println("Digite o " +(i + 1)+ "° nunmero da linha " +(linha + 1));
				numero = leia.nextInt();
				matriz[linha][i] = numero;
			}
			
		}
		diagonalPrinc = matriz[0][0] +matriz[1][1]+ matriz[2][2];
		diagonalSec = matriz[0][2] +matriz[1][1]+ matriz[2][0];
		
		System.out.println("\nElementos da Diagonal Principal: "+matriz[0][0] +matriz[1][1]+ matriz[2][2]);
		System.out.println("\nElementos da Diagonal Secundária: "+matriz[0][2] +matriz[1][1]+ matriz[2][0]);
		System.out.println("\nSoma dos Elementos da Diagonal Principal: "+diagonalPrinc);
		System.out.println("\nSoma dos Elementos da Diagonal Secundária: "+diagonalSec);
		leia.close();
	}

}

