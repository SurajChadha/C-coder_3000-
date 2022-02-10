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
				cust[i].display();
			}
			}
		}
	
void query2() {
		
	}
void query3() {
	
}
public static void main(String ar[]) {
	get();
	//display();
	query1();
}
}