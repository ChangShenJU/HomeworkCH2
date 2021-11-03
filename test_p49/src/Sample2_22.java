
public class Sample2_22 {

	public static void main(String[] args) {
		int[][]test;
		test=new int[2][5];
		test[0][0]=56;
		test[0][1]=75;
		test[0][2]=89;
		test[0][3]=45;
		test[0][4]=77;
		test[1][0]=26;
		test[1][1]=85;
		test[1][2]=99;
		test[1][3]=100;
		test[1][4]=85;
		for(int i=0;i<test[0].length;i++) {
			System.out.println("第"+(i+1)+"個人的國語分數是"+test[0][i]+"分");
			System.out.println("第"+(i+1)+"個人的數學分數是"+test[1][i]+"分");
		}
		
		
		
		

	}

}
