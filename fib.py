#fib.py
#calculates the n-th fibonacci number

def main():
    n = int(input("Enter n: "))

    nminus2 = 0 #stores the value of the n-2th fibonacci number
    nminus1 = 1 #stores the value of the n-1th fibonacci number

    curr = 0
    for i in range(n-1):
        curr = nminus2 + nminus1
        nminus2 = nminus1
        nminus1 = curr

    print("The " + str(n) + "th fibonacci number is", curr)

main()
