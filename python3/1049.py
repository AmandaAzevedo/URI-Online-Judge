um= str.lower(input())
dois = str.lower(input())
tres = str.lower(input())

if (um == "vertebrado"):
    if (dois == "ave"):
        if (tres == "carnivoro"):
            print("aguia")

        elif (tres == "onivoro"):
            print("pomba")
            
    elif (dois == "mamifero"):
        if (tres == "onivoro"):
            print("homem")

        elif (tres == "herbivoro"):
            print("vaca")
        



elif (um == "invertebrado"):
    if (dois == "inseto"):
        if (tres == "hematofago"):
            print("pulga")

        elif (tres == "herbivoro"):
            print("lagarta")
            
    elif (dois == "anelideo"):
        if (tres == "hematofago"):
            print("sanguessuga")

        elif (tres == "onivoro"):
            print("minhoca")
