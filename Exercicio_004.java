import java.util.Scanner;

public class Exercicio_004 {
    /*EXERCICIO 4: faça um algoritmo que calcule a media de um aluno. caso a media do aluno seja menor que 5, diga que ele reprovou,
    caso for igual ou maior que 5 diga que ele esta aprovado e caso a média seja igual a 10 diga que ele foi aprovado e os de parabens */

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite sua primeira nota: ");
            float Nota_1 = input.nextFloat();

            System.out.println("Digite sua segunda nota: ");
            float Nota_2 = input.nextFloat();

            float Media = (Nota_1 + Nota_2) / 2;
            System.out.println("Sua média é " + Media);

            if (Media == 10) {
                System.out.println("Voce foi aprovado com nota maxima, meus parabens");

            } else if (Media < 5) {
                System.out.println("Voce foi reprovado");

            } else if (Media >= 5) {
                System.out.println("Voce foi aprovado");

            }

        }

    }

}
