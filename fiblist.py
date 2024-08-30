'''calculates the n-th Fibonacci number using a list
by Prof. RM'''

def main():
    n = int(input("What Fibonacci number do you want to calculate? "))

    fib = [0, 1]

    for i in range(2, n+1):
        print(fib)
        nextfib = fib[i-2] + fib[i-1]
        fib.append(nextfib)
    print(fib)
    print("The " + str(n) + "-th Fibonacci number is", fib[n])

main()
