# -*- coding: utf-8 -*-

n = float(input())
notasde100 = n//100
n = n%100
notasde50 = n//50
n = n%50
notasde20 = n//20
n = n%20
notasde10 = n//10
n = n%10
notasde5 = n//5
n = n%5
notasde2 = n//2
n = n%2
moedas1 = n//1
n = n%1
moedas50 = n//0.50
n = n%0.50
moedas25 = n//0.25
n = n%0.25
moedas10 = n//0.10
n = n%0.10
moedas5 = n//0.05
n = n%0.05
moedas001 = n/0.01
print("NOTAS:")
print("%.0f nota(s) de R$ 100.00"%notasde100)
print("%.0f nota(s) de R$ 50.00"%notasde50)
print("%.0f nota(s) de R$ 20.00"%notasde20)
print("%.0f nota(s) de R$ 10.00"%notasde10)
print("%.0f nota(s) de R$ 5.00"%notasde5)
print("%.0f nota(s) de R$ 2.00"%notasde2)
print("MOEDAS:")
print("%.0f moeda(s) de R$ 1.00"%moedas1)
print("%.0f moeda(s) de R$ 0.50"%moedas50)
print("%.0f moeda(s) de R$ 0.25"%moedas25)
print("%.0f moeda(s) de R$ 0.10"%moedas10)
print("%.0f moeda(s) de R$ 0.05"%moedas5)
print("%.0f moeda(s) de R$ 0.01"%moedas001)