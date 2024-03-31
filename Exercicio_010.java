import java.util.*;
public class Exercicio_010 {
/*EXERCICIO 10: Faça um algoritmo que de um aumento de 1o% no salario de um funcionario */

    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite o seu sálario: ");
            Float Salario_Atual = input.nextFloat();
            Float Salario_ComAumento = Salario_Atual * 1.10f;

            System.out.println("Seu salario atual é: "+ Salario_Atual);
            System.out.println("Seu salario com o aumento: "+ Salario_ComAumento);
        }
    }

    
}
