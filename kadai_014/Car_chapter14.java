package kadai_014;

public class Car_chapter14 {
	private	int	gear ;	//ギア
	private	int	speed ;	//スピード

	Car_chapter14(int gear ,int speed){
		this. gear = gear;
		this. speed = speed;
	}
	
	public void gearChange(int afterGear) {
		System.out.println("ギア"+gear+"からギア"+afterGear+"に変わりました");
		speed = afterGear;
	}

	public void run() {
		switch( speed) {
        case 1 -> System.out.println("速度は時速10キロです");
        case 2 -> System.out.println("速度は時速20キロです");
        case 3 -> System.out.println("速度は時速30キロです");
        case 4 -> System.out.println("速度は時速40キロです");
        case 5 -> System.out.println("速度は時速50キロです");
      default   -> System.out.println("速度は時速10キロです");
	}
	}
}





	