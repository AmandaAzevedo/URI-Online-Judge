# -*- coding: utf-8 -*-
v=input().split(" ")
a = float(v[0])
b = float(v[1])
c = float(v[2])
if (a<b+c and b<a+c and c<a+b):
    perimetro = a + b + c
    print("Perimetro = {:.1f}".format(perimetro))
else:
    area=(a+b)*c/2
    print("Area = {:.1f}".format(area))  