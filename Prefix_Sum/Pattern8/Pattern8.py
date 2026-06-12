nums = [5, 3, -1, 0, 1, 4, 2, -2, -4, 5, -3]

maxx = 0
summ = 0
target = 5

dct = {0: -1}

for i in range(len(nums)):
    summ += nums[i]
    val = summ - target

    if val in dct:
        maxx = max(maxx, i - dct[val])

    if summ not in dct:
        dct[summ] = i

print(maxx)