class Solution:
    def answerQueries(self, nums: List[int], queries: List[int]) -> List[int]:
        nums.sort()

        prefix_sum = [0]
        # O(N)
        for i in range(len(nums)):
            # префиксная сумма
            prefix_sum.append(nums[i] + prefix_sum[-1])
        
        result = []
        # O(N)
        for query in queries:
            # бинарный поиск O(logN)
            l = -1
            r = len(prefix_sum)
            while l < r-1:
                m = (l+r) // 2
                if prefix_sum[m] <= query:
                    l = m
                else:
                    r = m
            result.append(r-1)
        return result

