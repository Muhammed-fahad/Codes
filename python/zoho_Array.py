arr = [1,2,3,4,5,6,7,8]
k = 5
l = 0

for i in range(len(arr)//k):
  a = l
  b = a+k-1
  while(a<b):
    arr[a] , arr[b] = arr[b] , arr[a]
    a+=1
    b-=1
  l+=k

if(len(arr)%k != 0):
  a = len(arr) - len(arr)%k
  b = len(arr) - 1
  while(a<b):
    arr[a] , arr[b] = arr[b] , arr[a]
    a+=1
    b-=1
  
print(arr)
