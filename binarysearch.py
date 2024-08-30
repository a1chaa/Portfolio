def binSearch(nums, x):
    '''seaches for x in the list nums
    returns i where nums[i] = x
    or -1 if x is not in nums'''
    low = 0
    high = len(nums) - 1
    while(low <= high):
        mid = (low + high)//2
        if(x == nums[mid]):
            return mid
        elif(x < nums[mid]):
            high = mid - 1
        elif(x > nums[mid]):
            low = mid + 1
    return -1 #x is not in the list

def recurBinSearch(nums, x):
    print("Searching for", x, "in", nums)
    if(len(nums) == 0):
        return -1
    if(len(nums) == 1):
        if(nums[0] == x):
            return 0
        else:
            return -1

    mid = len(nums)//2
    if(x == nums[mid]):
        return mid
    elif(x < nums[mid]):
        #x is earlier than mid
        #search for x in nums[0:mid]
        pos = recurBinSearch(nums[0:mid], x)
        return pos
    else:
        #x is later than mid
        #search for x in nums[mid+1:]
        pos = recurBinSearch(nums[mid+1:], x)
        pos = pos + mid + 1
        return pos

def recur(x):
    print(x)
    if(x > 0):
        recur(x-1)

def main():
    nums = []
    for i in range(1, 101):
        nums.append(i)
    x = 12
    pos = binSearch(nums, x)
    print(x, "is at position", pos, "in nums.")
    pos = recurBinSearch(nums, x)
    print(x, "is at position", pos, "in nums.")

main()
