# -*- coding: utf-8 -*-
x=input().split(" ")
a=float(x[0])
b=float(x[1])
c=float(x[2])

#ax**2+bx+c

delta=((b**2)-4*a*c)

    
if (a==0 and b==0):
    print("Impossivel calcular")


if (delta<=0):
    print("Impossivel calcular")
    
else:
    if(b!=0 and delta!=0 and a!=0):
        x1=((-b)+(delta**0.5))/(2*a)
        x2=((-b)-(delta**0.5))/(2*a)
        print("R1 = {:.5f}" .format(x1))
        print("R2 = {:.5f}" .format(x2))
    else:
        print("Impossivel calcular")