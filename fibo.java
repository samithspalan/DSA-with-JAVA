import java.util.Scanner;
public class fibo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("enter a no");
		n=s.nextInt();
		int fib=find(n);
	  
	 System.out.println("fibnocci of"+n+" is "+fib);


		
	}
	public static int find(int n){
		 if(n==0){
			 return 0;
		 }
		 else if (n==1){
			 return 1;

		 }
		 else{
			 return find(n-1)+find(n-2);
		 }
	 }
}