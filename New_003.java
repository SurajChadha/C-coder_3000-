import java.util.*;

public class Hotel_prog {
static Scanner s1=new Scanner(System.in);
	static Hotel_prog[] cust;
	static int n;
	String cust_name, hotel_name,cust_phone,cust_city, cust_room_type;
	int no_of_days;
	static void get() {
		System.out.println("enter number of customers");
		n=s1.nextInt();
		cust=new Hotel_prog[n];
		for(int i=0;i<n;i++) {
			cust[i]=new Hotel_prog();
			System.out.println("enter name, hotelname,phone, coty, roomtype(penta/superior/semidelux/delux) and number of days");
			cust[i].cust_name=s1.next();
			cust[i].hotel_name=s1.next();
			cust[i].cust_phone=s1.next();
			cust[i].cust_city=s1.next();
			cust[i].cust_room_type=s1.next();
			cust[i].no_of_days=s1.nextInt();
		}
		
	}
	static void display() {
		for(int i=0;i<n;i++) {
			System.out.println("Name:"+cust[i].cust_name+"\nHotel name:"+cust[i].hotel_name+"\nphone:"+cust[i].cust_phone+"\n City:"+cust[i].cust_city+"\nRoom type"+cust[i].cust_room_type+"\nDays of stay"+cust[i].no_of_days);
		}
	}

static void query1() {
		int bill=0;
		for(int i=0;i<n;i++) {
			if((cust[i].cust_room_type).equals("penta"))
			{
				bill=(4000+1000)*cust[i].no_of_days;
			}
			else if((cust[i].cust_room_type).equals("superioir"))
			{
				bill=(2000+1000)*cust[i].no_of_days;
			}
			else if((cust[i].cust_room_type).equals("semidelux"))
			{
				bill=(1500+500)*cust[i].no_of_days;
			}
			else if((cust[i].cust_room_type).equals("delux"))
			{
				bill=(1000+1000)*cust[i].no_of_days;
			}
			
			if(bill>10000) {
				System.out.println("Your Bill:"+bill);
				cust[i].display();
			}
			}
		}
	
static void query2() 
{
	int count_penta=0,count_delux=0,count_semi=0,count_superior=0;		
for(int i=0;i<n;i++) {
	if((cust[i].cust_room_type).equals("penta")) 
	{
		count_penta++;
	}
		else if((cust[i].cust_room_type).equals("superior"))
		{
			count_superior++;
		}
		else if((cust[i].cust_room_type).equals("semidelux"))
		{
			count_semi++;
		}
		else if((cust[i].cust_room_type).equals("delux"))
		{
			count_delux++;
		}
	}
System.out.println("\nNumber of customers opting for penta:"+count_penta+"\nNumber of cutomers opting for delux:"+count_delux+"\n Number of cutomers opting for semi delux:"+count_semi+"\n Number of cutomers opting for superior:"+count_superior);
	}



static void query3()
{
	Hotel_prog[] temp=cust;
for(int i=0;i<n;i++) {
	String str=temp[i].cust_city;
	if(str.equals(" "))
		continue;
	int count=1;
	for(int j=i+1;j<n;j++) {
		if((temp[j].cust_city).equals(str)) {
			count++;
			temp[j].cust_city=" ";
		}
	}
	System.out.println("Number of customers from"+str+" are:"+count);
}
	
}


public static void main(String ar[]) {
	get();
	while(true) {
	System.out.println("enter your choice \n 1. Bill comparison\n2. Count on room type\n 3. count on city");
	int choice=s1.nextInt();
	switch(choice) {
	case 1: query1();break;
	case 2: query2(); break;
	case 3: query3();break;
	}
	System.out.println("wnat to continue 1 for yes and 0 for no");
	int ch=s1.nextInt();
	if(ch==0)
		break;
	}
	}
}
