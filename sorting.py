import random
import time

def mergeSort(nums):

    #print("Sorting", nums)
    if(len(nums) < 2):
        #list is already sorted
        return

    #split the list in half
    mid = len(nums)//2
    nums1 = nums[0:mid]
    nums2 = nums[mid:]

    #recursively sort the halves
    mergeSort(nums1)
    mergeSort(nums2)

    #print("Merging together", nums1, "and", nums2)
    #merge together the two sorted lists
    merge(nums1, nums2, nums)

def merge(nums1, nums2, nums):
    i = 0
    j = 0
    k = 0
    while (i < len(nums1) and j < len(nums2)):
        if(nums1[i] < nums2[j]):
            #add nums1[i] to nums
            nums[k] = nums1[i]
            i = i + 1
            k = k + 1
        else:
            #add nums2[j] to nums
            nums[k] = nums2[j]
            j = j + 1
            k = k + 1

    #add the rest of nums1 to nums
    while (i < len(nums1)):
        nums[k] = nums1[i]
        i = i + 1
        k = k + 1

    #add the rest of nums2 to nums
    while (j < len(nums2)):
        nums[k] = nums2[j]
        j = j + 1
        k = k + 1

def selectionSortRecur(nums, start):
    print(nums, start)

    if(start >= len(nums)-1):
        return nums
    
    smallest = start
    for i in range(start+1, len(nums)):
        if(nums[i] < nums[smallest]):
            smallest = i
    #swap smallest and start
    nums[smallest], nums[start] = nums[start], nums[smallest]
    return selectionSortRecur(nums, start + 1)


def selectionSort(nums):
    for i in range(len(nums)):
        #print(nums, i)
        smallest = i
        for j in range(i+1, len(nums)):
            if(nums[j] < nums[smallest]):
                smallest = j
        #swap smallest and i
        nums[i], nums[smallest] = nums[smallest], nums[i]

def partition(nums, low, high):
    pivot = nums[low]
    i = low
    for j in range(low+1, high+1):
        if(nums[j] < pivot):
            i = i + 1
            nums[i], nums[j] = nums[j], nums[i]
    nums[i], nums[low] = nums[low], nums[i]
    return i

def quickSort(nums, low, high):
    if(low < high):
        pos = partition(nums, low, high)
        
        #sort the list from low to pos -1
        quickSort(nums, low, pos-1)

        #sort the list from pos + 1 to high
        quickSort(nums, pos + 1, high)

def genList(n):
    '''makes a list of n random numbers and returns that list'''
    nums = []
    for i in range(n):
        x = random.randint(1, 1000000)
        nums.append(x)
    return nums

def timeSorts():
    nums = genList(100000)
    nums2 = nums.copy()

    #start = time.time()
    #selectionSort(nums)
    #end = time.time()
    #selsorttime = end - start

    start = time.time()
    mergeSort(nums2)
    end = time.time()
    mergesorttime = end - start

    start = time.time()
    quickSort(nums, 0, len(nums)-1)
    end = time.time()
    quicksorttime = end - start

    #print("Selection sort took", selsorttime, "seconds.")
    print("Merge sort took", mergesorttime, "seconds.")
    print("Quick sort took", quicksorttime, "seconds.")
    

def main():
    nums = [3, 7, 1, 2, 9, 6]
    print(nums)
    selectionSort(nums)
    print(nums)

    nums = [3, 7, 1, 2, 9, 6]
    print(nums)
    selectionSortRecur(nums, 0)
    print(nums)

    nums = [3, 7, 1, 2, 9, 6]
    print(nums)
    mergeSort(nums)
    print(nums)

timeSorts()
