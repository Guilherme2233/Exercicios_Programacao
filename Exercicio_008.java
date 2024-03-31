import java.util.*;
public class Exercicio_008 {
    /*EXERCICIO 8: Desenvolva um algoritmo para uma lista de convidados. O usuário deve ser capaz de adicionar vários nomes à lista. Quando o usuário decidir parar, a lista será exibida na tela com todos os nomes que ele inseriu, juntamente com a quantidade total de nomes.*/

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(
                    "Voce deseja adicionar uma pessoa a lista de convidados? Digite (0) para adicionar ou (1) para encerrar");

            int Parar = input.nextInt();
            int Qtd_convidados = 1;
            List<String> Lista = new ArrayList<>();

            while (Parar == 0) {
                System.out.print("Digite o nome: ");
                input.nextLine();

                String Nome = input.nextLine();
                Lista.add(Nome);

                System.out.println(
                        "Voce deseja adicionar uma pessoa a lista de convidados? Digite (0) para adicionar ou (1) para encerrar a lista");
                Parar = input.nextInt();

            }
            System.out.println("__________Lista Final__________");

            for (String Nome : Lista) {
                System.out.println(Qtd_convidados + "." + Nome);
                Qtd_convidados++;
            }
            System.out.println("_______________________________");

            System.out.println("o numero total de convidados foi " + Lista.size());
        }

    }
}
