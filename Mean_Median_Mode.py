import numpy as np
from scipy import stats

# input N 
n = int(input()) 
  
# input the array 
arr = [int(x) for x in input().split()] 

print(np.mean(arr))
print(np.median(arr))
print(int(stats.mode(arr).mode))