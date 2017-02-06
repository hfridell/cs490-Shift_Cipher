package edu.umkc;

public class Main {


  public static void main(String[] args) throws Exception {
    // Right shift is positive
    int shift = -1;
  //  String text = "GOGOXDDYCOOKWYFSOVKCDGOOU";
    String text = "ABCXYZ";

    char[] ciphertext = text.toCharArray();
    char[] decodedText = ShiftCipher.decode(ciphertext, shift);
    System.out.println(decodedText);

    for (int k = 0; k < 26; k++) {
      decodedText = ShiftCipher.decode(ciphertext, k);
      System.out.println(decodedText);
    }
  }
}
