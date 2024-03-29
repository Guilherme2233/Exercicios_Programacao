import java.util.Scanner;
public class Exercicio_6 {
    public static void main(String[] args) {
        /* Exercicio 6: Crie um programa que faça a tabuada do numero que o usuario digitar */

        try (Scanner Input = new Scanner(System.in)) {
            System.out.println("Digite o numero da tabuada que deseja ver: ");
            int Numero = Input.nextInt();

            System.out.println("______________________________________");

            for (int i = 0; i < 11; i++) {
                System.out.println(Numero + " X " + i + " = " + Numero * i);
            }

            System.out.println("______________________________________");

        }

    }

}
