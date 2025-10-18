class create:
  def __init__(self , data , next = None):
    self.data = data
    self.next = next

def main():
  head = create(10,create(12,create(20,create(30))))
  print(printList(head))
  
def printList(head):
  current = head
  while(current):
    print(current.data , "--> " ,end="")
    current = current.next
  

if __name__ == "__main__":
  main()