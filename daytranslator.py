'''Translates a day from mm/dd/yyyy format to Month, Day Year
e.g. 05/24/2020 to May 24, 2020
by Prof. RM'''

def main():
    date = input("Enter the day in mm/dd/yyyy format: ")
    dates = date.split("/")
    #print(dates)
    day = dates[1]
    month = dates[0]
    year = dates[2]
    months = ["January", "February", "March", "April", "May", "June",
              "July", "August", "September", "October", "November", "December"]
    monthstr = months[int(month)-1]

    print(monthstr, day + ",", year)

main()
