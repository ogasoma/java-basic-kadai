package kadai_017;
public class KatoExec_Chapter17 {
	public static void main(String[] args) {

	KatoTaro_Chapter17  KatoTaro= new  KatoTaro_Chapter17();
		KatoTaro.setGivenName("太郎");
		KatoTaro.commonIntroduce();
		KatoTaro.eachIntroduce();	
	
	KatoIchiro_Chapter17  Ichiro= new KatoIchiro_Chapter17();
		Ichiro.setGivenName("一郎");
		Ichiro.commonIntroduce();
		Ichiro.eachIntroduce();
	
	KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		hanako.setGivenName("花子");
		hanako.commonIntroduce();
		hanako.eachIntroduce();
	}

}
