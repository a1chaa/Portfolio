'''Calculates the class average by reading from a file
by Prof. RM'''

def main():
    infilename = input("Enter the file to read from: ")
    outfilename = input("Enter the file to write to: ")
    infile = open(infilename, "r")
    lines = infile.readlines()
    total = 0 #total is the total grade of all students grades
    #I've seen so far
    for i in range(len(lines)):
        total = total + int(lines[i])
    average = total/len(lines)
    infile.close()

    outfile = open(outfilename, "w")
    print("The class average is", average, file = outfile)
    outfile.close()

main()
