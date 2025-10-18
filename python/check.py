class Students:
  empdb = {}
  eid = 101
  
  def __init__(self,ename,ephone):
    self.ename = ename
    self.ephone = ephone
    self.eid = Students.eid
    Students.empdb[self.eid] = self
    print(f"Student account is Created Succesfully with the id : {self.eid}")
    Students.eid += 1
    
  def checkStudentDetails(eid):
    student = Students.empdb.get(eid)
    if student:
      print("Name: " + student.ename)
      print("Phone: " + student.ephone)
    else:
      print("Student not found!")
        
  
def main():
  s = Students  
  while(True):
    print("New user press 1: ")
    print("Check Student details press 2: ")
    print("press 3 for break: ")
    
    choice = int(input("Enter a number: "))
    
    if(choice == 1):
      ename = input("Enter name: ")
      ephone = input("Enter a phone number: ")
      Students(ename,ephone)
      
    elif(choice == 2):
      eid = int(input("Enter Student id: "))
      s.checkStudentDetails(eid)
    
    else:
      break
      
  

if __name__ == "__main__":
  main()