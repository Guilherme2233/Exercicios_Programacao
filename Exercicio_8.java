import java.util.*;
public class Exercicio_8 {
    /*Exercício 8: Desenvolva um algoritmo para uma lista de convidados. O usuário deve ser capaz de adicionar vários nomes à lista. Quando o usuário decidir parar, a lista será exibida na tela com todos os nomes que ele inseriu, juntamente com a quantidade total de nomes.*/

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(
                    "Voce deseja adicionar uma pessoa a lista de convidados? Digite (0) para adicionar ou (1) para encerrar");

            int Parar = input.nextInt();
            int qtd_Convidados = 1;
            List<String> lista = new ArrayList<>();

            while (Parar == 0) {
                System.out.print("Digite o nome: ");
                input.nextLine();

                String nome = input.nextLine();
                lista.add(nome);

                System.out.println(
                        "Voce deseja adicionar uma pessoa a lista de convidados? Digite (0) para adicionar ou (1) para encerrar a lista");
                Parar = input.nextInt();

            }
            System.out.println("__________Lista Final__________");

            for (String nome : lista) {
                System.out.println(qtd_Convidados + "." + nome);
                qtd_Convidados++;
            }
            System.out.println("_______________________________");

            System.out.println("o numero total de convidados foi " + lista.size());
        }

    }
}
