def series(a):
    temp = [2 * i + 1 for i in range(a)]
    return temp
a = int(input("Enter a value for a: "))
result = series(a)
print(", ".join(map(str, result)))