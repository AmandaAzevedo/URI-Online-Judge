# -*- coding: utf-8 -*-

lista=[]

for k in range (5):
    entrada=int(input())
    lista.append(entrada)

cont=0

for elemento in lista:
    if (elemento%2 == 0):
        cont+=1
        
print("%s valores pares"%cont)