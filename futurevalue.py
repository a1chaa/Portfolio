#futurevalue.py
#finds the future value of a bank account

def main():
    p = float(input("Enter starting principle: "))
    r = float(input("Enter the interest rate (as a percent): "))
    r = r/100
    years = int(input("Enter how many years you will accrue interest: "))

    money = p

    #each year, money = money * interest rate
    for i in range(years):
        money = money * (1 + r)

    print("After", years, "years, you will have", money, "dollars.")

main()
