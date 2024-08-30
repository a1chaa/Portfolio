"""Aichata Doumbia"""

import random  # Import the random module to generate random numbers

def random_walk_2d(n):
    x, y = 0, 0  # Initialize the coordinates of the starting point
    for _ in range(n):  # Repeat n times for the number of steps
        direction = random.random()  # Generate a random number between 0 and 1
        if direction < 0.25:  # If the random number is less than 0.25
            y += 1  # Move UP
        elif direction < 0.5:  # If the random number is less than 0.5
            x += 1  # Move RIGHT
        elif direction < 0.75:  # If the random number is less than 0.75
            y -= 1  # Move DOWN
        else:  # If the random number is greater than or equal to 0.75
            x -= 1  # Move LEFT
    return abs(x) + abs(y)  # Calculate the Manhattan Distance from the starting point

def main():
    random.seed(0)  # Set the seed for random number generation to ensure reproducibility
    walks = int(input("How many walks should I do? "))  # Ask the user for the number of walks
    steps = int(input("How many steps should I take on each? "))  # Ask the user for the number of steps per walk
    
    total_distance = 0  # Initialize the total distance
    for _ in range(walks):  # Repeat for the number of walks
        total_distance += random_walk_2d(steps)  # Perform a random walk and add its distance to the total
    
    avg_distance = total_distance / walks  # Calculate the average distance
    print(f"Average distance from start: {avg_distance:.2f}")  # Print the average distance with 2 decimal places

if __name__ == "__main__":
    main()
