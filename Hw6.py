#Aichata Doumbia
def main():
    # Ask for input date
    date_str = input("Please enter a date (m/dd/yyyy): ")
    
    # Parse date components
    month, day, year = map(int, date_str.split('/'))
    
    # Check if date is valid
    if is_valid_date(day, month, year):
        print("The date {} is valid.".format(date_str))
    else:
        print("The date {} is not valid.".format(date_str))

def is_valid_date(day, month, year):
    # Check if month is valid
    if month < 1 or month > 12:
        return False
    
    # Check if day is valid
    if day < 1:
        return False
    
    if month in [4, 6, 9, 11] and day > 30:
        return False
    
    if month == 2:
        if is_leap_year(year):
            if day > 29:
                return False
        elif day > 28:
            return False
    
    return True

def is_leap_year(year):
    # Check if the year is a leap year
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                return True
            return False
        return True
    return False

if __name__ == "__main__":
    main()
