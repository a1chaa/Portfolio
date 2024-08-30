import time

def moveTower(n, source, dest, temp):
    if(n <= 0):
        return

    moveTower(n-1, source, temp, dest)
    #print("Move disk", n, "from", source, "to", dest)
    moveTower(n-1, temp, dest, source)

def main():
    start = time.time()
    moveTower(28, "A", "C", "B")
    end = time.time()
    print("Time taken:", end-start)

main()
