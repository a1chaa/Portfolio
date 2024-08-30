#Aichata Doumbia

def get_input():
    while True:
        try:
            # Prompt user to input the number of integers in the list
            n = int(input("Enter the number of integers in the list: "))

            nums = []  # Initialize an empty list to store integers

            # Loop through each integer input by the user
            for i in range(n):
                while True:
                    try:
                        # Prompt user to input an integer
                        num = input("Enter an integer : ")
                        num = int(num)  # Convert input to integer
                        nums.append(num)  # Add the integer to the list
                        break  # Exit the loop if the input is valid
                    except ValueError:
                        print("Bad input!")  # Print error message for invalid input
            while True:
                try:
                    # Prompt user to input the target number
                    target = input("Enter the target number: ")
                    target = int(target)  # Convert input to integer
                    return nums, target  # Return the list of integers and the target number
                except ValueError:
                    print("Bad input!")  # Print error message for invalid input
                    # Prompt for the target number again if input is invalid

        except ValueError:
            print("Bad input!")  # Print error message for invalid input

def sum_to_k(nums, k):
    count = 0  # Initialize a counter for pairs that sum to the target
    # Iterate through each pair of integers in the list
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            # Check if the sum of the pair equals the target
            if nums[i] + nums[j] == k:
                count += 1  # Increment the counter if the condition is met
    return count  # Return the count of pairs that sum to the target

def main():
    nums, target = get_input()  # Call the get_input function to get user input
    pairs_count = sum_to_k(nums, target)  # Call the sum_to_k function to calculate pairs count
    print(f"{pairs_count} pairs sum to {target}")  # Print the result

if __name__ == "__main__":
    main()  




