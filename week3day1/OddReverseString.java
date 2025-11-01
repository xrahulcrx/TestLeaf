public class OddReverseString {
	
	public static void main(String[] args) {
		String text = "I am a software tester";
		String[] words = text.split(" ");
		
		for(int i = 0; i < words.length; i++) {
			if(i%2 != 0) {
				String word = words[i];
				String rev = "";
				for(int j = word.length() - 1; j >= 0; j--) {
					rev = rev + word.charAt(j);
				}
				
				words[i] = rev;
			}
		}
		
		for(String w: words) {
			System.out.print(w +" ");
		}
		
	}

}
