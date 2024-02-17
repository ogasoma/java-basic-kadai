package kadai_017;

public class Kato_Chapter17 {
	public	String	familyName = "加藤";	//姓を表す
	public	String	givenName = "";	//名を表す
	public	String	address = "東京都中野区〇×";	//住所を表す

	public void commonIntroduce (){		//共通の紹介を出力する
		System.out.println("私の住所は" + address + "です");
	}
	public void eachIntroduce() {		//個別の紹介を出力する
		System.out.println("趣味は読書です");
	}
	public void execIntroduce() {		//紹介を実行する
	}	
}
