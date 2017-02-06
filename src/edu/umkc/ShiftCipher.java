package edu.umkc;
import static java.lang.Math.floorMod;

public class ShiftCipher {

  static char[] decode(char[] ciphertext, int shift) throws Exception {
    char[] decodedText = new char[ciphertext.length+1];

    for(int i=0; i< ciphertext.length; i++) {
      // Range Check
      char c = ciphertext[i];
      if (c >= 65 && c <= 90) {
        decodedText[i] = charShift(c, shift);
      } else {
        throw new Exception("Invalid Input");
      }
    }
    return decodedText;
  }

  private static char charShift(char c, int shift) {
    // 65 == ASCII A
    return (char) (floorMod(((c-65) + shift), 26) + 65);
  }
}
