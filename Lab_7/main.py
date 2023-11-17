import sys

nColumns = 0
arr = []
filler = ""

print("Length : ", end="")
nColumns = int(input())

arr = [['' for _ in range(nColumns)] for _ in range(nColumns)]

for i in range(0, nColumns, 2):
    arr[i] = ['' for _ in range(nColumns)]

print("\nSymbol : ", end="")
filler = input()

if len(filler) == 1:
    for j in range(nColumns):
        for i in range(0, nColumns, 2):
            arr[i][j] = filler
            print(arr[i][j] + "    ", end="")
        print("\n")
else:
    if len(filler) == 0:
        print("\n Your symbol is absent\n")
    else:
        print("\n Too much symbols\n")
