#Aichata Doumbia

"""
Changes the list nums by squaring each entry and
replacing its original value.
"""
def square_each(nums):
    for i in range(len(nums)):
        nums[i] = nums[i] ** 2

"""
Returns the sum of the numbers in the passed-in list nums

"""
def sum_list(nums):
    return sum(nums)

"""
Prompts user for the number of integers n and then asks for
n integers, adding them to a list.
It returns the list of integers.

"""
def get_input():
    n = int(input("Enter n: "))
    nums = []
    for i in range(n):
        num = int(input("Enter a number: "))
        nums.append(num)
    return nums
"""
 Calls the get_input() method to get a list of numbers,
 then uses square_each() to square each number, and finally
 calculates the sum of the squared numbers using sum_list().
 It prints out the result.

"""


def main():
    nums = get_input()
    square_each(nums)
    total_sum = sum_list(nums)
    print("The sum of the squares of the numbers is", total_sum)


main()
