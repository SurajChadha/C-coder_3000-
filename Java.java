/*Create an abstract base class emp that contains data members: name, salary and designation, phone. Include get and display functions in class and include an abstract function gorss_salary_cal which needs to be implemented in subclasses:
Manager: perks ---additional data member
Engineer: no_of_sites, no_of_workers
Accountant: no_of_accounts
Calculate the gross salary as given:
for manager, if no_of_hours >40, incentive of 5000 and increment in salary by 10% 
else salary is basic+ hra(10%)+ da(20%)+ 650
for engineer, if number of sites> 10, incentive of 100 per site added
else salary is basic+hra(5%)+da(12%)+200*/





import java.util.*;
abstract class Emp_N{
	String name, designation, phone;
	Scanner s1=new Scanner(System.in);
	double sal;
	void get() {
		System.out.println("enter name, deisgntaion, phone and salary");
		name=s1.next();
		designation=s1.next();
		phone=s1.next();
		sal=s1.nextDouble();
	}
	void display() {
		System.out.println("Name:"+name+"\nDesingation:"+designation+"\nphone:"+phone+"\n Salary:"+sal);
	}
	abstract void gross_sal_cal();
}
class Manager extends Emp_N{
	int perks, no_of_days;
	void gross_sal_cal() {
		//basic+ hra(10%)+ da(20%)+650+perks
		
		sal=sal+0.1*sal+0.2*sal+650+perks;
		if(no_of_days>40) {
			sal+=5000+0.1*sal;
		}
	}
	void get() {
		super.get();
		System.out.println("enter perks and number of days");
		perks=s1.nextInt();
		no_of_days=s1.nextInt();
	}
	void display() {
		super.display();
		System.out.println("perks:"+perks+"\n Nmber of days"+no_of_days);
	}
}







class Engineer extends Emp_N{
	int no_of_sites;
void gross_sal_cal() {
		//basic+hra(5%)+da(12%)+200
	sal=sal+0.05*sal+0.12*sal+200;
	if(no_of_sites>10) {
		int diff=no_of_sites-10;
		sal+=diff*100;
	}
	}
void get() {
	super.get();
	System.out.println("enter  number of sites");
	
	no_of_sites=s1.nextInt();
}
void display() {
	super.display();
	System.out.println("\n Nmber of sites"+no_of_sites);
}
}






class Accountant extends Emp_N{
	int no_of_accounts;
void gross_sal_cal() {
		//basic+hra(10%)+300
	sal+=0.1*sal+300;
	if(no_of_accounts>10) {
		int diff=no_of_accounts-10;
		sal+=diff*200;
	}
	}
void get() {
	super.get();
	System.out.println("enter  number of accounts");
	
	no_of_accounts=s1.nextInt();
}
void display() {
	super.display();
	System.out.println("\n Nmber of accounts"+no_of_accounts);
}
}






public class Emp_sal_ab
{
public static void main(String ar[]) {
	Scanner s1=new Scanner(System.in);
	Emp_N[] e1=new Emp_N[50];
	int i=0;
	while(true) {
		System.out.println("enter type of employeee \n 1. manager\n2. Engineer\n3. Accountant");
		int choice;
		choice=s1.nextInt();
		switch(choice) 
		{
		case 1: e1[i]=new Manager();
		e1[i].get();
		e1[i].gross_sal_cal();
		e1[i].display();
		break;
		case 2:e1[i]=new Engineer();
		e1[i].get();
		e1[i].gross_sal_cal();
		e1[i].display();
		break;
		case 3: e1[i]=new Accountant();
		e1[i].get();
		e1[i].gross_sal_cal();
		e1[i].display();
		break;
		}
		i++;
		System.out.println("want to enter another record y for yes and n for no");
		char ch;
		ch=s1.next().charAt(0);
		if(ch=='n')
			break;
	}
	}