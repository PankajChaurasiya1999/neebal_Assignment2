package neebalDay2;
import java.util.Scanner;
public class Testcase3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("lower=");
		int l=sc.nextInt();
		System.out.println("upper=");
		int u=sc.nextInt();
		
		int n1=0,n2=1,n3;
		while(n1<=u) {
			if(n1>=l) {
				System.out.println(n1);
			}
		
		
			 n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}

}	

