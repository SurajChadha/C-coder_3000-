/*Consider three String class objects. Split the strings in to three parts FIRST, MIDDLE AND LAST.
a) Check the length of each string. If the length is a multiple of 3, split the string in three equal parts
b) If length is not a multiple of 3 and remainder is one, split the string such that first and last portions are same length whereas the middle portion length is one less than the two other portions
c)  If length is not a multiple of 3 and remainder is two, split the string such that first and last portions are same length whereas the middle portion length is one more than the two other portions
Combine the strings in the order given below to generate the final string
Final string1=[FIRST of first string][MIDDLE of third string][LAST of second string]
Final string 2=[FIRST of second string][MIDDLE of first string][LAST of third string]
Final string 3=[FIRST of third string][MIDDLE of second string][LAST of third string]
Display all three final strings*/




import java.util.*;
public class String_prog_NEW {
	public static void main(String ar[]) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s1.next();
		int len=str.length();
		String first,middle,last;
		int n=len/3;
		if(len%3==0) {
			first=str.substring(0,n);
			middle=str.substring(n,n+n);
			last=str.substring(n+n,len);
			
		}
		else if(len%3==1) {
		
			first=str.substring(0,n);
			middle=str.substring(n,n+n+1);
			last=str.substring(n+n+1,len);
		}
		else {
			first=str.substring(0,n+1);
			middle=str.substring(n+1,n+1+n+1-1);
			last=str.substring(n+1+n+1-1,len);
		}
		System.out.println("First:"+first+"\nMiddle:"+middle+"\n Last:"+last);
		
	}
}





int len2=str2.length();
		int n2=len2/3;
		if(len2%3==0) {
			first3=str2.substring(0,n2);
			middle3=str2.substring(n2,n2+n2);
			last3=str2.substring(n2+n2,len2);
		}
		else if(len2%3==1) {
			first3=str2.substring(0,n2);
			middle3=str2.substring(n2,n2+n2+1);
			last3=str2.substring(n2+n2+1,len2);
		}
		else {
			first3=str2.substring(0,n2+1);
			middle3=str2.substring(n2+1,n2+1+n2+1-1);
			last3=str2.substring(n2+1+n2+1-1,len2);
		}
		System.out.println("First:"+first3+"\nMiddle:"+middle3+"\nLast:"+last3);
	
		String Final1="["+first+"]["+middle3+"]["+last2+"]";
		String final2="["+first2+"]["+middle+"]["+last3+"]";
		String final3="["+first3+"]["+middle2+"]["+last3+"]";
		
		System.out.println("First:"+Final1+"\nSecond:"+final2+"\nThird:"+final3);
	}
}




else {
			first[i]=str[i].substring(0,n+1);
			middle[i]=str[i].substring(n+1,n+1+n+1-1);
			last[i]=str[i].substring(n+1+n+1-1,len);
		}
		System.out.println("First:"+first[i]+"\nMiddle:"+middle[i]+"\nLast:"+last[i]);
		}
		

		String Final1="["+first[0]+"]["+middle[2]+"]["+last[1]+"]";
		String final2="["+first[1]+"]["+middle[0]+"]["+last[2]+"]";
		String final3="["+first[2]+"]["+middle[1]+"]["+last[2]+"]";
		
		System.out.println("First:"+Final1+"\nSecond:"+final2+"\nThird:"+final3);
	}
}