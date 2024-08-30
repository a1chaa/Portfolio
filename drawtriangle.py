from graphics import *

def main():
    win = GraphWin("Triangle", 500, 500)

    p1 = win.getMouse()
    p1.draw(win)
    p2 = win.getMouse()
    p2.draw(win)
    p3 = win.getMouse()
    p3.draw(win)

    t = Polygon(p1, p2, p3)
    t.draw(win)

main()
