package labtest;

import java.util.*;
public class evenprime {
	
	
	public void even(int even) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter No :");
		int number=sc.nextInt();
		if(num%2==0) {
			System.out.println("The Number Is even "+ number);
		}
		else{
			System.out.println("The Number Is Not even " + number);
			
			return;
		}
		
		
			
		
	}

	public void prime(int prime) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter No :");
		
		int num=sc.nextInt();
		  
		    int temp = 0;
		 
		    for (int i = 2; i <= number / 2; ++i) {
		      
		      if (num % i == 0) {
		        temp = temp +1;
		     
		        break;
		      }
		    }
		    if (temp==0)
		      System.out.println(number + " is a prime number.");
		    else
		      System.out.println(number + " is not a prime number.");
	}
}
