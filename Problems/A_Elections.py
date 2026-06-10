from functools import reduce
import math
a=int(input())
b=list(map(int,input().split(" ")))
c=sum(b)
d=((2*c)//a)+1

for i in b:
    if i>d:
        d=i
print(d)
