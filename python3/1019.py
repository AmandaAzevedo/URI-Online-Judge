# -*- coding: utf-8 -*-

segundos=int(input())

minut=segundos//60
horas=minut//60

horaMinutos=60*horas
minutos=minut-horaMinutos

horaSegundos=3600*horas

minutosSegundos=minutos*60
segundos=segundos-minutosSegundos-horaSegundos

if(minutos>=60):
    horas+=1
    minutos==0
if(minutos>=60):
    minutos+=1
    segundos==0



print("{:.0f}:{:.0f}:{:.0f}".format(horas,minutos,segundos))