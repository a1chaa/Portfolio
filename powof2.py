
def powOf2(num):
    '''return true if num is a power of 2, False otherwise
    (power of 2, means num = 2 ^ x for some integer x)'''

    #num is a power of 2 if num/2 is 1, or num2 is even
    #otherwise, nums is not a power of 2

    if(num == 1 or num == 2):
        return True

    if(num % 2 == 1):
        #num is odd, so it can't be a power of 2
        return False
    else:
        nextnum = num//2
        #if nextnum is a power of 2, then num is, otherwise, num is not
        ans = powOf2(nextnum)
        return ans


def main():
    print(powOf2(7))
    print(powOf2(8))
    print(powOf2(1))
    print(powOf2(1000))

main()
