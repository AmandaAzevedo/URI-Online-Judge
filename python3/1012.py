# -*- coding: utf-8 -*-

valor=input()
valorPedido=valor.split()
A=float(valorPedido[0])
B=float(valorPedido[1])
C=float(valorPedido[2])

areaTR=((A*C)/2)
pi=3.14159
areaC=(pi*(C**2))
areaTra=(((A+B)*C)/2)
areaQ=B**2
areaR=A*B

print('TRIANGULO: %.3f'%areaTR)
print('CIRCULO: %.3f'%areaC)
print('TRAPEZIO: %.3f'%areaTra)
print('QUADRADO: %.3f'%areaQ)
print('RETANGULO: %.3f'%areaR)