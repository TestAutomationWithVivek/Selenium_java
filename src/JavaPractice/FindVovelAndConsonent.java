package JavaPractice;

import java.lang.invoke.SwitchPoint;

public class FindVovelAndConsonent {

	public static void main(String[] args) {
		char vovel = 'u';
		
		if('a' == vovel || 'e' == vovel || 'i' == vovel || 'o' == vovel || 'u' == vovel) {
			System.out.println("vovel");
		}else {
			System.out.println("consonent");
		}
		
		switch (vovel) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			System.out.println("vovel");
			break;

		default:
			System.out.println("consonent");
			break;
		}
			

	}

}
