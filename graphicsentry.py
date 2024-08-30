'''Shows getting input from a graphics Entry and getKey'''

from graphics import *

def main():
    win = GraphWin("Entry Demo", 500, 500)

    ent = Entry(Point(250,250), 10)
    ent.draw(win)

    k = win.getKey()
    print("You pressed the", k, "key!")

    win.getMouse()
    text = ent.getText()
    print("You entered", text)

main()
