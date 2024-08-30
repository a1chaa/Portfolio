# File: chaos.py
# A simple program illustrating chaotic behavior.
#Aichata Doumbia
def main():
    
    print("This program illustrates a chaotic function")
    n = int(input("How many numbers should I print? "))
    x = float(input("Enter a number between 0 and 1: "))
    for n in range(10):
        x = 3.9 * x * (1 - x)
        print(x)

if __name__ == "__main__":
    main()

