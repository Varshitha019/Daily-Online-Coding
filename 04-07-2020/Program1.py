1.Write a python Program to Create a Class which Performs Basic Calculator Operations.
Code:-
class cal():
    def __init__(self,a,b):
        self.a=a
        self.b=b
    def add(self):
        return self.a+self.b
    def mul(self):
        return self.a*self.b
    def div(self):
        return self.a/self.b
    def sub(self):
        return self.a-self.b
a=int(input("Enter first number: "))
b=int(input("Enter second number: "))
obj=cal(a,b)
choice=1
while choice!=0:
    print("0. Exit 1. Add 2. Subtraction 3. Multiplication 4. Division")
    choice=int(input("Enter choice: "))
    if choice==1:
        print("Result: ",obj.add())
    elif choice==2:
        print("Result: ",obj.sub())
    elif choice==3:
        print("Result: ",obj.mul())
    elif choice==4:
        print("Result: ",round(obj.div(),2))
    elif choice==0:
        print("Exiting!")
    else:
        print("Invalid choice!!")
print()
