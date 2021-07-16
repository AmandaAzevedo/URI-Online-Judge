# -*- coding: utf-8 -*-
valorPar=0
valorImpar=0
valorPositivo=0
valorNegativo=0

for k in range (5):
    valor=int(input())
    x=(valor%2)
    if(x==0):
        valorPar=valorPar+1
    else:
        valorImpar=valorImpar+1
    if(valor<0):
        valorNegativo=valorNegativo+1
    if(valor>0):
        valorPositivo=valorPositivo+1
    
print(valorPar,'valor(es) par(es)')
print(valorImpar,'valor(es) impar(es)')
print(valorPositivo,'valor(es) positivo(s)')
print(valorNegativo,'valor(es) negativo(s)')