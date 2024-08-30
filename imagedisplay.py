from graphics import *

def main():
    win = GraphWin("Surprise!", 1000, 1000)
    p = Point(500, 500)
    pic = Image(p, "surprise.png")
    pic.draw(win)

main()
