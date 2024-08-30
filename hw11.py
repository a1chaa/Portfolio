'''Aichata Doumbia'''

def reverse(s):
    # Base case: if the string is empty or has only one character,
    # it is already reversed
    if len(s) <= 1:
        return s
    else:
        # Recursive case: reverse the substring excluding the first character
        # and concatenate the first character to the end
        return reverse(s[1:]) + s[0]

def main():
    # Ask the user for string input
    user_input = input("Enter the string to be reversed!: ")

    # Call the reverse function and print the reversed string
    reversed_string = reverse(user_input)
    print(f"{user_input} reversed is {reversed_string}")

# Call the main function to execute the program
if __name__ == "__main__":
    main()
