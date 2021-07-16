# -*- coding: utf-8 -*-
numero= input().split(" ")
maiorNumero=0
for k in range (3):
    
    if(int(numero[k])>maiorNumero):
        maiorNumero=int(numero[k])
	
print("%d eh o maior"%maiorNumero)