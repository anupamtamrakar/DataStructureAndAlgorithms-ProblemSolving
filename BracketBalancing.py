#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the isBalanced function below.
def isBalanced(s):
    stack =[]
    for i in s:
        if(i == '(' or i == '{' or i == '['):
            stack.append(i)
        elif(len(stack)>0):

            left = stack[-1]
            right = i
            if((left == '(' and right == ')' ) or (left == '{' and right == '}' ) or (left == '[' and right == ']' )):
                stack.pop()
            else:
                return "NO"
        else:
            return "NO"
    if(len(stack) == 0):
        return "YES"



if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        s = input()

        result = isBalanced(s)

        fptr.write(result + '\n')

    fptr.close()

	
	