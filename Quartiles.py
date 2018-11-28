# Enter your code here. Read input from STDIN. Print output to STDOUT

# Enter your code here. Read input from STDIN. Print output to STDOUT
# input N 
n = int(input()) 
import math
# input the array 
ele = [int(x) for x in input().split()] 
ele.sort()

l = len(ele)
if(l % 2 != 0):
    mid = int(l/2)
    q2 = ele[mid]
    
    elel = ele[:mid]
    eler = ele[mid+1:]

    left = elel[math.floor(len(elel)/2)]
    right = elel[math.ceil(len(elel)/2) - 1]
    q1 = (left + right) /2

    leftr = eler[int(len(eler)/2)]
    rightr = eler[int(len(eler)/2) - 1]

    q3 = (leftr + rightr) / 2
    print(int(q1))
    print(int(q2))
    print(int(q3))

else:
    mid1 = int(len(ele)/2)
    mid2 = int(len(ele)/2) -1
    q2 = (ele[mid1] + ele[mid2]) / 2
    
    elel = ele[:mid1]
    eler = ele[mid2+1:]
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

    print(int(q1))
    print(int(q2))
    print(int(q3))


# Input
#10
#3 7 8 5 12 14 21 15 18 14
