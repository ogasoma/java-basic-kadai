package kadai_020;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		Dictionary_Chapter20 words = new Dictionary_Chapter20();
		
		String[] wordConfirmation = { "apple", "banana", "grape", "orange" };
		for (int i = 0; i < wordConfirmation.length; i++) {
            words.searchword(wordConfirmation[i]);
        }
		
	}
}