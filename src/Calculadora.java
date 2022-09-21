import java.util.Scanner;



public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero1, numero2, resultado;		
		
		System.out.println("Seja bem vindo a culculadora:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - divisão");
		
		System.out.println("Digite um número para fazer uma operação");
		int escolha = sc.nextInt();
		
		switch (escolha) {
		
		case 1: 
			System.out.print("Digite um número:");
			numero1 = sc.nextInt();
			System.out.print("Digite o segundo número:");
			numero2 = sc.nextInt();
			resultado = numero1 + numero2;
			System.out.printf("A soma de %d + %d é igual: %d", numero1, numero2, resultado);
			break;
	
		case 2:
			System.out.print("Digite um número:");
			numero1 = sc.nextInt();
			System.out.print("Digite o segundo número:");
			numero2 = sc.nextInt();
			resultado = numero1 - numero2;
			System.out.printf("A subitração de %d - %d é igual: %d", numero1, numero2, resultado);
			break;
	
		case 3:
			System.out.print("Digite um número:");
			numero1 = sc.nextInt();
			System.out.print("Digite o segundo número:");
			numero2 = sc.nextInt();
			resultado = numero1 * numero2;
			System.out.printf("A multiplicação de %d x %d é igual: %d", numero1, numero2, resultado);
			break;
	
		case 4:
			System.out.print("Digite um número:");
			numero1 = sc.nextInt();
			System.out.print("Digite o segundo número:");
			numero2 = sc.nextInt();
			resultado = numero1 / numero2;
			System.out.printf("A divisão de %d / %d é igual: %d", numero1, numero2, resultado);
			break;
	
		default:
			System.out.println("Nenhuma opcao valida");
		};
	}	
}

		

	

