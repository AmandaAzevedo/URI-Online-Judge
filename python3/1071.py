# -*- coding: utf-8 -*-

x=int(input())
y=int(input())

lista=[]

if (x<=0):
    for k in range (x-1,y):
        lista.append(k)
    for k in range (y-1,x):
        lista.append(k)

else:
    for k in range (x+1,y):
        lista.append(k)
    for k in range (y+1,x):
        lista.append(k)

cont=0

for elemento in lista:
    if elemento%2 !=0 :
        cont+=elemento

print(cont)