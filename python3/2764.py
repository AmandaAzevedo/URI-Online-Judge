# -*- coding: utf-8 -*-
x = input().split("/")
for k in range(1):
    print("%s/%s/%s"%(x[1],x[0],x[2]))
    print("%s/%s/%s"%(x[2],x[1],x[0]))
    print("%s-%s-%s"%(x[0],x[1],x[2]))