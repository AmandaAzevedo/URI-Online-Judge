# -*- coding: utf-8 -*-
totalDias = int(input())
qtdeAnos = totalDias//365
qtdeMeses = (totalDias%365)//30
qtdeDias = (totalDias%365)%30



print ("%.d ano(s)"% qtdeAnos)
print ("%.d mes(es)"% qtdeMeses)
print ("%.d dia(s)"% qtdeDias)