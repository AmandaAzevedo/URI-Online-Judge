# -*- coding: utf-8 -*-
valor = int(input())
list = []
for k in range (valor):
    if ((k+1)%2 == 0):
        list.append(k+1)
for q in list:
    x = q ** 2
    print("%d^2 = %d"%(q,x))