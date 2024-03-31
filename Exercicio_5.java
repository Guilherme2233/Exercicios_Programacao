import java.util.Scanner;
public class Exercicio_5 {
    /*EXERCICIO 5: Crie um algoritmo que pergunte o nome, altura, peso, idade e a nacionalidade do usuario e então imprima na tela */

    public static void main(String[] args) {

        try (Scanner Input = new Scanner(System.in)) {
            System.out.println("Qual o seu nome:");
            String Nome = Input.nextLine();

            System.out.println("Qual o seu Altura (em cm): ");
            float Altura = Input.nextFloat();

            System.out.println("Qual o seu Peso (em KG): ");
            float Peso = Input.nextFloat();

            System.out.println("Qual o sua idade: ");
            int Idade = Input.nextInt();
            Input.nextLine();

            System.out.println("Qual sua nacionalidade:");
            String Nacionalidade = Input.nextLine();

            System.out.println("Ola " + Nome + ", voce tem " + Altura + " cm de altura, pesa " + Peso + " KG's, tem "
                    + Idade + " anos e é " + Nacionalidade + ".");

        }

    }

}
