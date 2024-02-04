package kadai_008;

public class Price_Chapter08 {
    public static void main(String[] args) {
    	//年代
    	int userAge = 30;
    	//料金
    	int serviceCost = 1;

        
        // 順位に応じた賞品名を取得
    	serviceCost = switch(userAge) {
            case 10  ->	1000; 
            case 20  -> 2000;
            case 30  -> 3000;
            case 40  -> 3000;
            case 50  -> 4000;
            case 60  -> 4000;
            case 70	 -> 4000;
            case 80  -> 5000;
            default  -> 5000;
        };

        
        System.out.println(userAge+"代の料金は"+serviceCost+"円");
    }
}
