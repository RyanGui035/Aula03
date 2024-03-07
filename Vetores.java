package aula5;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        // String[] nomes = new String[]{"João Paulo", "Maria da Silva", "Adriana Silva"};
        Scanner leia = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i<5; i++){
            System.out.print("Digite o " + (i+1) + "º um nome: ");
            nomes[i] = leia.nextLine();
        }
        Arrays.sort(nomes);
        System.out.println("\nNomes ordenados: ");
        imprimeNomes(nomes);
  
    }

    private static void imprimeNomes(String[] nomes) {
          for (String nome: nomes){
              System.out.println(nome);
          }
    }
    
}



