import java.util.Scanner;
public class numberCheck{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		int[] numbers=new int[5];
		for(int i=0;i<5;i++){
			numbers[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<5;i++){
			if(numbers[i]>0){
				System.out.println(numbers[i]+" is positive");
				if(numbers[i]%2==0){
					System.out.println("Number is even");
				}
				else{
					System.out.println("Number is odd");
				}
			}
			else if(numbers[i]==0){
				System.out.println(numbers[i]+" is zero");
			}
			if(numbers[i]<0){
				System.out.println(numbers[i]+" is negative");
			}
		}
		sc.close();
	}
}
