import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

n = int(input())  # Number of elements which make up the association table.
q = int(input())  # Number Q of file names to be analyzed.

mimeType = dict()

for i in range(n):
    # ext: file extension
    # mt: MIME type.
    ext, mt = input().split()
    
    mimeType [ext] = mt
    
    
for i in range(q):
    fname = input()  # One file name per line.
    found = False
    
    #print(fname)
    
    for k, v in mimeType.items():
        
        fnameSplit = fname.split('.')
        
        if (len(fnameSplit)>1): 
            extension = fnameSplit [len (fnameSplit) -1]
        

            if (extension.lower() == k.lower()):
                print (v)
                found = True
                
        else : 
            found = False
        
    if (not found) :
        print ("UNKNOWN")
# Write an action using print
# To debug: print("Debug messages...", file=sys.stderr)
# For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
