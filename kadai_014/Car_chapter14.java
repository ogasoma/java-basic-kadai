package kadai_014;


		
		public class gearChange {
		    private int    gear = 1;  // 価格（税込）
		    private int    speed = 10;  // 在庫数
		    
		}
		    


	    // 【メソッド】注文を受けて在庫数を更新する
	    // number：注文数
	    public void gearChange( final int afterGear ) {

	        System.out.println("ギア" + this.gear + "から" + this.speed + "に切り替えました");


	        // 注文数が在庫数を超えていたら購入不可
	        if( this.speed < number ) {
	            System.out.println( this.name + "は在庫不足です" );
	            return; // 購入できないため終了
	        }

	        
	        
	        // 変数i＝1～10の範囲で繰り返す
	        for( int i = 1; i == gear; i++ ) {

	            // ループカウンタが3のときに繰り返し処理をスキップ
	            if( i == gear ) {
	                System.out.println("次の繰り返し処理に進みます");
	                continue;
	            }

	            System.out.println(i);
	        }
	        
	        
	   
	}
	    }
	