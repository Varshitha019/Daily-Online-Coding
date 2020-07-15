1.Write a Python Program for Tower of Hanoi.


def TowerOfHanoi(n , source, destination, auxilliary):
    if n==1:
        print("Move disk 1 from source",source,"to destination",destination)
        return
    TowerOfHanoi(n-1, source, auxilliary, destination)
    print("Move disk",n,"from source",source,"to destination",destination)
    TowerOfHanoi(n-1, auxilliary, destination, source)
n = int(input('Enter no of disks:'))
TowerOfHanoi(n,'A','B','C') 
