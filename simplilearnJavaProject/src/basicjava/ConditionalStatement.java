package basicjava;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter y/n:");
		char resp = s1.nextLine().charAt(0);
		if(resp == 'y'){
			System.out.println("you entered yes");
			
		}
		else {
			System.out.println("you enetred no");
		}
		
     s1.close();
     
	}

}
