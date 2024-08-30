#classaverage.py
#calculates the average grade in the class

def main():
    students = int(input("How many students are in the class? "))
    totalgrade = 0

    #ask for each student's grade, and add it to totalgrade
    for i in range(students):
        grade = float(input(str(i+1)+": Enter the student's grade: "))
        totalgrade = totalgrade + grade

    average = totalgrade/students

    print("The class average is", average)

main()
