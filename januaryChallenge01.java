package oprator;

import java.util.Scanner;

public class januaryChallenge01 {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			int t= sc.nextInt();
			while(t-->0)
			{
				int i=sc.nextInt();
				int nq=sc.nextInt();
				int d= sc.nextInt();
				int ansi=0;
				for(int j=0;j<i;j++)
				{
					int inputi=sc.nextInt();
					ansi=ansi+inputi;
				}
				//System.out.println(ansi);		
				if(ansi<nq) {
					System.out.println("0");
				}
				else {
				int ans=ansi/nq;
				if(d<ans)
				{
					System.out.println(d);
				}
				else {
					System.out.println(ans);
				}
				}
			}
		} catch (Exception e) {
		}

	}

}
