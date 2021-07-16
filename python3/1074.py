x = int (input())
l=[]
for k in range(x):
    q=int(input())
    l.append(q)


for k in l:
    
    if (k == 0):
        print("NULL")
		
    elif(k < 0):
        if (k % 2 == 0):
            print("EVEN NEGATIVE")
        else:
            print("ODD NEGATIVE")
		
    elif (k > 0):
        if (k % 2 == 0):
            print("EVEN POSITIVE")
        else:
            print("ODD POSITIVE")