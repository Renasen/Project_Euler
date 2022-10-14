num = 1
fact = 100

while fact >= 1:
    num *= fact
    fact -= 1
    
arr = [int(x) for x in str(num)]
sum = 0
for i in arr:
    sum += i
    
print(sum)
