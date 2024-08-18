#EXERCICIO 8: Desenvolva um algoritmo para uma lista de convidados. O usuário deve ser capaz de adicionar vários nomes à lista. Quando o usuário decidir parar, a lista será exibida na tela com todos os nomes que ele inseriu, juntamente com a quantidade total de nomes.

lista = []
Parar = int(input("Deseja adicionar mais um convidado? (0) Adicionar (1) Encerrar: "))
qtd_convidados:int = 0


while Parar == 0:
    Adicionar_Convidado = str(input("digite o nome:"))
    Parar = int(input("Deseja adicionar mais um convidado? (0) Adicionar (1) Encerrar: "))
    lista.append(Adicionar_Convidado)
    
print("__________Lista Final__________")
for x in lista:
    qtd_convidados = qtd_convidados + 1
    print(qtd_convidados,x)
print("_______________________________")

print("O numero total de convidados é:",len(lista))