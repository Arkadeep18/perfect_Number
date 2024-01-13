import java.util.*;
public class AssgnQ5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int a=1;a<n;a++) {
			if(n%a==0) {		
				sum = sum + a;
			}
		}
		if(n==sum) {
			System.out.println(n+" is a perfect number");
		}else {
			System.out.println(n+" is a not perfect number");
		}

	}

}
