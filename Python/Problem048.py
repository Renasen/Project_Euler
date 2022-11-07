sum = 0
i = 1
while i <= 1000:
    sum = sum + (i ** i)
    i = i + 1
string = str(sum)
print(string[-10:])
