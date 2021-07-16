# -*- coding: utf-8 -*-

entradasStr = input().split(" ")
entradas = []
for k in entradasStr:
    entradas.append(float(k))
entradas.sort(reverse = True)
a = entradas[0]
b = entradas[1]
c = entradas[2]

if ((a)>= b+c):
    print("NAO FORMA TRIANGULO")
else:
    if ((a**2) == (b**2)+(c**2)):
        print("TRIANGULO RETANGULO")
    if ((a**2) > (b**2) + (c**2)):
        print("TRIANGULO OBTUSANGULO")
    if ((a**2) < (b**2) +(c**2)):
        print ("TRIANGULO ACUTANGULO")

if (a == b and a == c and b == c):
    print("TRIANGULO EQUILATERO")
else:
    if (a == b or a == c or b == c):
        print ("TRIANGULO ISOSCELES")