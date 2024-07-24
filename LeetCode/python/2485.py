class Solution:
    def pivotInteger(self, n: int) -> int:
        arr = [i for i in range(1, n+1)]
        prefix_sum = [0]
        for i in range(0, n):
            prefix_sum.append(prefix_sum[-1] + arr[i])
        for i in range(1, n+1):
            if prefix_sum[i] == prefix_sum[-1] - prefix_sum[i] + i:
                return i
        return -1

    def best_pivotInteger(self, n: int) -> int:
        sums = n * (n+1)//2

        left_sum = 0
        for i in range(1, n+1):
            left_sum += i
            if left_sum == sums - left_sum + i:
                return i
        return -1
        