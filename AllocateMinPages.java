// def check (arr,k,page):
//     cnt=1
//     pagesum=0
//     for pages in arr:
//         if pagesum +pages>page:
//             cnt+=1
//             pagesum=pages
//         else:
//             pagesum +=pages
//     return cnt<=k
// class Solution:
    
//     #Function to find minimum number of pages.
//     def findPages(self, arr, k):
//         if k>len(arr):
//             return -1
//         lo=max(arr)
//         hi=sum(arr)
//         res=-1
//         while lo <= hi:
//             mid=lo+(hi-lo)//2
//             if check(arr,k,mid):
//                 res=mid
//                 hi=mid-1
//             else:
//                 lo=mid+1
//         return res
