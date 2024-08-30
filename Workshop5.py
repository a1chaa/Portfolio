import math


"""
def main():

    print(do_math(3,7))
    print(do_math(8,4,3))





def do_math(x,y,z=5):
    result = (x+y)**z
    return result
    
main()

"""

"""

def cube(x):
    answer = x * x * x
    return answer
def main():
    answer = 4
    result = cube(3)
    print(answer, result)
main()
"""

"""
def sphereArea(radius):
    return 4 * math.pi * radius ** 2

def sphereVolume(radius):
    return (4/3) * math.pi * radius ** 3

def main():
    radius = float(input("Enter the radius of the sphere: "))
    area = sphereArea(radius)
    volume = sphereVolume(radius)
    print(" The area of the sphere is:" , area )
    print(" The volume of the sphere is:" , area)


main()

"""
def pizza_area(diameter):
    # Calculate the area of the pizza
    radius = diameter / 2
    area = math.pi * radius ** 2
    return area

def cost_per_square_inch(diameter, price):
    # Calculate the cost per square inch of the pizza
    area = pizza_area(diameter)
    cost_per_inch = price / area
    return cost_per_inch

def main():
    # Prompt the user for the diameter and price of the pizza
    diameter = float(input("Enter the diameter of the pizza (in inches): "))
    price = float(input("Enter the price of the pizza: $"))

    # Calculate the cost per square inch using the functions
    cost_per_inch = cost_per_square_inch(diameter, price)

    # Display the result
    print("Cost per square inch of the pizza: $", format(cost_per_inch, '.2f'))
main()
