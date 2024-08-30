def findLargest(nums):
    '''return the largest element in the list nums'''

    if(len(nums) == 1):
        #if there's only one element in the list, it is the largest
        return nums[0]

    first = nums[0]
    large = findLargest(nums[1:])
    #either the largest element is the first element, or it's the largest
    #element in the rest of the list

    if(first > large):
        return first
    else:
        return large
    
def main():
    l1 = [1, 2, 3, 5, 8, 2, 0, 7]
    l2 = [5, 1, 3, 2, 3, 4]
    print(findLargest(l1))
    print(findLargest(l2))

main()

