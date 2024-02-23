package Aula03;
import java.util.Scanner;
public class projeto2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double p, a, imc;
		
		System.out.printf("Informe o seu peso: \n");
		p=ler.nextDouble();

		System.out.printf("Informe a sua altura: \n");
		a=ler.nextDouble();

		imc = p / (a*a);
		System.out.printf("Valor IMC: \n" +imc);
		
		if (imc<20) {
		System.out.printf(" - MAGRO \n");
		
		}else if ( imc >= 20 && imc <24) {
		System.out.printf(" - NORMAL \n");

		}else if (imc >=24 && imc <29) {
		System.out.printf(" - ACIMA DO PESO \n");

		}else if (imc >=29 && imc <34) {
		System.out.printf(" - OBESO \n");

		}else if (imc >=34) {
		System.out.printf(" - MUITO OBESO \n");


			}

   }
}