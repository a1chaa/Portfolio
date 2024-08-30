'''graphingfuturevalue.py Graphs the value of compounded interest
by Prof. RM'''

from graphics import *

def main():
    win = GraphWin("Future Value", 725, 500)

    #making the labels
    label0 = Text(Point(50, 450), "0.0K")
    label25k = Text(Point(50, 350), "2.5K")
    label5k = Text(Point(50, 250), "5.0K")
    label75k = Text(Point(50, 150), "7.5K")
    label10k = Text(Point(50, 50), "10.0K")
    label0.draw(win)
    label25k.draw(win)
    label5k.draw(win)
    label75k.draw(win)
    label10k.draw(win)

    #making the y and x axis
    yaxis = Line(Point(100, 0), Point(100, 500))
    yaxis.draw(win)
    xaxis = Line(Point(100, 450), Point(725, 450))
    xaxis.draw(win)

    #making the bars
    years = int(input("How many years will you accrue interest? "))
    pixelperdollar = 400/10000
    columnwidth = 600/(years + 1)
    p = float(input("Enter the starting value: "))
    rate = float(input("Enter the interest rate: "))
    rate = rate/100

    left = 100
    right = left + columnwidth
    r = Rectangle(Point(left, 450 - p*pixelperdollar), Point(right, 450))
    r.setFill("green")
    r.draw(win)
    year0 = Text(Point((left+right)/2, 475), "0")
    year0.draw(win)

    money = p
    for i in range(years):
        win.getMouse()
        
        money = money * (1 + rate)
        left = right
        right = left + columnwidth
        r = Rectangle(Point(left, 450 - money*pixelperdollar), Point(right, 450))
        r.setFill("green")
        r.draw(win)
        year = Text(Point((left+right)/2, 475), str(i+1))
        year.draw(win)
    
    
    
    

main()
