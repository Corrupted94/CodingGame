import sys
import math

#This code is better suited for large DATASET

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
    
    fnameSplit = fname.split('.')
        
    if (len(fnameSplit)>1): 
        extension = fnameSplit [len (fnameSplit) -1]
        
        if (extension in mimeType) :
            
            print (mimeType [extension])
            found = True    
            
        elif (extension.lower () in mimeType) :
            
            print (mimeType [extension.lower()])
            found = True
        
        elif (extension.upper () in mimeType) :
            
            print (mimeType [extension.upper()])
            found = True
            
    
    if (not found) :
        print ("UNKNOWN")
   
# Write an action using print
# To debug: print("Debug messages...", file=sys.stderr)
# For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
