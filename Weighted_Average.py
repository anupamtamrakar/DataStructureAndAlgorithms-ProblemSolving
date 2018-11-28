# Enter your code here. Read input from STDIN. Print output to STDOUT
# input N 
n = int(input()) 
  
# input the array 
ele = [int(x) for x in input().split()] 

weight = [int(x) for x in input().split()] 

s = 0
for i,j in zip(ele,weight):
    s = s + (i*j)
	
# 1 decimal place

print(round(s / sum(weight),1))

