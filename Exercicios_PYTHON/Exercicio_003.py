#EXERCICIO 3: Realize as 4 operações básicas: Adição, Subtração, Multiplicação e Divisão. 
#No entanto, permita que o número seja fornecido pelo usuário. 
#Caso o usuário digite 0 como divisor, imprima no terminal: "Erro, não é possível dividir um #número por 0"
 
Numero1 = int(input("Digite o primeiro numero: "))
Numero2 = int(input("Digite o segundo numero: "))


Adicao : int = Numero1 + Numero2
Subtracao : int = Numero1 - Numero2
Mutipicacao : int = Numero1 * Numero2


print("Soma ",Numero1,"+",Numero2,"=",Adicao)
print("Subtracao",Numero1,"-",Numero2,"=",Subtracao)
print("Multiplicação",Numero1,"X",Numero2,"=",Mutipicacao)

if Numero1 == 0 or Numero2 == 0:
    print("Erro!! Não é possivel dividir por 0")
else:
    print("Divisão",Numero1,"/",Numero2,"=",Numero1/Numero2)

