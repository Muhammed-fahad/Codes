def show(a):
  print(f"This is {a}")

names = ["Sheik" , "Sayira" , "Fahad", "Nadeem"]
names.remove("Sheik")
list(map(show,names))