package kadai_014;

public class Car_chapter14 {
	private	int	gear = 1;	//ギア
	private	int	speed = 10;	//スピード

	
	public void gearChange(int afterGear) {
		 gear = afterGear;
		 speed = switch (gear) { 
		 	case 1 -> 10;
		 	case 2 -> 20;
		 	case 3 -> 30;
		 	case 4 -> 40;
		 	default -> 10; 
		 };
	}
	public void run() {
		System.out.println("ギア1からギア"+gear+"に変わりました");
		System.out.println("速度は" + speed + "kmです");
	}

}

