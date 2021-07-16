# -*- coding: utf-8 -*-
entrada=input().split(" ")
cod=int(entrada[0])
quant=int(entrada[1])

if(cod==1):
    total=4*quant
    print("Total: R$ %.2f"%total)
if(cod==2):
    total=4.5*quant
    print("Total: R$ %.2f"%total)
if(cod==3):
    total=5*quant
    print("Total: R$ %.2f"%total)
if(cod==4):
    total=2*quant
    print("Total: R$ %.2f"%total)
if(cod==5):
    total=1.5*quant
    print("Total: R$ %.2f"%total)