#EXERCICIO 4: faça um algoritmo que calcule a media de um aluno. caso a media do aluno seja menor que 5, diga que ele reprovou,caso for igual ou maior que 5 diga que ele esta aprovado e caso a média seja igual a 10 diga que ele foi aprovado e os de parabens

Nota_1 = int(input("Digite a primeira nota: "))
Nota_2 = int(input("Digite a segunda nota: "))

Media:int = (Nota_1 + Nota_2)/2


if Media == 10:
    print("Voce foi aprovado com nota máxima, meus parabens!!")

elif Media>= 5:
    print("Voce foi Aprovado!!")

else:
    print("Voce foi reprovado!!")
