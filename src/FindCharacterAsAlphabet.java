
public class FindCharacterAsAlphabet {

	public static void main(String[] args) {
		char characterToBechecked = '&';
		
		char[] arrayOfAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i','j','k','l','m','n','o','p','q','r','s','t', 'u', 'v', 'w','x', 'y', 'z'};
		
		
		for(int i = 0; i < arrayOfAlphabet.length; i++) {
			if(arrayOfAlphabet[i] == characterToBechecked) {
				System.out.println(characterToBechecked + " given character is alphabet");
				break;
			} else {
				System.out.println(characterToBechecked + " given character is not alphabet");
				break;
			}
		}

	}

}
