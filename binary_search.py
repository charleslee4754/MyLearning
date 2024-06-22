def binary_search(arrInt, target):
    i, j = 0, len(arrInt) - 1
    while True:
        if i > j:
            return -1
        m = (i + j) >> 1
        if arrInt[m] == target:
            return m
        elif arrInt[m] > target:
            j = m - 1
        else:
            i = m + 1


if __name__ == '__main__':
    arrList = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    index = binary_search(arrList, 11)
    print(index)
