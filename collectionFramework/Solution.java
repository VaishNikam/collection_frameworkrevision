//Q. Write a function that takes input an integer number and returns the sum of digits of that number.

//Test cases
//Input = 12 Output: "3"
//Input = 1234 Output: "10"
import java.util.Scanner;
class Solution{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number");
	 int num=sc.nextInt(); //12
	  //
	while(num>9){
		int sum=0;
		// num>9
		
	while(num>0){
		sum+=num%10; //2+1
		num=num/10;   //1 0
	}
	 num=sum;
 }
	System.out.println("Sum og digits="+sum); 
	
}
}