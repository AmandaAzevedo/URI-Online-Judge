um=input().split(" ")

x1=float(um[0])
y1=float(um[1])

dois=input().split(" ")

x2=float(dois[0])
y2=float(dois[1])

distancia=(((x2-x1)**2)+((y2-y1)**2))**0.5
print("%.4f"%distancia)