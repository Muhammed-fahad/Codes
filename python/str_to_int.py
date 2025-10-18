def StrToInt(value):
  is_negative = False
  if value[0] == '-':
    is_negative = True
    value = value[1:]
  
  result = 0
  for char in value:
    n = ord(char) - ord('0')
    if(n<0 or n>9):
      return ("Invalid")
    result = result*10+n
  return -result if is_negative else result

print(StrToInt("111234"))
print(StrToInt("-1134"))
print(StrToInt("134"))