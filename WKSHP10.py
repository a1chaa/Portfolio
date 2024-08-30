"""
import random

def shuffle(myList):

    
   # This line creates a copy of the original list myList using list slicing (myList[:]).
    #Making a copy ensures that the original list remains unchanged during the shuffling process.
    
    shuffledList = myList[:]  # Create a copy of the original list to avoid modifying it

    #This line calculates the length of the list shuffledList and assigns it to the variable n.
    This length will be used in the subsequent loop to iterate over the elements of the list.
    n = len(shuffledList)


    #This line sets up a loop that iterates over the indices of the list in reverse order,
    #from n - 1 down to 1. It uses the range function with a step of -1 to achieve this.



    for i in range(n - 1, 0, -1):
        #This line generates a random integer j between 0 and i (inclusive).
        #This random integer will be used to select a random index in the list
        #to swap with the current index i.
        # Generate a random index between 0 and i (inclusive)
        j = random.randint(0, i)

        # Swap the elements at indices i and j
        shuffledList[i], shuffledList[j] = shuffledList[j], shuffledList[i]
    return shuffledList

# Example usage:
myList = [1, 2, 3, 4, 5]
print("Original list:", myList)

shuffledList = shuffle(myList)
print("Shuffled list:", shuffledList)

"""
def removeDuplicates(myList):
    uniqueList = []  # Initialize an empty list to store unique elements
    seen = set()     # Initialize an empty set to track seen elements

    for element in myList:
        if element not in seen:
            # If the element is not seen before, add it to the uniqueList and mark it as seen
            uniqueList.append(element)
            seen.add(element)

    return uniqueList

# Example usage:
myList = [1, 2, 2, 3, 4, 4, 5]
print("Original list:", myList)

uniqueList = removeDuplicates(myList)
print("List with duplicates removed:", uniqueList)


    
