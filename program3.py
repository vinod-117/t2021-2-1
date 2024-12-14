def generate_series(a):
    count = a if a % 2 != 0 else a - 1
    series = [2 * i + 1 for i in range(count)]
    return series

a = int(input("Enter a value for a: "))
result = generate_series(a)
print(", ".join(map(str, result)))
