class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        sums = 0
        n = len(arr)
        for i in range(n):
            times = ((n-i)*(i+1)+1) // 2
            sums += arr[i]*times
        return sums
