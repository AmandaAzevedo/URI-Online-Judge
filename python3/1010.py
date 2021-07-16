# -*- coding: utf-8 -*-
total=0
for k in range (2):
    n = input().split(" ")
    quant=int(n[1])
    valor=float(n[2])
    total+=(quant*valor)
    
print("VALOR A PAGAR: R$ %.2f" %total)