n=input().split (" ")
n1=float(n[0])
n2=float(n[1])
n3=float(n[2])
n4=float(n[3])

media=(((n1*2)+(n2*3)+(n3*4)+(n4*1))/10)



if media >= 7:
    print("Media: %.1f"%media)
    print("Aluno aprovado.")
elif media < 5:
    print("Media: %.1f"%media)
    print("Aluno reprovado.")
elif media >= 5 and media <= 6.9:
    exame=float(input())
    print("Media: %.1f"%media)
    print("Aluno em exame.")
    
    print("Nota do exame: %.1f"%exame)
    passou=(media+exame)/2
    if passou >=5.0:
        print("Aluno aprovado.")
    else:
        print("Aluno reprovado.")
    print("Media final: %.1f"%passou)