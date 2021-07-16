x=int(input())

notasDeCem=x//100
restoDeCem=x%100

notasDeCinquenta=restoDeCem//50
restoDeCinquenta=restoDeCem%50

notasDeVinte=restoDeCinquenta//20
restoDeVinte=restoDeCinquenta%20

notasDeDez=restoDeVinte//10
restoDeDez=restoDeVinte%10

notasDeCinco=restoDeDez//5
restoDeCinco=restoDeDez%5

notasDeDois=restoDeCinco//2
restoDeDois=restoDeCinco%2

notasDeUm=restoDeDois//1
restoDeUm=restoDeDois%1

print("%.d"%x)
print("%.d nota(s) de R$ 100,00"%notasDeCem)
print("%.d nota(s) de R$ 50,00"%notasDeCinquenta)
print("%.d nota(s) de R$ 20,00"%notasDeVinte)
print("%.d nota(s) de R$ 10,00"%notasDeDez)
print("%.d nota(s) de R$ 5,00"%notasDeCinco)
print("%.d nota(s) de R$ 2,00"%notasDeDois)
print("%.d nota(s) de R$ 1,00"%notasDeUm)