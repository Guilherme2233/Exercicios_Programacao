import pandas as pd

while True:
    try:
        Dia_Nasc = int(input("Digite o dia que você nasceu: "))
        Mes_Nasc = int(input("Digite o mês que você nasceu: "))
        Ano_Nasc = int(input("Digite o ano que você nasceu: "))
        break
    except ValueError:
        print("Erro!! Digite apenas números!!")

Data_AtualGet = pd.to_datetime('today')

Dia = Data_AtualGet.day
Mes = Data_AtualGet.month
Ano = Data_AtualGet.year

if (Mes, Dia) >= (Mes_Nasc, Dia_Nasc):
    idade = Ano - Ano_Nasc
else:
    idade = Ano - Ano_Nasc - 1

print("Você tem", idade, "anos")