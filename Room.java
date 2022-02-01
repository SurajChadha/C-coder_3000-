public class Student_array{
    
int name,roll no,phone,marks;
get(){
    System.out.println("Enter name,roll no,phone,marks");
    name = s1.name();
    rollno = s1.rollno();
    phone = s1.phone();
    marks = s1.marks();
}
display()
{
    System.out.println("name"+name+"phone no"+phone no+"roll no"+roll no+"marks"+marks);
}

    public static void main(String[] args) {
        int n = s1.nextInt();
        Student [] r= new Student[n];
        System.out.println("Enter no of rooms");
        for(int i=0;i<n;i++){
            r[i].newStudent();
            r[i].get();
            r[i].display();
            
        }
        for(int i=0;i<n;i++)
        {
            r[i].display();
        }
        
    }
}