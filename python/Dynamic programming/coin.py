coins = [1,2,5]
amount = 18

coins = coins[::-1]
a = 0

c = []
while amount:
  if amount - coins[a] >= 0:
    amount = amount - coins[a]
    c.append(coins[a])
  
  else:
    a += 1
    
print(c)
    