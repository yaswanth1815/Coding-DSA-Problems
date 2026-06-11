lst=[1,4,2,44,22,21]
target=744
found=False
for i in range(len(lst)):
    if lst[i]==target:
        found=True
        break
if found:
    print("Found")
else:
    print("Not Found")