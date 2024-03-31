import java.util.Scanner;
public class Exercicio_7 {
    /*Exercicio 7: Faça um algoritmo que diga quantos digitos pussui em uma string digitada pelo usuario */
    
    public static void main(String[] args) {
      
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite uma frase:");
            String Texto_usuario = input.nextLine();

            int qtd_letra = Texto_usuario.length();

            System.out.println("a quantidade de letras na frase que voce digitou é: " + qtd_letra);

        }
    }
}