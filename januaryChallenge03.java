package oprator;

import java.util.Scanner;

public class januaryChallenge03 {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			int t= sc.nextInt();
			while(t-->0)
			{
				int n=sc.nextInt();
				String str= sc.next();
				int c=0;
				int bin[]=new int[n];
				for(int i=0;i<str.length();i++) {
					bin[i] = str.charAt(i);
				}
				for(int i=0;i<n;i++) {
					if(bin[i]=='1'&&i%4==0)
					{
						c+=8;
					}
					if(bin[i]=='1'&&i%4==1)
					{
						c+=4;
					}
					if(bin[i]=='1'&&i%4==2)
					{
						c+=2;
					}
					if(bin[i]=='1'&&i%4==3)
					{
						c+=1;
					}
					if(i%4==3)
					{
						char d=(char)(97+c);
						c=0;
						System.out.println(d);
					}
				}
				
			}
		} catch (Exception e) {
		}
	}

}
