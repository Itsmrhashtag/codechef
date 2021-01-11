package oprator;

import java.util.Scanner;

public class JanuaryChallenge04 {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			int t= sc.nextInt();
			while(t-->0)
			{
				int n=sc.nextInt();
				int k=sc.nextInt();
				int x=sc.nextInt();
				int y=sc.nextInt();
				k%=4;
				if(x==y)
				{
					System.out.println(n+" "+n);
				}
				else
				{
					if(x>y) {
						switch(k)
						{
						case 0:System.out.println((x-y)+" "+"0");
						break;
						case 1:System.out.println(n+" "+(n-x+y));
						break;
						case 2:System.out.println((n-x+y)+" "+n);
						break; 
						case 3:System.out.println("0"+" "+(x-y));
						break;
						}
					}
					else {
						switch(k) {
						case 0:System.out.println("0"+" "+(y-x));
						break;
						case 1:System.out.println((x+n-y)+" "+n);
						break;
						case 2:System.out.println(n+" "+(x+n-y));
						break;   
						case 3:System.out.println((y-x)+" "+"0");
						break; 
						} 
					} 
				} 
			}                 
		}catch (Exception e) {      
			}   
  
	    	}
   
	}