'''A use of the graphics.py library that creates a face
by Prof. RM'''

from graphics import *

def main():
    win = GraphWin()

    #making the eyes
    leftEye = Circle(Point(50,50), 20)
    leftEye.setFill("green")
    rightEye = leftEye.clone()
    rightEye.move(100, 0)
    leftEye.draw(win)
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
    noseTop = Point(100, 60)
    noseBottomLeft = Point(80, 110)
    noseBottomRight = Point(120, 110)
    noseLeftLine = Line(noseTop, noseBottomLeft)
    noseRightLine = Line(noseBottomLeft, noseBottomRight)
    noseLeftLine.draw(win)
    noseRightLine.draw(win)


main()
