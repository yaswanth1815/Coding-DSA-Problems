def nse(arr):
    n = len(arr)
    nse_arr = [0] * n
    stk = []
    for i in range(n - 1, -1, -1):
        while stk and arr[stk[-1]] > arr[i]:
            stk.pop()
        if not stk:
            nse_arr[i] = n
        else:
            nse_arr[i] = stk[-1]
        stk.append(i)
    return nse_arr


def pse(arr):
    n = len(arr)
    pse_arr = [0] * n
    stk = []
    for i in range(n):
        while stk and arr[stk[-1]] >= arr[i]:
            stk.pop()
        if not stk:
            pse_arr[i] = -1
        else:
            pse_arr[i] = stk[-1]
        stk.append(i)
    return pse_arr


nums = [2, 2, 2]
nse_arr = nse(nums)
pse_arr = pse(nums)
sum_val = 0
for i in range(len(nums)):
    left = i - pse_arr[i]
    right = nse_arr[i] - i
    sum_val += left * right * nums[i]
print(sum_val)