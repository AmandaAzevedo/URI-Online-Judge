# -*- coding: utf-8 -*-
idade=int(input())

ano=idade//365
anoMes=12*ano
anoDia=ano*365

mes=anoMes//12
mesDia=30*mes

dia=idade-anoDia-mesDia


while(dia>29):
    mes+=1
    dia-=30

while (mes>12):
    ano+=1
    mes=mes-12

print("%.d ano(s)"%ano)
print("%.d mes(es)"%mes)
print("%.d dia(s)"%dia)