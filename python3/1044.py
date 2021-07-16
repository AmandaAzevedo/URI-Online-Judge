# -*- coding: utf-8 -*-

v=input().split(" ")
a=int(v[0])
b=int(v[1])
if(a<b):
    if(b%a == 0):
        print("Sao Multiplos")
    else:
        print("Nao sao Multiplos")
else:
    if (a%b == 0):
        print("Sao Multiplos")
    else:
        print("Nao sao Multiplos")