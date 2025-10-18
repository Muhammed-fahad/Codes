s = "fahad"
l = len(s)
sp = " "
sp_o = -1
sp_i = l

for i in range(l):
  if (i < l//2):
    sp_o += 1
    sp_i -= 2
    print((sp*sp_o) + s[i]+ (sp*sp_i) + s[i])
  
  elif(i == l//2):
    print((sp*(l//2)) + s[i])
  
  else:
    print((sp*sp_o) + s[i]+ (sp*sp_i) + s[i])
    sp_o -= 1
    sp_i += 2