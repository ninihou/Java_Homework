
public class Practice2 {
	public static void main(String[] args) {
		//1.請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
			int sum = 0;
			for(int i = 2; i <= 1000; i = i+2) {
		    	sum += i;
			}	System.out.println("1.Sum for even numbers between 1~1000 = " + sum);
		
		//2.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
			int multiply = 1;
			for(int i = 1; i<= 10; i++) {
				multiply = multiply*i;
			}
			System.out.println("2.連乘積 1~10 = "+ multiply);
	
		//3.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
			int multiply2 =1;
			int j = 1;
			while(j<= 10) {
				multiply2 = multiply2*j;
				j++;
			}
			System.out.println("3.連乘積 1~10 = "+ multiply2);
			
		//4.請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
			for(int k = 1; k<=10; k++) {
				//System.out.print(Math.pow(k,2) + " ");
				System.out.print(k*k + " ");
			}
			System.out.println();
		//5.阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
			int  count = 0;
			for(int lottery = 1; lottery<=49; lottery++) {
				if(lottery%10 != 4 && lottery< 40) {
					
				System.out.print(lottery + " ");
				count++;
				}
				
			}
			System.out.println("\t" + count + "個號碼可選"
					+ "");
			System.out.println();
		//6.
			for(int m = 10; m>0; m--) {
				for(int n = 1; n<=m; n++) {
					System.out.print(n);
				}
				System.out.println();
			}
		//7.
			char c ;
			for(int l = 1; l<=6; l++) {
				for(int g = 1; g<=l; g++) {
					
					switch(l) {
					case 1: 
						c = 'A';
						System.out.print(c);
						break;
					case 2:
						c = 'B';
						System.out.print(c);
						break;
					case 3:
						c = 'C';
						System.out.print(c);
						break;
					case 4:
						c = 'D';
						System.out.print(c);
						break;
					case 5:
						c = 'E';
						System.out.print(c);
						break;
					case 6:
						c = 'F';
						System.out.print(c);
						break;
				}
				
				
				
				
				
			}
				System.out.println();
	}
}}