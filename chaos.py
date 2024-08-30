#chaos.py
#displays a chaotic function

def main():
    x = float(input("Enter a number between 0 and 1: "))

    for i in range(10):
        print("i has value", i)
        x = 3.9 * x * (1 - x)
        print(x)

    print("The loop is over.")

main()
