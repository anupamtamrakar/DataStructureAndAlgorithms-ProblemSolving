# Enter your code here. Read input from STDIN. Print output to STDOUT

n = int(input()) 
import math
# input the array 
element = [int(x) for x in input().split()] 

freq  = [int(x) for x in input().split()] 

dataSet = []

for i,j in zip(element,freq):
    dataSet.extend([i] * j)

dataSet.sort()

l = len(dataSet)

if(l % 2 != 0):
    mid = int(l/2)
    q2 = dataSet[mid]
    
    elel = dataSet[:mid]
    eler = dataSet[mid+1:]
    if(len(elel) % 2 != 0):
        q1 = elel[int(len(elel)/2)]
        q3 = eler[int(len(eler)/2)]
    else:
        left = elel[math.floor(len(elel)/2)]
        right = elel[math.ceil(len(elel)/2) - 1]
        q1 = (left + right) /2

        leftr = eler[int(len(eler)/2)]
        rightr = eler[int(len(eler)/2) - 1]

        q3 = (leftr + rightr) / 2

else:
    mid1 = int(len(dataSet)/2)
    mid2 = int(len(dataSet)/2) -1
    q2 = (dataSet[mid1] + dataSet[mid2]) / 2
    
    elel = dataSet[:mid1]
    eler = dataSet[mid2+1:]
    if(len(elel) % 2 == 0):

        left = elel[math.floor(len(elel)/2)]
        right = elel[math.ceil(len(elel)/2) - 1]
        q1 = (left + right) /2
        leftr = eler[int(len(eler)/2)]
        rightr = eler[int(len(eler)/2) - 1]
        q3 = (leftr + rightr) / 2
    else:
        q1 = elel[int(len(elel)/2)]
        q3 = eler[int(len(eler)/2)]

print(float(round(q3-q1,1)))

# INput

# 6
#6 12 8 10 20 16
#5 4 3 2 1 5