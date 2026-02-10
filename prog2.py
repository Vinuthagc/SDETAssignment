class Student:
    def __init__(self, name, grade, age):
        self.name = name
        self.grade = grade
        self.age = age
    def display(self):
        print("Name :", self.name)
        print("Grade:", self.grade)
        print("Age  :", self.age)


class School(Student):
    def __init__(self, name, grade, age):
        super().__init__(name, grade, age)


    def SchoolStudentDisplay(self):
        print("---- School Student Info ----")
        print("Name :", self.name)
        print("Grade:", self.grade)
        print("Age  :", self.age)


print("STUDENT DETAILS")
student1 = Student("Anu", "A", 14)
student1.display()

print("\nSCHOOL STUDENT DETAILS")
school_student = School("Vijay", "B", 15)
school_student.SchoolStudentDisplay()
