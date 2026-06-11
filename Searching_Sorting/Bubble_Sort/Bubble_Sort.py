lst=[10,3,5,12,45,3,44,32,34]

for i in range(len(lst)):
    for j in range(len(lst)):
        if i!=j:
            if lst[i]<lst[j]:
                temp=lst[i]
                lst[i]=lst[j]
                lst[j]=temp
print(lst)