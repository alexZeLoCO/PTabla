import java.util.Scanner;		//IMPORTAR SCANNER
public class TestTabla {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO TECLADO
		System.out.print("Introduzca el número a multiplicar: ");		//SOLICITAR DATO
		int N = teclado.nextInt();		//ALMACENAR DATO EN N
		for (int i=0;i<=10;i++) {		//PARA 10 VECES, REPETIR:
			System.out.printf("%d * %d = %d\n", N, i, N*i);		//MULTIPLICAR N * I
										//(NOTA: I AUMENTA SU VALOR EN 1 CADA VUELTA)
		}
	}

}
