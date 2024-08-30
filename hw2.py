"""Aichata Doumbia, Homework 2: Numbers. Takes as input A and outputs estimated square root of A"""

import math

def main():

    print( "This program calculates the square root of a given number using the secant method.")
    A=int(input ("what is the number of which you want to calculate the square root of? " ))
    n=int(input("How many iterations do you want to use?"))

    x0=A/5
    x1=A/10

    # i is the number of iterations
    for i in range (1,n+1):
        math.sqrt(A)
        aprox = x0 - ((x0**2 - A)/(x0 + x1))
    #updating variables
    #simultaneous assignment x0 and approx are equal. and x1 & x0 are equal.This means their original values are assigned
        x0, x1 = aprox, x0
        Q=abs(x0- math.sqrt(A))
        print(i , aprox, Q, )
       
    print("My guess for the square root of:" , A, "is", aprox )
    print("The difference between my guess and the real result is", Q)

if  __name__ == '__main__' :
    main()
