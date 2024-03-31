import pandas as pd

Dia_Nasc = int(input("Digite o dia que voce nasceu:"))
Mes_Nasc = int(input("Digite o mes que voce nasceu:"))
Ano_Nasc = int(input("Digite o ano que voce nasceu:"))

Data_AtualGet = pd.to_datetime('today')

Dia = Data_AtualGet.day
Mes = Data_AtualGet.month
Ano = Data_AtualGet.year

if (Mes, Dia) >= (Mes_Nasc, Dia_Nasc):
    idade: int = Ano_Nasc - Ano
    print("Voce tem", idade,"anos")
   

else:
    idade: int = Ano - Ano_Nasc -1
    print("Voce tem", idade,"anos")
    
