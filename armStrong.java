
public class armStrong {

	public static void main(String[] args) {
		System.out.println("第一種算法");
		int armsN = 0;
		int a = 0, b = 0, c = 0;
		
		for(int i = 100; i<1000; i++) {
			a = i/100;
			b = (i-(100*a))/10;
			c = i%10;
			if((a*a*a + b*b*b + c*c*c) == i) {
				System.out.println(i);
			}
		}
		
	
			}		
		
		
			}
		
	
