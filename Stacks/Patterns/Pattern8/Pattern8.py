def next_greater(arr):
    n = len(arr)
    nge = [0] * n
    stack = []
    for i in range(n - 1, -1, -1):
        while stack and arr[stack[-1]] < arr[i]:
            stack.pop()
        if not stack:
            nge[i] = n
        else:
            nge[i] = stack[-1]
        stack.append(i)
    return nge


def prev_greater(arr):
    n = len(arr)
    pge = [0] * n
    stack = []
    for i in range(n):
        while stack and arr[stack[-1]] <= arr[i]:
            stack.pop()
        if not stack:
            pge[i] = -1
        else:
            pge[i] = stack[-1]
        stack.append(i)
    return pge


nums = [1, 3, 5]
nge = next_greater(nums)
pge = prev_greater(nums)
total = 0
for i in range(len(nums)):
    left = i - pge[i]
    right = nge[i] - i
    total += nums[i] * left * right
print("Sum of Subarray Maximums:", total)