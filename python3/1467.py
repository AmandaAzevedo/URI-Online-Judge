# -*- coding: utf-8 -*-

while (True):
    try:
        a = input().split(" ")
        if (a[0]== "1" and a[1] == "0" and a[2] == "0"):
            print("A")
        elif (a[0]== "0" and a[1] == "1" and a[2] == "0"):
            print("B")
        elif (a[0]== "0" and a[1] == "0" and a[2] == "1"):
            print("C")
        elif (a[0]== "0" and a[1] == "0" and a[2] == "0"):
            print("*")
        elif (a[0]== "1" and a[1] == "1" and a[2] == "1"):
            print("*")
        elif (a[0]== "1" and a[1] == "0" and a[2] == "1"):
            print("B")
        elif (a[0]== "1" and a[1] == "1" and a[2] == "0"):
            print("C")
        elif (a[0]== "0" and a[1] == "1" and a[2] == "1"):
            print("A")



    except EOFError:
        break