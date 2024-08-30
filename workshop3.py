import math
def main():



    #x=2
    #y=10
    #for j in range(0,y,x):
        #print(j, end="")
        #print(x+y)

    #ans=0
    #for i in range(1, 11):
       # ans=ans+i*i
       # print(i)
       # print(ans)


#print(int(3*10//3+10))
#integer division double slashes it rounds down to a whole number.
    """
3.
    a= int(input("What is a:"))
    b= int(input("What is b:"))
    c= int(input("What is c:"))

    s=(a+b+c)/2
    area=math.sqrt(s*(s-a)*(s-b)*(s-c))

    print(area)
    """
#4.
    n =int(input("Type in n: "))
    s= 0
    for i in range(1,n+1):
        s=n**3+s
        print("The cubed result  is " , s)
        print("the sum", s+s)




main()
