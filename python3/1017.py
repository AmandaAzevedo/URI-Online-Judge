# -*- coding: utf-8 -*-

tempoGastoNaViagemEmHoras=int(input())
velocidadeEmKmPorHora=int(input())

distancia=velocidadeEmKmPorHora*tempoGastoNaViagemEmHoras
x=distancia/12

print("%.3f"%x)