def main():


    #name = input("Enter your name: ")
    #name_reversed = " "
    #for i in range(len(name) - 1, -1, -1):
        #name_reversed += name[i]
    #print("Reversed name:", name_reversed)




























    numlist=[4, 2, 7, 1, 3]
    print(numlist[2:3])
    print(numlist[0 : -3])



    numbers = []
    for i in range(5):
        number = float(input(f"Enter number {i + 1}: "))
        numbers.append(number)

    sum_of_numbers = sum(numbers)
    sum_of_squares = sum(x**2 for x in numbers)

    print(f"Sum of the numbers:" ,sum_of_numbers)
    print(f"Sum of the squares of the numbers:" ,sum_of_squares)












main()
