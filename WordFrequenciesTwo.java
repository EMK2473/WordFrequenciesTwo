package WordFrequenciesTwo;

import java.util.Scanner; 

public class WordFrequenciesTwo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String input = scnr.nextLine();
      String[] stringArray = input.split(" ");
      int NUM_ELEMENTS = Integer.parseInt(stringArray[0]);

      System.out.println(NUM_ELEMENTS);

      for(int i = 1; i < stringArray.length; ++i) {
        System.out.println(stringArray[i]);
      }




      scnr.close();
   }
}
