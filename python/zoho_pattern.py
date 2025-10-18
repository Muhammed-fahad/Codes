arr = [4,4,4,4,4,4,4]
a , b , k = 0,7,arr[0]
print(arr)
for i in range(6):
  if i<3:
    k-=1
    a+=1
    b-=1
    for j in range(a,b):
      arr[j] = k      

  else:
      k+=1
      a-=1
      b+=1
      for j in range(a,b):
        arr[j] = k      
  print(arr)