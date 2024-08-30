
def fact(n):
    print("n =", n)
    if(n == 1):
        return 1
    answer = n * fact(n-1)
    return answer

def main():
    print(fact(5))
    print(fact(6))

main()
