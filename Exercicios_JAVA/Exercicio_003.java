import java.util.Scanner;

public class Exercicio_003 {  
    /*EXERCICIO 3: Crie um algoritmo que faça as 4 operações basicas: Adição, subtração, multiplicação e divisão. caso o usuario digite 0, apareca "erro! não e possivel dividir por 0"
*/
    
    public static void main(String[] args) {

        try (Scanner Input = new Scanner(System.in)) {
            System.out.println("Digite o primeiro numero: ");
            int Numero_1 = Input.nextInt();

            System.out.println("Digite o segundo numero: ");
            int Numero_2 = Input.nextInt();

            int Adicao = Numero_1 + Numero_2;
            int Subtracao = Numero_1 - Numero_2;
            int Multiplicacao = Numero_1 * Numero_2;

            System.out.println("A soma entre " + Numero_1 + " + " + Numero_2 + " = " + Adicao);
            System.out.println("A subtração entre " + Numero_1 + " - " + Numero_2 + " = " + Subtracao);
            System.out.println("A multiplicação entre " + Numero_1 + " X " + Numero_2 + " = " + Multiplicacao);

            if (Numero_1 == 0 || Numero_2 == 0) {
                System.out.println("Erro!, Não é possivel dividir por 0");

            } else {
                System.out.println("A divisão entre " + Numero_1 + " / " + Numero_2 + " = " + Numero_1 / Numero_2);

            }
        }

    }
}
