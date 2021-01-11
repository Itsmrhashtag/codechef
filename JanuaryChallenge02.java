package oprator;
import java.util.*;
public class JanuaryChallenge02 {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			int t= sc.nextInt();
			while(t-->0)
			{
				int fv=sc.nextInt();
				int sv=sc.nextInt();
				int nv[]=new int[fv];
				int mv[]=new int[sv];
				int sum_fv=0;
				int sum_sv=0;
				for(int i=0;i<fv;i++)
				{
					nv[i]=sc.nextInt();
				}
				for(int i=0;i<sv;i++)
				{
					mv[i]=sc.nextInt();
				}
//				for(int e: nv)
//				{
//					System.out.print(e+" ");
//				}
				for(int i=0;i<fv;i++)
				{
					sum_fv=nv[i]+sum_fv;
				}
				for(int i=0;i<sv;i++)
				{
					sum_sv=mv[i]+sum_sv;
				}
				if(sum_fv>sum_sv) {
					System.out.println("0");
				}
				else {
					int temp=0,count=0,j=0;
					Arrays.sort(nv);
					Arrays.sort(mv);
					for(int i=0; i<mv.length/2; i++){
						  int tempo = mv[i];
						  mv[i] = mv[mv.length -i -1];
						  mv[mv.length -i -1] = tempo;
						}
						int jo=0,c=0;
						for(int f=0;f<fv;++f) {
							if(jo<sv) {
								sum_fv=sum_fv-nv[f]+mv[jo];
								sum_sv=sum_sv-mv[jo]+nv[f];
								int tempe;
								   tempe = nv[f];
								   nv[f] = mv[jo];
								   mv[jo] = tempe;
								   c++;
								   jo++;
								   if(sum_fv>sum_sv) {
									   break;
								   }
							}
						}
						System.out.println(c);
					
				}
				}
		} catch (Exception e) {
		}

	}

}
