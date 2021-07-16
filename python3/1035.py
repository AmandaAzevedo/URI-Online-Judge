# -*- coding: utf-8 -*-

n = input().split(" ")
a=int(n[0])
b=int(n[1])
c=int(n[2])
d=int(n[3])

soma1=a+b
soma2=c+d
resto=a%2

for k in range(1):
    if b>c and d>a and soma2>soma1 and c>=0 and d>=0 and resto == 0:
        print("Valores aceitos")
    else:
        print("Valores nao aceitos")