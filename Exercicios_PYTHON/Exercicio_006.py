#EXERCICIO 6: Crie um programa que faça a tabuada do 1 ao 10 do numero que o usuario digitar

Numero = int(input("Digite o numero da tabuada que deseja ver:"))
print("_______________")

for x in range(1,11):
    print(Numero,"X",x,"=",Numero*x)

print("_______________")
