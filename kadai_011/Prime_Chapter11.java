package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// 100までの整数が素数か判定するboolean型の配列を作成・代入
		boolean[] primeJudge = new boolean[100];
		

 
        for( int i = 2; i < 99; i++ ) {

       
            if( i % 2 <= 0 ) {
     
                continue;
            }

            System.out.println(i);
        }
    
}
}