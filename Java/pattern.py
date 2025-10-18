n = int(input("Enter the number: "))
star='*'
space=' '
spaceCount = (n//2)+1
starCout = 0
for i in range(n):
  if i<=n//2:
    spaceCount-=1
    starCout+=1
    print(space*spaceCount + star*starCout + star*(starCout-1))
  else:
    spaceCount+=1
    starCout-=1
    print(space*spaceCount + star*starCout + star*(starCout-1))
