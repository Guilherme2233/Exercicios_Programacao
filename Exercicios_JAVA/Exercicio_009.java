import java.util.Scanner;
import java.time.*;

public class Exercicio_009 {
    /*
     * EXERCICIO 9: Faça um algoritmo que calcule a idade de uma pessoa a partir do
     * dia, mes e ano em que ela nasceu
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o dia em que voce nasceu: ");
            int Dia_nasc = input.nextInt();

            System.out.println("Digite o mes em que voce nasceu: ");
            int Mes_nasc = input.nextInt();

            System.out.println("Digite o ano em que voce nasceu: ");
            int Ano_nasc = input.nextInt();

            int Dia_atual = LocalDate.now().getDayOfMonth();
            int Mes_atual = YearMonth.now().getMonthValue();
            int Ano_atual = Year.now().getValue();

            if (Dia_atual >= Dia_nasc && Mes_atual >= Mes_nasc) {
                int idade = Ano_atual - Ano_nasc;
                System.out.println("Voce tem " + idade + " anos");
               
            }

            else {
                int Idade = Ano_atual - Ano_nasc - 1;
                System.out.println("Voce tem " + Idade + " anos ");
                
            }

        }

    }
}
