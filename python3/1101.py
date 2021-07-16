# -*- coding: utf-8 -*-

lista = []

while(True):
    try:
        a = input().split(" ")

        b = int(a[0])
        c = int (a[1])

        soma = 0
        lista2 = []
            
        if (b > c and b > 0 and c > 0):
            for k in range (c, b+1, 1):
                soma += k
                lista2.append(k)
            p = len(lista2)
            soma1 = str(soma)
            lista2.insert(p, "Sum="+soma1)
            lista.append(lista2)
            
        elif(b < c and b > 0 and c > 0):
            for k in range (b, c+1, 1):
                soma += k
                lista2.append(k)
            p = len(lista2)
            soma1 = str(soma)
            lista2.insert(p, "Sum="+soma1)
            lista.append(lista2)
                
        

    except EOFError:
        break

for k in lista:
    x = map(str, k)
    b = " ".join(x)
    print(b)