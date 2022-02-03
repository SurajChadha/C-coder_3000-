import java.util.*;
public class Student_Array {
String name,roll_no,phone;
double avg,percentage;
int mark[]=new int[5];
static Scanner s1=new Scanner(System.in);
void get() {
	System.out.println("Enter name , rollno and phone");
	name=s1.next();
	roll_no=s1.next();
	phone=s1.next();
	System.out.println("enter marks in 5 subjects");
	for(int i=0;i<5;i++) {
		mark[i]=s1.nextInt();
	}
}
void average() {
	int sum=0;
	for(int i=0;i<5;i++) {
		sum+=mark[i];
	}
	avg=sum/5;
}
void percentage() {
	int sum=0;
	for(int i=0;i<5;i++) {
		sum+=mark[i];
	}
	percentage=(sum/500)*100;
}
void display() {
	System.out.println("Name:"+name+"Rollno:"+roll_no+"Phone:"+phone+"\nAverage:"+avg+"\npercentage:"+percentage);
}




public static void main(String ar[]) {
	System.out.println("enter number fo students");
	int n=s1.nextInt();
	Student_Array[] st=new Student_Array[n];
	for(int i=0;i<n;i++) {
		st[i]=new Student_Array();
		st[i].get();
		st[i].average();
		st[i].percentage();
		st[i].display();
	}
  //new code
  for(int i=0; i<=n; i++)
  {
     i = i + 1;
     temp = i;
     i = temp -1;
  }
  System.out.println("The largeat element"+i);
	//largest in array and smallest in array
}
}