import java.io.*;

public class asdf {

    public static final int MAX = 10;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inNum = br.readLine();
		int end = Integer.parseInt(inNum);
		int[] dp = new int[MAX];
        dp[0] = 0;
        dp[1] = 1;
        int height = 2;
        int temp;

		for(int i = 0; i < end; i++) {
			inNum = br.readLine();
            temp = Integer.parseInt(inNum);
            if(temp > height){    //일치하는 dp가 없는 경우
                for(int j = height; j < temp; j++){
                    dp[j] = dp[j-1] + get2sqrt(j-1);  
                }
                height = temp;
            }
            System.out.println(dp[temp-1]);
         }	
	}
	
    static int get2sqrt(int num){
        int a = 1;
        for(int i = 0; i < num; i++){
            a *= 2;
        }
        return a;
    }
	
}