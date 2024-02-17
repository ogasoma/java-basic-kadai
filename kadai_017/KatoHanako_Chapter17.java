package kadai_017;
public class KatoHanako_Chapter17 extends Kato_Chapter17 {

	public void	setGivenName(String name) {
		this.givenName = name ;
		System.out.println("名前は"+familyName+name+"です");
		}
			
	public void eachIntroduce() {		//個別の紹介を出力する
		System.out.println("趣味は読書です");
		}		
}
