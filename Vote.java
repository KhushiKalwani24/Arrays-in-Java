import java.util.Scanner;
public class Age{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array elements");
		int[] age= new int[10];
		for(int i=0;i<10;i++){
			age[i]= scanner.nextInt();
		}
		for(int i=0;i<10;i++){
			if(age[i]>18){
				System.out.println("Eligible to vote");
				System.out.println(age[i]);
			}
		}
		scanner.close();
	}
}
			
			
       