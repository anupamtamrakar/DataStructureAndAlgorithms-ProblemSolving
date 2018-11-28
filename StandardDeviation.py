# your code goes here# Enter your code here. Read input from STDIN. Print output to STDOUT

n = int(input()) 
import statistics
# input the array 
element = [int(x) for x in input().split()] 

print(round(statistics.pstdev(element),1))