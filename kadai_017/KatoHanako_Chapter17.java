package kadai_017;

//子クラス　加藤花子を表す
public class KatoHanako_Chapter17 extends Kato_Chapter17 {
	
	public void setGivenName(String name) {
		givenName = name;
	}
	
	public void execIntroduce() {
		System.out.println("名前は"+ familyName + givenName + "です");
		System.out.println("住所は"+ address + "です");
		eachIntroduce();
	}	
}