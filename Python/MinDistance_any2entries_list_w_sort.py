import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

n = int(input())

ar = list ()

for i in range(n):
    pi = int(input())
    
    ar.append (pi)
    
minDist = None
ar.sort()

for x in range (len (ar)-1) :
    
    dist = ar[x+1] - ar [x]
    
    if minDist == None:
        minDist = dist
        
    else :
        minDist = dist if (minDist > dist) else minDist
        

            

# Write an action using print
# To debug: print("Debug messages...", file=sys.stderr)


print(minDist)