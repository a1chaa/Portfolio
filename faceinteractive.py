'''A use of the graphics.py library that creates a face, allows for clicking
by Prof. RM'''

from graphics import *

def main():
    win = GraphWin()

    #making the eyes
    leftEyeCenter = win.getMouse()
    leftEye = Circle(leftEyeCenter, 20)
    leftEye.setFill("green")
    leftEye.draw(win)
    
    rightEyeCenter = win.getMouse()
    rightEye = Circle(rightEyeCenter, 20)
    rightEye.setFill("green")
    rightEye.draw(win)

    #making the pupils
    leftPupil = Circle(leftEye.getCenter(), 5)
    leftPupil.setFill("black")
    rightPupil = Circle(rightEye.getCenter(), 5)
    rightPupil.setFill("black")
    leftPupil.draw(win)
    rightPupil.draw(win)

    #making the mouth
    mouth = Rectangle(Point(50, 130), Point(150, 170))
    mouth.setFill("pink")
    mouth.draw(win)

    #making the nose
    noseTop = win.getMouse()
    noseBottomLeft = win.getMouse()
    noseBottomRight = win.getMouse()
    noseLeftLine = Line(noseTop, noseBottomLeft)
    noseRightLine = Line(noseBottomLeft, noseBottomRight)
    noseLeftLine.draw(win)
    noseRightLine.draw(win)

    win.getMouse()
    win.close()


main()
