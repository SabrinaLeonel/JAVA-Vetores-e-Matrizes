package javavetor;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int vetor[] = {2,5,1,3,4,9,7,8,10,6};
		int numero, i;
		boolean achou = false;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		leia.close();
		
		for(i = 0; i<10; i ++) {
			
			if (numero == vetor[i]) {
				System.out.println("O número" +numero+ "está localizado na posição: " +i);
				achou = true;
			}
		}
		
		if (achou == false) {
			System.out.println("O número" +numero+ "não foi encontrado!");
		}
	}

}

