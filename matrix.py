
class Matrix:
    def __init__(self, values):
        '''Defines a matrix, given a 2D list of values'''
        self.values = values

    def getValues(self):
        return self.values

    def getRows(self):
        '''return the number of rows in the matrix'''
        return len(self.values)

    def getCols(self):
        '''return the number of columns in the matrix'''
        return len(self.values[0])

    def __repr__(self):
        s = ""
        for i in range(len(self.values)):
            curr = self.values[i]
            for j in range(len(curr)):
                s = s + str(curr[j]) + " "
            s = s + "\n"
        return s

    def __add__(self, other):
        '''add together self and other'''
        #if a + b = c, then c[i][j] = a[i][j] + b[i][j]
        newvals = []
        for i in range(len(self.values)):
            row = []
            for j in range(len(self.values[i])):
                row.append(self.values[i][j] + other.values[i][j])
            newvals.append(row)
        newm = Matrix(newvals)
        return newm

    def __sub__(self, other):
        '''subtract other from self'''
        #if a - b = c, then c[i][j] = a[i][j] - b[i][j]
        newvals = []
        for i in range(len(self.values)):
            row = []
            for j in range(len(self.values[i])):
                row.append(self.values[i][j] - other.values[i][j])
            newvals.append(row)
        newm = Matrix(newvals)
        return newm

    def __mul__(self, other):
        '''multiply self and other together
        assume the matrices are equal dimensions'''
        # if c = a * b, then c[i][j] = a[i][0] * b[0][j] +
        # a[i][1] * b[1][j] + ... + a[i][(last element)] * b[(last element)][j]

        newvals = []
        for i in range(len(self.values)):
            row = []
            for j in range(len(self.values[i])):
                total = 0
                # multiply self row i with other column j
                for k in range(len(self.values[i])):
                    total = total + self.values[i][k] * other.values[k][j]
                row.append(total)
            newvals.append(row)
        newm = Matrix(newvals)
        return newm


def main():
    vals = []
    vals.append([1, 2, 3])
    vals.append([0, 5, 8])
    vals.append([7, 11, 2])
    m = Matrix(vals)

    vals2 = []
    vals2.append([0, 5, 8])
    vals2.append([1, 4, 3])
    vals2.append([0, 0, 2])
    m2 = Matrix(vals2)
    
    print(m)
    print(m2)
    m3 = m + m2
    print(m3)
    m4 = m - m2
    m5 = m2 - m
    print(m4)
    print(m5)

    m6 = m * m2
    print(m6)

main()
