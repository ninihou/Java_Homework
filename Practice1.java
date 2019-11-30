
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//請設計一隻Java程式,計算12,6這兩個數值的和與積
			int a, b;
			a = 12;
			b = 6;
			System.out.println(a + b);
			System.out.println(a * b);
			
		//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		    int c, d;
		    c = 200/12;
		    d = 200 % 12;
			System.out.println("200顆雞蛋為" + c + "打" + d + "顆");
			
		//請由程式算出256559秒為多少天、多少小時、多少分與多少秒	
			int day, hour, minute, second;
			day = 256559/(24*60*60);
			hour = (256559 - (24*60*60*day))/(60*60);
			minute = (256559 - (24*60*60*day) - (hour*60*60))/ 60;
			second = (256559 - (24*60*60*day) - (hour*60*60) - (minute*60));
			System.out.println(hour);
			System.out.println("256559秒為" + day + "天" + hour + "小時" + minute + "分" + second + "秒");
			
		//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
			double p1 = 3.1415;
			double r = 5.0;
			System.out.println("圓面積" + p1*r*r);
			System.out.println("圓面積" + p1*r*2);
			
		//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢
			//複利的計算公式是：S = P(1 + i)n次方，其中以符號I代表利息，P代表本金，n代表期數，i代表利率，S代表本利和。
			int n = 10;
			double p = 1500000.0;
			double i = 0.02;
			double s;
			
			for(int k = 0; k < n; k++) {
				
			}
			
			
			System.out.println("共" + s + "元");
			
			
			
		//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:	
			System.out.println(5 + 5); //兩個整數相加等於5
			System.out.println(5 + '5'); //'5'在unicode裡面的對應數字是53
			System.out.println(5 + "5"); //前面的5是數字，後面的5是文字
	}

}
