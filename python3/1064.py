# -*- coding: utf-8 -*-
lista=[]

for k in range (6):
    entrada=float(input())
    lista.append(entrada)

cont=0
soma=0

for elemento in lista:
    if (elemento>=0):
        cont+=1
        soma+=elemento
        
print("%s valores positivos"%cont)

media=soma/cont

print("%.1f"%media)