import java.util.Scanner;

public class caesarCipher {

	private static String alphabets = "abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.print("Text : ");
		String text = ip.nextLine();
		System.out.print("Shift : ");
		int shift = ip.nextInt();

		System.out.println("Do you want Encrypt or Decrypt : \n1.Encrypt \n2.Decrypt ");
		int ed = ip.nextInt();
		
		switch (ed) {

		case 1:
		    System.out.print("Encrypted text - ");
		    encrypt(text, shift);
			break;
		case 2:
		    System.out.print("Decrypted text -");
			decrypt(text, shift);
			break;
		
		}
}
	
	/**
	 * @param text
	 * @param shift
	 */
	public static void encrypt(String text, int shift) {

		String de = "";
		for (int i = 0; i < text.length(); i++) {
			int d = 0;
			if (Character.isWhitespace(text.charAt(i))) {
				de = de + ' ';
				continue;
			} else {
				d = (alphabets.indexOf(text.charAt(i)) + shift) % 26;

			}
			de = de + alphabets.charAt(d);

		}
		System.out.println(de);

	}

	public static void decrypt(String text, int shift) {
		String de = "";
		for (int i = 0; i < text.length(); i++) {

			int d = 0;
			int charPosition = alphabets.indexOf(text.charAt(i));

			if (Character.isWhitespace(text.charAt(i))) {
				de = de + ' ';
				continue;
			} else {
				if (charPosition > shift) {
					d = (charPosition - shift) % 26;
				} else {
					d = (26 + (charPosition - shift)) % 26;
				}

			}
			de = de + alphabets.charAt(d);
		}
		System.out.print(de);
	}

}
