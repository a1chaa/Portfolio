def main():
    values = [127.08982, 1109.053214, 5, 63, 10001.73]
    for i in range(len(values)):
        print("Account", i, "has ${:8.2f}".format(values[i]))

main()
