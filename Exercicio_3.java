import java.util.Scanner;

public class Exercicio_3 {  
    /*Exercicio 3:Faça as 4 operações basicas:Adição, Subtração, Multiplicação e Divisão,
     mas faça que o numero seja fornecido pelo usuario.
     e caso o usuario digite 0, imprima no terminal:"erro, não é possivel dividir um numero por 0*/
    
    public static void main(String[] args) {

        try (Scanner Input = new Scanner(System.in)) {
            System.out.println("Digite o primeiro numero: ");
            int Numero_1 = Input.nextInt();

            System.out.println("Digite o segundo numero: ");
            int Numero_2 = Input.nextInt();

            int Adição = Numero_1 + Numero_2;
            int Subtração = Numero_1 - Numero_2;
            int Multiplicação = Numero_1 * Numero_2;

            System.out.println("A soma entre " + Numero_1 + " + " + Numero_2 + " = " + Adição);
            System.out.println("A subtração entre " + Numero_1 + " - " + Numero_2 + " = " + Subtração);
            System.out.println("A multiplicação entre " + Numero_1 + " X " + Numero_2 + " = " + Multiplicação);

            if (Numero_1 == 0 || Numero_2 == 0) {
                System.out.println("Erro!, Não é possivel dividir por 0");

            } else {
                System.out.println("A divisão entre " + Numero_1 + " / " + Numero_2 + " = " + Numero_1 / Numero_2);

            }
        }

    }
}
